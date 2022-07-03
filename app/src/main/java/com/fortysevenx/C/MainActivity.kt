package com.fortysevenx.C

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.fortysevenx.C.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var textlist: ArrayList<CardDetails>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // var tb = binding.toolBar
        setSupportActionBar(findViewById(R.id.toolBar))
        setcards()
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
                intent.putExtra(Constants.ID,i)
                startActivity(intent)
            }
            findViewById<TextView>(tv[i]).text = textlist!![i].details
        }
    }
}