package com.fortysevenx.C

object Constants {
const val ID:String="ID"
    fun getTV():ArrayList<CardDetails>{
        var textList = ArrayList<CardDetails>()
        var c1=CardDetails(1,"Learn C : Introduction")
        textList.add(c1)
        textList.add(CardDetails(2,"Setting Up the Environment***"))
        textList.add(CardDetails(3,"First Program"))
        textList.add(CardDetails(4,"Variables,Data Types"))
        textList.add(CardDetails(5,"Format specifiers and Taking input"))
        textList.add(CardDetails(6,"if - else"))
        textList.add(CardDetails(7,"Loops"))
        textList.add(CardDetails(8,"Nested Loops and Switch Case"))
        textList.add(CardDetails(9,"Functions"))
        textList.add(CardDetails(10,"Pointers"))
        textList.add(CardDetails(11,"More about functions"))
        textList.add(CardDetails(12,"Arrays and Strings"))
        textList.add(CardDetails(13,"Pointers in Arrays"))
        textList.add(CardDetails(14,"Let's Start"))
        textList.add(CardDetails(15,"Let's Start"))
        textList.add(CardDetails(16,"Let's Start"))
        return textList
    }
}