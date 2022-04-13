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

        var stid = arrayOf(
            R.string.f3i1q1,
            R.string.f3i1s1,
            R.string.f3i1q2,
            R.string.f3i1s2,
            R.string.f3i1q3,
            R.string.f3i1q4,
            R.string.f3i1q5,

            R.string.f3i2q1,
            R.string.f3i2s1,
            R.string.f3i2q2,
            R.string.f3i2s2,
            R.string.f3i2q3,
            R.string.f3i2q4,
            R.string.f3i2q5,

                       R.string.f3i3q1,
                       R.string.f3i3s1,
                       R.string.f3i3q2,
                       R.string.f3i3s2,
                       R.string.f3i3q3,
                       R.string.f3i3q4,
                       R.string.f3i3q5,
            /*
                                 R.string.f3i4q1,
                                 R.string.f3i4s1,
                                 R.string.f3i4q2,
                                 R.string.f3i4s2,
                                 R.string.f3i4q3,
                                 R.string.f3i4q4,
                                 R.string.f3i4q5,

                                 R.string.f3i5q1,
                                 R.string.f3i5s1,
                                 R.string.f3i5q2,
                                 R.string.f3i5s2,
                                 R.string.f3i5q3,
                                 R.string.f3i5q4,
                                 R.string.f3i5q5,

                                 R.string.f3i6q1,
                                 R.string.f3i6s1,
                                 R.string.f3i6q2,
                                 R.string.f3i6s2,
                                 R.string.f3i6q3,
                                 R.string.f3i6q4,
                                 R.string.f3i6q5,

                                 R.string.f3i7q1,
                                 R.string.f3i7s1,
                                 R.string.f3i7q2,
                                 R.string.f3i7s2,
                                 R.string.f3i7q3,
                                 R.string.f3i7q4,
                                 R.string.f3i7q5,
                          */
        )
        when(c_id){
            0->{
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            1->{
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])

            }
            2->{
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            3->{
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            4->{
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            5->{
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            6->{
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            7->{
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            8->{
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
        }
        //tv.text="Fragment 3 ${msg.toString()}"
        return view
}}