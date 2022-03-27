package com.fortysevenx.C

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortysevenx.C.databinding.ActivitySplashScreenBinding

private lateinit var binding: ActivitySplashScreenBinding
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.icSs.alpha = 0F
        binding.icSs.animate().setDuration(1500).alpha(1f).withEndAction{
            val i =Intent(this,MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }



    }
}