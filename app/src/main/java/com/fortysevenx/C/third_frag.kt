package com.fortysevenx.C

//import android.os.Bundle
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.gms.ads.*
import com.google.android.gms.ads.rewarded.RewardItem
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback

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
    private lateinit var mRewardedVideoads: RewardedAd

    private var mRewardedAd: RewardedAd? = null
    private final var TAG = "MainActivity"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_third_fragment,container,false)
        //val tv = view.findViewById<View>(R.id.tvf3)as TextView
        val bundle = arguments
        val c_id = bundle!!.getInt("mText")

        if (container != null) {
            MobileAds.initialize(container.context) {}
        }
        var adRequest = AdRequest.Builder().build()

        if (container != null) {
            RewardedAd.load(container.context,"ca-app-pub-3940256099942544/5224354917", adRequest, object : RewardedAdLoadCallback() {
                override fun onAdFailedToLoad(adError: LoadAdError) {
                    Log.d(TAG, adError?.toString())
                    mRewardedAd = null
                }

                override fun onAdLoaded(rewardedAd: RewardedAd) {
                    Log.d(TAG, "Ad was loaded.")
                    Toast.makeText(container.context,"AD WAS LOADED",Toast.LENGTH_SHORT)
                    mRewardedAd = rewardedAd

                    mRewardedAd?.fullScreenContentCallback = object: FullScreenContentCallback() {
                        override fun onAdClicked() {
                            // Called when a click is recorded for an ad.
                            Log.d(TAG, "Ad was clicked.")
                        }

                        override fun onAdDismissedFullScreenContent() {
                            // Called when ad is dismissed.
                            // Set the ad reference to null so you don't show the ad a second time.
                            Log.d(TAG, "Ad dismissed fullscreen content.")
                            mRewardedAd = null
                        }

                        override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                            // Called when ad fails to show.
                            Log.e(TAG, "Ad failed to show fullscreen content.")
                            mRewardedAd = null
                        }

                        override fun onAdImpression() {
                            // Called when an impression is recorded for an ad.
                            Log.d(TAG, "Ad recorded an impression.")
                        }

                        override fun onAdShowedFullScreenContent() {
                            // Called when ad is shown.
                            Log.d(TAG, "Ad showed fullscreen content.")
                        }
                    }
                }
            })
        }

        var l1=view.findViewById<TextView>(R.id.ad1)
        var mark1=view.findViewById<TextView>(R.id.mark11)
        var ans1=view.findViewById<TextView>(R.id.ans1)
        var ans2=view.findViewById<TextView>(R.id.ans2)
        var ans3=view.findViewById<TextView>(R.id.ans3)
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
                l1.text=""
                ans1.text=""
                ans3.text=""
                mark1.text=""
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
                ans1.text=""
                ans3.text=""
                mark1.text=""

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
                l1.setOnClickListener {
                    if (mRewardedAd != null) {
                        activity?.let { it1 ->
                            mRewardedAd?.show(it1, OnUserEarnedRewardListener{rewardItem ->

                                ans1.text="    #include <stdio.h>\n" +
                                        "    void main()\n" +
                                        "    {\n" +
                                        "        printf(\" Hi My Name is JACK \\(●‿●)/\");\n" +
                                        "        printf(\"\\nI study in Hero Academy\");\n" +
                                        "    }\n" +
                                        "\n"

                                 ans2.text="\n#include <stdio.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    printf(\"2500 * 10 = %d\", 2500 * 10);\n" +
                                        "}"

                                ans3.text=""
                                mark1.text=""

                                var rewardAmount = rewardItem.amount
                                var rewardType = rewardItem.type

                            })
                        }
                    } else {
                        if (container != null) {
                            Toast.makeText(container.context,"Try Again",Toast.LENGTH_SHORT).show()
                        }
                    }
                }

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
                l1.setOnClickListener {
                    if (mRewardedAd != null) {
                        activity?.let { it1 ->
                            mRewardedAd?.show(it1, OnUserEarnedRewardListener{rewardItem ->
                                var rewardAmount = rewardItem.amount
                                var rewardType = rewardItem.type
                                ans1.text="#include <stdio.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    \n" +
                                        "    int a;\n" +
                                        "    float b;\n" +
                                        "    char c, d;\n" +
                                        "\n" +
                                        "    a = 37;\n" +
                                        "    b = 98.7;\n" +
                                        "    c = '3';\n" +
                                        "    d = 'A';\n" +
                                        "\n" +
                                        "    printf(\"%d\\n%0.1f\\n%c\\n%c\\n\", a, b, c, d);\n" +
                                        "\n" +
                                        "    // in %f you might have noticed 0.1 before f\n" +
                                        "    // change the value of 0.1 to 0.2, 0.3, 0.4 and see the output\n" +
                                        "}"
                                ans2.text="#include <stdio.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int a = 23;\n" +
                                        "    float b = 33.456;\n" +
                                        "    int c = a + b;\n" +
                                        "    printf(\"23+33.456 = %d\", c);\n" +
                                        "}"
                                ans3.text=""
                                mark1.text=""

                            })
                        }
                    } else {
                        if (container != null) {
                            Toast.makeText(container.context,"Try Again",Toast.LENGTH_SHORT).show()
                        }
                    }
                }

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
                l1.setOnClickListener {
                    if (mRewardedAd != null) {
                        activity?.let { it1 ->
                            mRewardedAd?.show(it1, OnUserEarnedRewardListener{rewardItem ->
                                var rewardAmount = rewardItem.amount
                                var rewardType = rewardItem.type
                                ans1.text="#include <stdio.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int a = 23;\n" +
                                        "    int b;\n" +
                                        "\n" +
                                        "    printf(\"Enter-: \\nnum1 \");\n" +
                                        "    scanf(\"%d\", &a);\n" +
                                        "    printf(\"num2 \");\n" +
                                        "    scanf(\"%d\", &b);\n" +
                                        "\n" +
                                        "    printf(\"\\na+b = %d\\n\", a + b);\n" +
                                        "    printf(\"\\na-b = %d\\n\", a - b);\n" +
                                        "    printf(\"\\na*b = %d\\n\", a * b);\n" +
                                        "    printf(\"\\na/b = %d\\n\", a / b);\n" +
                                        "}"
                                ans2.text=""
                                ans3.text=""
                                mark1.text=""

                            })
                        }
                    } else {
                        if (container != null) {
                            Toast.makeText(container.context,"Try Again/check network",Toast.LENGTH_SHORT).show()
                        }
                    }
                }

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

                l1.setOnClickListener {
                    if (mRewardedAd != null) {
                        activity?.let { it1 ->
                            mRewardedAd?.show(it1, OnUserEarnedRewardListener{rewardItem ->
                                var rewardAmount = rewardItem.amount
                                var rewardType = rewardItem.type
                                ans1.text="#include <stdio.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int a;\n" +
                                        "    printf(\"Enter number \");\n" +
                                        "    scanf(\"%d\", &a);\n" +
                                        "    if (a == 4 || a == 9 || a == 25 || a == 36 || a == 49)\n" +
                                        "        printf(\"YES\");\n" +
                                        "    else\n" +
                                        "        printf(\"NO\");\n" +
                                        "}"
                                ans2.text="#include <stdio.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int a;\n" +
                                        "    printf(\"Enter number \");\n" +
                                        "    scanf(\"%d\", &a);\n" +
                                        "    if (a == 3)\n" +
                                        "        printf(\"THREE\");\n" +
                                        "    else if (a == 4)\n" +
                                        "        printf(\"FOUR\");\n" +
                                        "    else if (a == 5)\n" +
                                        "        printf(\"FIVE\");\n" +
                                        "    else if (a == 6)\n" +
                                        "        printf(\"SIX\");\n" +
                                        "    else if (a == 7)\n" +
                                        "        printf(\"SEVEN\");\n" +
                                        "    else\n" +
                                        "        printf(\"Number not in between 2 and 8\");\n" +
                                        "}"
                                ans3.text=""
                                mark1.text=""

                            })
                        }
                    } else {
                        if (container != null) {
                            Toast.makeText(container.context,"Try Again",Toast.LENGTH_SHORT).show()
                        }
                    }
                }
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

                l1.setOnClickListener {
                    if (mRewardedAd != null) {
                        activity?.let { it1 ->
                            mRewardedAd?.show(it1, OnUserEarnedRewardListener{rewardItem ->
                                var rewardAmount = rewardItem.amount
                                var rewardType = rewardItem.type
                                ans1.text="#include <stdio.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int i;\n" +
                                        "    for (i = 1; i <= 10; i++)\n" +
                                        "        if (i % 2 != 0)\n" +
                                        "        {\n" +
                                        "            printf(\"25 * %d = %d\\n\", i, (25 * i));\n" +
                                        "        }\n" +
                                        "}"

                                ans2.text="#include <stdio.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int i = 1;\n" +
                                        "    printf(\"Even numbers between 0 and 51 are\");\n" +
                                        "    while (i < 51)\n" +
                                        "    {\n" +
                                        "        if (i % 2 == 0)\n" +
                                        "        {\n" +
                                        "            printf(\"%d\\n\", i);\n" +
                                        "        }\n" +
                                        "        i++;\n" +
                                        "    }\n" +
                                        "}"
                                ans3.text=""
                                mark1.text=""

                            })
                        }
                    } else {
                        if (container != null) {
                            Toast.makeText(container.context,"Try Again",Toast.LENGTH_SHORT).show()
                        }
                    }
                }
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

                l1.setOnClickListener {
                    if (mRewardedAd != null) {
                        activity?.let { it1 ->
                            mRewardedAd?.show(it1, OnUserEarnedRewardListener{rewardItem ->
                                var rewardAmount = rewardItem.amount
                                var rewardType = rewardItem.type
                                ans1.text="#include <stdio.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int i = 1;\n" +
                                        "    printf(\"Insert a number : \");\n" +
                                        "    scanf(\"%d\", &i);\n" +
                                        "    if (i % 5 == 0)\n" +
                                        "    {\n" +
                                        "        if (i % 2 == 0)\n" +
                                        "            printf(\"Even number divisible by 5\");\n" +
                                        "        else\n" +
                                        "            printf(\"Odd number divisible by 5\");\n" +
                                        "    }\n" +
                                        "    else\n" +
                                        "    {\n" +
                                        "        if (i % 2 == 0)\n" +
                                        "            printf(\"Even number not divisible by 5\");\n" +
                                        "        else\n" +
                                        "            printf(\"Odd number not divisible by 5\");\n" +
                                        "    }\n" +
                                        "}"
                                ans2.text="#include <stdio.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    char ch;\n" +
                                        "    int a, b;\n" +
                                        "    printf(\"a : \");\n" +
                                        "    scanf(\"%d\", &a);\n" +
                                        "    printf(\"b : \");\n" +
                                        "    scanf(\"%d\", &b);\n" +
                                        "    printf(\"Press :\\n\");\n" +
                                        "    printf(\"+ for addition\\n\");\n" +
                                        "    printf(\"- for subtraction\\n\");\n" +
                                        "    printf(\"* for multiplication\\n\");\n" +
                                        "    printf(\"/ for division\\n\");\n" +
                                        "    scanf(\" %c\", &ch);\n" +
                                        "    switch (ch)\n" +
                                        "    {\n" +
                                        "    case '+':\n" +
                                        "        printf(\"a + b = %d\", a + b);\n" +
                                        "        break;\n" +
                                        "\n" +
                                        "    case '-':\n" +
                                        "        printf(\"a - b = %d\", a - b);\n" +
                                        "        break;\n" +
                                        "\n" +
                                        "    case '*':\n" +
                                        "        printf(\"a * b = %d\", a * b);\n" +
                                        "        break;\n" +
                                        "\n" +
                                        "    case '/':\n" +
                                        "        printf(\"a / b = %d\", a / b);\n" +
                                        "        break;\n" +
                                        "\n" +
                                        "    default:\n" +
                                        "        break;\n" +
                                        "    }\n" +
                                        "}"
                                ans3.text=""
                                mark1.text=""

                            })
                        }
                    } else {
                        if (container != null) {
                            Toast.makeText(container.context,"Try Again",Toast.LENGTH_SHORT).show()
                        }
                    }
                }
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

                l1.setOnClickListener {
                    if (mRewardedAd != null) {
                        activity?.let { it1 ->
                            mRewardedAd?.show(it1, OnUserEarnedRewardListener{rewardItem ->
                                var rewardAmount = rewardItem.amount
                                var rewardType = rewardItem.type
                                ans1.text="#include <stdio.h>\n" +
                                        "void check(int a)\n" +
                                        "{\n" +
                                        "    if (a >= 0)\n" +
                                        "        printf(\"Positive value\");\n" +
                                        "    else\n" +
                                        "        printf(\"negative value\");\n" +
                                        "}\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int val;\n" +
                                        "    printf(\"Enter a value \");\n" +
                                        "    scanf(\"%d\", &val);\n" +
                                        "    check(val);\n" +
                                        "}"
                                ans2.text="#include <stdio.h>\n" +
                                        "int find_greatest(int a, int b, int c)\n" +
                                        "{\n" +
                                        "    if (a >= b && a >= c)\n" +
                                        "        return a;\n" +
                                        "    else if (b >= a && b >= c)\n" +
                                        "        return b;\n" +
                                        "    else\n" +
                                        "        return c;\n" +
                                        "}\n" +
                                        "\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int val1, val2, val3, gt;\n" +
                                        "    printf(\"Enter value1: \");\n" +
                                        "    scanf(\"%d\", &val1);\n" +
                                        "    printf(\"Enter value2: \");\n" +
                                        "    scanf(\"%d\", &val2);\n" +
                                        "    printf(\"Enter value3: \");\n" +
                                        "    scanf(\"%d\", &val3);\n" +
                                        "    gt = find_greatest(val1, val2, val3);\n" +
                                        "    printf(\"Biggest value is: %d\", gt);\n" +
                                        "}"
                                ans3.text="#include <stdio.h>\n" +
                                        "void nsquare(int n)\n" +
                                        "{\n" +
                                        "    int i;\n" +
                                        "    printf(\"Squares of first %d numbers are\\n\", n);\n" +
                                        "    for (i = 1; i <= n; i++)\n" +
                                        "    {\n" +
                                        "        printf(\"%d\\n\", i * i);\n" +
                                        "    }\n" +
                                        "}\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int n = 10;\n" +
                                        "    nsquare(n);\n" +
                                        "}"
                                mark1.text=""

                            })
                        }
                    } else {
                        if (container != null) {
                            Toast.makeText(container.context,"Try Again",Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
            9->{
                st="Program on Pointers and swapping(changing position)"
                heading.setText(st)
                q1.text=getString(stid[(c_id*7)])
                s1.text=getString(stid[(c_id*7)+1])
                q2.text=getString(stid[(c_id*7)+2])
                s2.text=getString(stid[(c_id*7)+3])
                q3.text=getString(stid[(c_id*7)+4])
                q4.text=getString(stid[(c_id*7)+5])
                q5.text=getString(stid[(c_id*7)+6])

                l1.setOnClickListener {
                    if (mRewardedAd != null) {
                        activity?.let { it1 ->
                            mRewardedAd?.show(it1, OnUserEarnedRewardListener{rewardItem ->
                                var rewardAmount = rewardItem.amount
                                var rewardType = rewardItem.type
                                ans1.text="#include <stdio.h>\n" +
                                        "\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int a;\n" +
                                        "    float b;\n" +
                                        "    char c;\n" +
                                        "    printf(\"Enter an int value: \");\n" +
                                        "    scanf(\"%d\", &a);\n" +
                                        "    printf(\"Enter a float value: \");\n" +
                                        "    scanf(\"%f\", &b);\n" +
                                        "    printf(\"Enter a char value: \");\n" +
                                        "    scanf(\" %c\", &c);\n" +
                                        "    printf(\"Address of each of them is:\\n\");\n" +
                                        "    printf(\"a: %d\\nb: %d\\nc: %d\", &a, &b, &c);\n" +
                                        "}\n"

                                ans2.text="#include <stdio.h>\n" +
                                        "\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int a, b;\n" +
                                        "    char c;\n" +
                                        "    printf(\"Enter 1sr int value: \");\n" +
                                        "    scanf(\"%d\", &a);\n" +
                                        "    printf(\"Enter 2nd int value: \");\n" +
                                        "    scanf(\"%d\", &b);\n" +
                                        "    printf(\"Enter a char value: \");\n" +
                                        "    scanf(\" %c\", &c);\n" +
                                        "    a = a + b;\n" +
                                        "    b = a - b;\n" +
                                        "    a = a - b;\n" +
                                        "    printf(\"a: %d\\nb: %d\\nc: %c\\n\", a, b, c);\n" +
                                        "}\n"
                                mark1.text=""

                            })
                        }
                    } else {
                        if (container != null) {
                            Toast.makeText(container.context,"Try Again",Toast.LENGTH_SHORT).show()
                        }
                    }
                }
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

                l1.setOnClickListener {
                    if (mRewardedAd != null) {
                        activity?.let { it1 ->
                            mRewardedAd?.show(it1, OnUserEarnedRewardListener{rewardItem ->
                                var rewardAmount = rewardItem.amount
                                var rewardType = rewardItem.type
                                ans1.text="#include <stdio.h>\n" +
                                        "void checkprime(int n)\n" +
                                        "{\n" +
                                        "    int i = 2, c = 0;\n" +
                                        "    while (i < n)\n" +
                                        "    {\n" +
                                        "        if (n % i == 0)\n" +
                                        "        {\n" +
                                        "            c++;\n" +
                                        "        }\n" +
                                        "        i++;\n" +
                                        "    }\n" +
                                        "    if (c < 1 && n != 1)\n" +
                                        "        printf(\"Prime Number\");\n" +
                                        "    else\n" +
                                        "        printf(\"Not a prime number\");\n" +
                                        "}\n" +
                                        "\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int n;\n" +
                                        "    printf(\"Enter number: \");\n" +
                                        "    scanf(\"%d\", &n);\n" +
                                        "    checkprime(n);\n" +
                                        "}\n"
                                ans2.text="#include <stdio.h>\n" +
                                        "int *biggest(int *a, int *b, int *c)\n" +
                                        "{\n" +
                                        "    if (*a > *b && *a > *c)\n" +
                                        "        return a;\n" +
                                        "    else if (*b > *a && *b > *c)\n" +
                                        "        return b;\n" +
                                        "    else\n" +
                                        "        return c;\n" +
                                        "}\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int a, b, c;\n" +
                                        "    int *big;\n" +
                                        "    printf(\"value1 : \");\n" +
                                        "    scanf(\"%d\", &a);\n" +
                                        "    printf(\"value2 : \");\n" +
                                        "    scanf(\"%d\", &b);\n" +
                                        "    printf(\"value3 : \");\n" +
                                        "    scanf(\"%d\", &c);\n" +
                                        "    big = biggest(&a, &b, &c);\n" +
                                        "    printf(\"Biggest value is: %d\", *big);\n" +
                                        "}"
                                mark1.text=""

                            })
                        }
                    } else {
                        if (container != null) {
                            Toast.makeText(container.context,"Try Again",Toast.LENGTH_SHORT).show()
                        }
                    }
                }
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

                l1.setOnClickListener {
                    if (mRewardedAd != null) {
                        activity?.let { it1 ->
                            mRewardedAd?.show(it1, OnUserEarnedRewardListener{rewardItem ->
                                var rewardAmount = rewardItem.amount
                                var rewardType = rewardItem.type
                                ans1.text="#include <stdio.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    char s[20];\n" +
                                        "    printf(\"Enter Your full Name: \");\n" +
                                        "    scanf(\"%[^\\n]%*c\", s);\n" +
                                        "    printf(\"Name: %s\", s);\n" +
                                        "}"
                                ans2.text="#include <stdio.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int a[10], i;\n" +
                                        "    printf(\"Enter 10 values in the array:\\n \");\n" +
                                        "    for (i = 0; i < 10; i++)\n" +
                                        "    {\n" +
                                        "        printf(\"%d.\\t\", (i + 1));\n" +
                                        "        scanf(\"%d\", &a[i]);\n" +
                                        "    }\n" +
                                        "    printf(\"\\nEven values are: \");\n" +
                                        "    for (i = 0; i < 10; i++)\n" +
                                        "    {\n" +
                                        "        if (a[i] % 2 == 0)\n" +
                                        "            printf(\"%d\\t\", a[i]);\n" +
                                        "    }\n" +
                                        "}"
                                mark1.text=""

                            })
                        }
                    } else {
                        if (container != null) {
                            Toast.makeText(container.context,"Try Again",Toast.LENGTH_SHORT).show()
                        }
                    }
                }
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

                l1.setOnClickListener {
                    if (mRewardedAd != null) {
                        activity?.let { it1 ->
                            mRewardedAd?.show(it1, OnUserEarnedRewardListener{rewardItem ->
                                var rewardAmount = rewardItem.amount
                                var rewardType = rewardItem.type
                                ans1.text="#include <stdio.h>\n" +
                                        "void evenindices(int a[])\n" +
                                        "{\n" +
                                        "    int i;\n" +
                                        "    for (i = 0; i < 10; i++)\n" +
                                        "    {\n" +
                                        "        if (i % 2 == 0)\n" +
                                        "        {\n" +
                                        "            printf(\"%d. %d\", (i + 1), a[i]);\n" +
                                        "        }\n" +
                                        "    }\n" +
                                        "}\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int a[10], i;\n" +
                                        "    printf(\"Enter 10 values in the array:\\n \");\n" +
                                        "    for (i = 0; i < 10; i++)\n" +
                                        "    {\n" +
                                        "        printf(\"%d.\\t\", i);\n" +
                                        "        scanf(\"%d\", &a[i]);\n" +
                                        "    }\n" +
                                        "    printf(\"\\nValues at Even indices are: \");\n" +
                                        "    evenindices(a);\n" +
                                        "}"
                                ans2.text="#include <stdio.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int a[10], i, x, c = 0;\n" +
                                        "    printf(\"Enter 20 values in the array:\\n \");\n" +
                                        "    for (i = 0; i < 10; i++)\n" +
                                        "    {\n" +
                                        "        scanf(\"%d\", &a[i]);\n" +
                                        "    }\n" +
                                        "    printf(\"\\nEnter the value to search: \");\n" +
                                        "    scanf(\"%d\", &x);\n" +
                                        "    for (i = 0; i < 10; i++)\n" +
                                        "    {\n" +
                                        "        if (x == a[i])\n" +
                                        "        {\n" +
                                        "            printf(\"Value found at index %d\", (i + 1));\n" +
                                        "            c = 1;\n" +
                                        "            break;\n" +
                                        "        }\n" +
                                        "    }\n" +
                                        "    if (c != 1)\n" +
                                        "    {\n" +
                                        "        printf(\"Value not found\");\n" +
                                        "    }\n" +
                                        "}"
                                mark1.text=""

                            })
                        }
                    } else {
                        if (container != null) {
                            Toast.makeText(container.context,"Try Again",Toast.LENGTH_SHORT).show()
                        }
                    }
                }
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

                l1.setOnClickListener {
                    if (mRewardedAd != null) {
                        activity?.let { it1 ->
                            mRewardedAd?.show(it1, OnUserEarnedRewardListener{rewardItem ->
                                var rewardAmount = rewardItem.amount
                                var rewardType = rewardItem.type
                                ans1.text="#include <stdio.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int a[3][3], b[3][3], i, j;\n" +
                                        "\n" +
                                        "    for (i = 0; i < 3; i++)\n" +
                                        "    {\n" +
                                        "        for (j = 0; j < 3; j++)\n" +
                                        "        {\n" +
                                        "            scanf(\"%d\", &a[i][j]);\n" +
                                        "        }\n" +
                                        "    }\n" +
                                        "\n" +
                                        "    for (i = 0; i < 3; i++)\n" +
                                        "    {\n" +
                                        "        for (j = 0; j < 3; j++)\n" +
                                        "        {\n" +
                                        "            b[i][j] = a[i][j];\n" +
                                        "        }\n" +
                                        "    }\n" +
                                        "    printf(\"\\nElemetns of B are -:\\n\");\n" +
                                        "    for (i = 0; i < 3; i++)\n" +
                                        "    {\n" +
                                        "        for (j = 0; j < 3; j++)\n" +
                                        "        {\n" +
                                        "            printf(\"%d\\t\", b[i][j]);\n" +
                                        "        }\n" +
                                        "        printf(\"\\n\");\n" +
                                        "    }\n" +
                                        "}"

                                ans2.text="#include <stdio.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    int a[3][3], b[3][3], i, j;\n" +
                                        "\n" +
                                        "    for (i = 0; i < 3; i++)\n" +
                                        "    {\n" +
                                        "        for (j = 0; j < 3; j++)\n" +
                                        "        {\n" +
                                        "            scanf(\"%d\", &a[i][j]);\n" +
                                        "        }\n" +
                                        "    }\n" +
                                        "\n" +
                                        "    for (i = 0; i < 3; i++)\n" +
                                        "    {\n" +
                                        "        for (j = 0; j < 3; j++)\n" +
                                        "        {\n" +
                                        "            b[i][j] = a[j][i];\n" +
                                        "        }\n" +
                                        "    }\n" +
                                        "\n" +
                                        "    printf(\"Elements after transposing are -:\\n\");\n" +
                                        "\n" +
                                        "    for (i = 0; i < 3; i++)\n" +
                                        "    {\n" +
                                        "        for (j = 0; j < 3; j++)\n" +
                                        "        {\n" +
                                        "            printf(\"%d\\t\", b[i][j]);\n" +
                                        "        }\n" +
                                        "        printf(\"\\n\");\n" +
                                        "    }\n" +
                                        "}"
                                mark1.text=""

                            })
                        }
                    } else {
                        if (container != null) {
                            Toast.makeText(container.context,"Try Again",Toast.LENGTH_SHORT).show()
                        }
                    }
                }
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

                l1.setOnClickListener {
                    if (mRewardedAd != null) {
                        activity?.let { it1 ->
                            mRewardedAd?.show(it1, OnUserEarnedRewardListener{rewardItem ->
                                var rewardAmount = rewardItem.amount
                                var rewardType = rewardItem.type
                                ans1.text="#include <stdio.h>\n" +
                                        "struct std_info\n" +
                                        "{\n" +
                                        "    char name[20], add[20];\n" +
                                        "    int id;\n" +
                                        "};\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    struct std_info st[5];\n" +
                                        "    int i;\n" +
                                        "    for (i = 0; i < 5; i++)\n" +
                                        "    {\n" +
                                        "        printf(\"%d. \\n\", i);\n" +
                                        "        printf(\"Name: \");\n" +
                                        "        scanf(\"%[^\\n]%*c\", st[i].name);\n" +
                                        "        printf(\"Id: \");\n" +
                                        "        scanf(\"%d\", &st[i].id);\n" +
                                        "        printf(\"Address: \");\n" +
                                        "        scanf(\"%[^\\n]%*c\", st[i].add);\n" +
                                        "    }\n" +
                                        "    printf(\"Details Entered are: \\n\");\n" +
                                        "    for (i = 0; i < 5; i++)\n" +
                                        "    {\n" +
                                        "        printf(\"%d. \", i);\n" +
                                        "        printf(\"Name: %s\\n\", st[i].name);\n" +
                                        "        printf(\"ID: %d\\n\", st[i].id);\n" +
                                        "        printf(\"Address: %s\\n\", st[i].add);\n" +
                                        "    }\n" +
                                        "}"
                                ans2.text="#include <stdio.h>\n" +
                                        "#include <string.h>\n" +
                                        "struct emp\n" +
                                        "{\n" +
                                        "    char name[20];\n" +
                                        "    int id;\n" +
                                        "};\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    struct emp emp1, emp2;\n" +
                                        "    printf(\"Name: \");\n" +
                                        "    scanf(\"%[^\\n]%*c\", emp1.name);\n" +
                                        "    printf(\"Id: \");\n" +
                                        "    scanf(\"%d\", &emp1.id);\n" +
                                        "    emp2.id = emp1.id;\n" +
                                        "    strcpy(emp2.name, emp1.name);\n" +
                                        "    printf(\"Details stored in emp2 are:  \\n\");\n" +
                                        "\n" +
                                        "    printf(\"Name: %s\\n\", emp2.name);\n" +
                                        "    printf(\"ID: %d\\n\", emp2.id);\n" +
                                        "}"

                                ans3.text = "#include <stdio.h>\n" +
                                        "#include <stdlib.h>\n" +
                                        "#include <string.h>\n" +
                                        "struct emp\n" +
                                        "{\n" +
                                        "    char name[20];\n" +
                                        "    int id;\n" +
                                        "};\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    struct emp *emp1, *emp2;\n" +
                                        "    emp1 = malloc(sizeof(struct emp));\n" +
                                        "    emp2 = malloc(sizeof(struct emp));\n" +
                                        "\n" +
                                        "    printf(\"Name: \");\n" +
                                        "    scanf(\"%[^\\n]%*c\", emp1->name);\n" +
                                        "    printf(\"Id: \");\n" +
                                        "    scanf(\"%d\", &emp1->id);\n" +
                                        "    emp2->id = emp1->id;\n" +
                                        "    strcpy(emp2->name, emp1->name);\n" +
                                        "    printf(\"Details stored in emp2 are:  \\n\");\n" +
                                        "\n" +
                                        "    printf(\"Name: %s\\n\", emp2->name);\n" +
                                        "    printf(\"ID: %d\\n\", emp2->id);\n" +
                                        "}"
                                mark1.text=""

                            })
                        }
                    } else {
                        if (container != null) {
                            Toast.makeText(container.context,"Try Again",Toast.LENGTH_SHORT).show()
                        }
                    }
                }
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

                l1.setOnClickListener {
                    if (mRewardedAd != null) {
                        activity?.let { it1 ->
                            mRewardedAd?.show(it1, OnUserEarnedRewardListener{rewardItem ->
                                var rewardAmount = rewardItem.amount
                                var rewardType = rewardItem.type
                                ans1.text="#include <stdio.h>\n" +
                                        "#include <stdlib.h>\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    FILE *f;\n" +
                                        "    char para[500], read[500];\n" +
                                        "    f = fopen(\"Para.txt\", \"w\");\n" +
                                        "    if (f == NULL)\n" +
                                        "    {\n" +
                                        "        printf(\"FILE FAILED TO OPEN\");\n" +
                                        "        exit(0);\n" +
                                        "    }\n" +
                                        "    printf(\"Enter the data to store in file:\\n\");\n" +
                                        "    scanf(\"%[^\\n]%*c\", para);\n" +
                                        "    fputs(para, f);\n" +
                                        "    fclose(f);\n" +
                                        "\n" +
                                        "    f = fopen(\"Para.txt\", \"r\");\n" +
                                        "    if (f == NULL)\n" +
                                        "    {\n" +
                                        "        printf(\"FILE FAILED TO OPEN\");\n" +
                                        "        exit(0);\n" +
                                        "    }\n" +
                                        "    printf(\"Data stored: \\n\");\n" +
                                        "    fgets(read, 500, f);\n" +
                                        "    printf(\"%s\", read);\n" +
                                        "}"
                                ans2.text="#include <stdio.h>\n" +
                                        "#include <stdlib.h>\n" +
                                        "struct std\n" +
                                        "{\n" +
                                        "    char name[50];\n" +
                                        "    int r_no;\n" +
                                        "};\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    FILE *f;\n" +
                                        "    struct std st[5], rd;\n" +
                                        "    int i;\n" +
                                        "    f = fopen(\"Student.txt\", \"w\");\n" +
                                        "    if (f == NULL)\n" +
                                        "    {\n" +
                                        "        printf(\"FILE FAILED TO OPEN\");\n" +
                                        "        exit(0);\n" +
                                        "    }\n" +
                                        "    printf(\"Enter the data to store in file:\\n\");\n" +
                                        "    for (i = 0; i < 5; i++)\n" +
                                        "    {\n" +
                                        "        printf(\"\\nName: \");\n" +
                                        "        scanf(\" %[^\\n]%*c\", st[i].name);\n" +
                                        "        printf(\"ID: \");\n" +
                                        "        scanf(\"%d\", &st[i].r_no);\n" +
                                        "        fwrite(&st[i], sizeof(struct std), 1, f);\n" +
                                        "    }\n" +
                                        "\n" +
                                        "    fclose(f);\n" +
                                        "\n" +
                                        "    f = fopen(\"Student.txt\", \"r\");\n" +
                                        "    printf(\"\\n\\nData in file:\\n \");\n" +
                                        "    while (fread(&rd, sizeof(struct std), 1, f))\n" +
                                        "    {\n" +
                                        "        printf(\"Name : %s\\n\", rd.name);\n" +
                                        "        printf(\"Roll No. : %d\\n\\n\", rd.r_no);\n" +
                                        "    }\n" +
                                        "    fclose(f);\n" +
                                        "}"
                                mark1.text=""

                            })
                        }
                    } else {
                        if (container != null) {
                            Toast.makeText(container.context,"Try Again",Toast.LENGTH_SHORT).show()
                        }
                    }
                }
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

                l1.setOnClickListener {
                    if (mRewardedAd != null) {
                        activity?.let { it1 ->
                            mRewardedAd?.show(it1, OnUserEarnedRewardListener{rewardItem ->
                                var rewardAmount = rewardItem.amount
                                var rewardType = rewardItem.type
                                ans1.text=""
                                ans2.text=""
                                mark1.text=""

                            })
                        }
                    } else {
                        if (container != null) {
                            Toast.makeText(container.context,"Try Again",Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
        //tv.text="Fragment 3 ${msg.toString()}"

        return view
}}