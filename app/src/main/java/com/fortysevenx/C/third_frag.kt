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
        //tv.text="Fragment 3 ${msg.toString()}"
        return view
}}