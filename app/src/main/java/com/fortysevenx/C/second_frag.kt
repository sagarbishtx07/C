package com.fortysevenx.C

//import android.os.Bundle
import android.graphics.Color
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
class Second_fragment : Fragment(R.layout.fragment_second) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var opPos :Int=0;
        val view: View = inflater.inflate(R.layout.fragment_second,container,false)
        val tv = view.findViewById<View>(R.id.tvf2)as TextView
        val bundle = arguments
        val q_id = bundle!!.getInt("mText")
        tv.text="Fragment 2 ${q_id.toString()}"
        val q1 =view.findViewById<TextView>(R.id.q1)
        val q2 =view.findViewById<TextView>(R.id.q2)
        val q3 =view.findViewById<TextView>(R.id.q3)
        val q4 =view.findViewById<TextView>(R.id.q4)
        var headid=view.findViewById<TextView>(R.id.tvf2)
        var id = arrayOf(
            view.findViewById<TextView>(R.id.q1c1),
            view.findViewById<TextView>(R.id.q1c2),
            view.findViewById<TextView>(R.id.q1c3),
            view.findViewById<TextView>(R.id.q1c4),
            view.findViewById<TextView>(R.id.q2c1),
            view.findViewById<TextView>(R.id.q2c2),
            view.findViewById<TextView>(R.id.q2c3),
            view.findViewById<TextView>(R.id.q2c4),
            view.findViewById<TextView>(R.id.q3c1),
            view.findViewById<TextView>(R.id.q3c2),
            view.findViewById<TextView>(R.id.q3c3),
            view.findViewById<TextView>(R.id.q3c4),
            view.findViewById<TextView>(R.id.q4c1),
            view.findViewById<TextView>(R.id.q4c2),
            view.findViewById<TextView>(R.id.q4c3),
            view.findViewById<TextView>(R.id.q4c4),
        )
        var opList:ArrayList<Questions>?=quest.getQuest()
        var headList:ArrayList<CardDetails>?=Constants.getTV()
       // view.findViewById<TextView>(R.id.q1c1).setOnClickListener(this)
        for(i in 0..15){
            id[i].setOnClickListener{
selectedOV(i,opList,id,q_id);
            }
        }
       var (i1,i2,i3,i4) = listOf<Int>(-4,-3,-2,-1);
        var j=0;

        when(q_id){
            0->{

                j=q_id;
                headid.text=headList!![j].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques

                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;

                    id[i1].text = opList[j].opt1
                    id[i2].text = opList[j].opt2
                    id[i3].text = opList[j].opt3
                    id[i4].text = opList[j].opt4

                    j+=1;
                }
              // j+=1;
                /*

                id[5].text = opList!![1].opt1
                id[6].text = opList!![1].opt2
                id[7].text = opList!![1].opt3
                id[8].text = opList!![1].opt4

                id[9].text = opList!![2].opt1
                id[10].text = opList!![2].opt2
                id[11].text = opList!![2].opt3
                id[12].text = opList!![2].opt4

                id[13].text = opList!![3].opt1
                id[14].text = opList!![3].opt2
                id[15].text = opList!![3].opt3
                id[16].text = opList!![3].opt4
                */


            }
            1->{
                j=(4*q_id);
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques
                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList!![j].opt2
                    id[i3].text = opList!![j].opt3
                    id[i4].text = opList!![j].opt4
                    j+=1;
                }
            }
            2->{

                j=4*q_id;
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques

                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList!![j].opt2
                    id[i3].text = opList!![j].opt3
                    id[i4].text = opList!![j].opt4
                    j+=1;
                }

            }
            3->{

                j=4*q_id;
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques


                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList!![j].opt2
                    id[i3].text = opList!![j].opt3
                    id[i4].text = opList!![j].opt4
                    j+=1;
                }
            }
            4->{

                j=4*q_id;
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques

                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList!![j].opt2
                    id[i3].text = opList!![j].opt3
                    id[i4].text = opList!![j].opt4
                    j+=1;
                }
            }
            5->{

                j=4*q_id;
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques

                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList!![j].opt2
                    id[i3].text = opList!![j].opt3
                    id[i4].text = opList!![j].opt4
                    j+=1;
                }
            }
            6->{

                j=4*q_id;
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques

                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList!![j].opt2
                    id[i3].text = opList!![j].opt3
                    id[i4].text = opList!![j].opt4
                    j+=1;
                }
            }
            7->{

                j=4*q_id;
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques

                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList[j].opt2
                    id[i3].text = opList[j].opt3
                    id[i4].text = opList[j].opt4
                    j+=1
                }
            }
            8->{

                j=4*q_id;
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques

                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList[j].opt2
                    id[i3].text = opList[j].opt3
                    id[i4].text = opList[j].opt4
                    j+=1
                }
            }
            9->{
                j=4*q_id;
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques

                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList!![j].opt2
                    id[i3].text = opList!![j].opt3
                    id[i4].text = opList!![j].opt4
                    j+=1;
                }
            }
            10->{
                j=4*q_id;
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques

                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList!![j].opt2
                    id[i3].text = opList!![j].opt3
                    id[i4].text = opList!![j].opt4
                    j+=1;
                 }
            }
            11->{
                j=4*q_id;
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques

                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList!![j].opt2
                    id[i3].text = opList!![j].opt3
                    id[i4].text = opList!![j].opt4
                    j+=1;
                }}
            12->{
                j=4*q_id;
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques

                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList!![j].opt2
                    id[i3].text = opList!![j].opt3
                    id[i4].text = opList!![j].opt4
                    j+=1;
                }}
            13->{
                j=4*q_id;
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques

                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList!![j].opt2
                    id[i3].text = opList!![j].opt3
                    id[i4].text = opList!![j].opt4
                    j+=1;
                }}
            14->{
                j=4*q_id;
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques

                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList!![j].opt2
                    id[i3].text = opList!![j].opt3
                    id[i4].text = opList!![j].opt4
                    j+=1;
                }}
            15->{
                j=4*q_id;
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques

                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList!![j].opt2
                    id[i3].text = opList!![j].opt3
                    id[i4].text = opList!![j].opt4
                    j+=1;
                }}
            16->{
                j=4*q_id;
                headid.text=headList!![q_id].details
                q1.text= opList!![j].ques
                q2.text= opList[j+1].ques
                q3.text= opList[j+2].ques
                q4.text= opList[j+3].ques

                for(i in 0..3){
                    i1+=4;
                    i2+=4
                    i3+=4;
                    i4+=4;
                    id[i1].text = opList!![j].opt1
                    id[i2].text = opList!![j].opt2
                    id[i3].text = opList!![j].opt3
                    id[i4].text = opList!![j].opt4
                    j+=1;
                }}

        }
        return view

    }
fun selectedOV(i:Int,sol:ArrayList<Questions>?,tv:Array<TextView>,qid:Int)
{
if(i == sol!![4*qid+(i/4)].sol){
    tv[i].setTextColor(Color.parseColor("#FF03DAC5"))
}
else{
    tv[i].setTextColor(Color.parseColor("#FF0000"))
    }
}

}
//192.168.137.117 fe80::5bf8:5977:8ae1:1a2

