package com.fortysevenx.C

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.fortysevenx.C.databinding.ActivityMainBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.tasks.Task
import com.google.android.play.core.review.ReviewInfo
import com.google.android.play.core.review.ReviewManager
import com.google.android.play.core.review.ReviewManagerFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var textlist: ArrayList<CardDetails>? = null
    lateinit var reviewInfo:ReviewInfo
    lateinit var mAdView : AdView

    lateinit var minter: InterstitialAd
    private var mInterstitialAd: InterstitialAd? = null
    private final var TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // var tb = binding.toolBar
        setSupportActionBar(findViewById(R.id.toolBar))
        setcards()
        val rate=findViewById<Button>(R.id.rate);
        val reviewManager: ReviewManager = ReviewManagerFactory.create(this)
        val requestReviewTask= reviewManager.requestReviewFlow()
        requestReviewTask.addOnCompleteListener { request ->
            if (request.isSuccessful) {
                // Request succeeded and a ReviewInfo instance was received
                reviewInfo= request.result
            } else {
                // Request failed
            }
        }
        rate.setOnClickListener {
            startreview(reviewManager)
        }


        MobileAds.initialize(this@MainActivity){}
        mAdView = findViewById<AdView>(R.id.adviewmain)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequest, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                Log.d(TAG, adError?.toString())
                mInterstitialAd = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {
                Log.d(TAG, "Ad was loaded.")
                mInterstitialAd = interstitialAd
            }
        })
    }

private fun startreview(reviewManager:ReviewManager){
    val flow = reviewManager.launchReviewFlow(this, reviewInfo)
    flow.addOnCompleteListener { _ ->
        Toast.makeText(this,"RATING DONE",Toast.LENGTH_SHORT).show()
        // The flow has finished. The API does not indicate whether the user
        // reviewed or not, or even whether the review dialog was shown. Thus, no
        // matter the result, we continue our app flow.
    }
}
    private fun setcards() {
        textlist = Constants.getTV()

        var tv = arrayOf(
            R.id.tv1,
            R.id.tv2,
            R.id.tv3,
            R.id.tv4,
            R.id.tv5,
            R.id.tv6,
            R.id.tv7,
            R.id.tv8,
            R.id.tv9,
            R.id.tv10,
            R.id.tv11,
            R.id.tv12,
            R.id.tv13,
            R.id.tv14,
            R.id.tv15,
            R.id.tv16,
            R.id.tv17
        )
        for (i in 0..16) {
            findViewById<TextView>(tv[i]).setOnClickListener {

               var intent =  Intent(this,Content::class.java)

                if (mInterstitialAd != null) {
                    mInterstitialAd?.show(this)
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.")
                }

                intent.putExtra(Constants.ID,i)
                startActivity(intent)
            }
            findViewById<TextView>(tv[i]).text = textlist!![i].details
        }
    }
}