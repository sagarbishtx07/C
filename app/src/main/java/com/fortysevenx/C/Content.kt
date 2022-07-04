package com.fortysevenx.C

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.fortysevenx.C.databinding.ActivityContentBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class Content : AppCompatActivity() {
    private lateinit var binding:ActivityContentBinding
    private var idf:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =  ActivityContentBinding.inflate(layoutInflater)
        //]getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(binding.root)
        val id =intent.getIntExtra(Constants.ID,0)
        idf=id


        val firstFrag = First_fragment()
        val secondfrag = Second_fragment()
        val thirdfrag = Third_fragment()
        //val fragmanage = supportFragmentManager
        val mBundle = Bundle()
        mBundle.putInt("mText",id)
        //val fragtransac = fragmanage.beginTransaction()
        firstFrag.arguments = mBundle
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment,firstFrag)
            //addToBackStack(null)
            commit()
        }

   binding.bottomNavigationView.setOnItemSelectedListener {
       when(it.itemId){
           R.id.frag1 ->setCurrentFragment(firstFrag)
           R.id.frag2 ->setCurrentFragment(secondfrag)
           R.id.frag3 ->setCurrentFragment(thirdfrag)
       }
       true
   }
    }
    private fun setCurrentFragment(fragment:Fragment){
        val mBundle = Bundle()
        mBundle.putInt("mText",idf)
        fragment.arguments = mBundle
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment,fragment)
            //addToBackStack(null)
            commit()
        }
    }
}