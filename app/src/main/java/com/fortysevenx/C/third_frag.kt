package com.fortysevenx.C

//import android.os.Bundle
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [first_fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Third_fragment : Fragment(R.layout.fragment_third_fragment) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_third_fragment,container,false)
        //val tv = view.findViewById<View>(R.id.tvf3)as TextView
        val bundle = arguments
        val c_id = bundle!!.getInt("mText")
        var q1=view.findViewById<TextView>(R.id.q1)
        var q2=view.findViewById<TextView>(R.id.q2)
        var q3=view.findViewById<TextView>(R.id.q3)
        var q4=view.findViewById<TextView>(R.id.q4)
        var q5=view.findViewById<TextView>(R.id.q5)
        var s1=view.findViewById<TextView>(R.id.c1)
        var s2=view.findViewById<TextView>(R.id.c2)
        when(c_id){
            0->{
                q1.text=getString(R.string.f3i1q1)
                s1.text=getString(R.string.f3i1s1)
                q2.text=getString(R.string.f3i1q2)
                s2.text=getString(R.string.f3i1s2)
                q3.text=getString(R.string.f3i1q3)
                q4.text=getString(R.string.f3i1q4)
                q5.text=getString(R.string.f3i1q5)
            }
            1->{

            }
        }
        //tv.text="Fragment 3 ${msg.toString()}"
        return view
}}