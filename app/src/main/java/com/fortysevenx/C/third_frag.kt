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
        var heading=view.findViewById<TextView>(R.id.f3head)
        var f3topiclist:ArrayList<CardDetails>?=Constants.getTV()
        var st="Program on"
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

            R.string.f3i8q1,
            R.string.f3i8s1,
            R.string.f3i8q2,
            R.string.f3i8s2,
            R.string.f3i8q3,
            R.string.f3i8q4,
            R.string.f3i8q5,

            R.string.f3i9q1,
            R.string.f3i9s1,
            R.string.f3i9q2,
            R.string.f3i9s2,
            R.string.f3i9q3,
            R.string.f3i9q4,
            R.string.f3i9q5,

            R.string.f3i10q1,
            R.string.f3i10s1,
            R.string.f3i10q2,
            R.string.f3i10s2,
            R.string.f3i10q3,
            R.string.f3i10q4,
            R.string.f3i10q5,

            R.string.f3i11q1,
            R.string.f3i11s1,
            R.string.f3i11q2,
            R.string.f3i11s2,
            R.string.f3i11q3,
            R.string.f3i11q4,
            R.string.f3i11q5,

            R.string.f3i12q1,
            R.string.f3i12s1,
            R.string.f3i12q2,
            R.string.f3i12s2,
            R.string.f3i12q3,
            R.string.f3i12q4,
            R.string.f3i12q5,

            R.string.f3i13q1,
            R.string.f3i13s1,
            R.string.f3i13q2,
            R.string.f3i13s2,
            R.string.f3i13q3,
            R.string.f3i13q4,
            R.string.f3i13q5,

            R.string.f3i14q1,
            R.string.f3i14s1,
            R.string.f3i14q2,
            R.string.f3i14s2,
            R.string.f3i14q3,
            R.string.f3i14q4,
            R.string.f3i14q5,

            R.string.f3i15q1,
            R.string.f3i15s1,
            R.string.f3i15q2,
            R.string.f3i15s2,
            R.string.f3i15q3,
            R.string.f3i15q4,
            R.string.f3i15q5,

            R.string.f3i16q1,
            R.string.f3i16s1,
            R.string.f3i16q2,
            R.string.f3i16s2,
            R.string.f3i16q3,
            R.string.f3i16q4,
            R.string.f3i16q5,
            
            R.string.f3i17q1,
            R.string.f3i17s1,
            R.string.f3i17q2,
            R.string.f3i17s2,
            R.string.f3i17q3,
            R.string.f3i17q4,
            R.string.f3i17q5,

        )
        when(c_id){
            0->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText(" ")
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            1->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText(" ")
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])

            }
            2->{
                heading.setText("Let's start coding")
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            3->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText(st)
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            4->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText(st)
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            5->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText(st)
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            6->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText(st)
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            7->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText(st)
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            8->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText(st)
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            9->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText(st)
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            10->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText("More program on functions")
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            11->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText(st)
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            12->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText(st)
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            13->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText(st)
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            14->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText(st)
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            15->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText(st)
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            16->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText("ENUM and Typedef")
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])
            }
            17->{
                st="Program on "+f3topiclist!![c_id].details
                heading.setText("ENUM and Typedef")
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