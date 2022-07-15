package com.fortysevenx.C

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.fortysevenx.C.databinding.ActivityMainBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var textlist: ArrayList<CardDetails>? = null
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