package com.fortysevenx.C

object quest{
    fun getQuest():ArrayList<Questions>{
        val quesList = ArrayList<Questions>()
        //0
            quesList.add(Questions(1,"Q1","op1","op2","op3","op4",2));
            quesList.add(Questions(2,"Q2","op1","op2","op3","op4",3+4));
            quesList.add(Questions(3,"Q3","op1","op2","op3","op4",0+8));
            quesList.add(Questions(4,"Q4","op1","op2","op3","op4",1+12));

        //1
            quesList.add(Questions(5,"Q1","op1","op2","op3","op4",3))
            quesList.add(Questions(6,"Q2","op1","op2","op3","op4",3+4))
            quesList.add(Questions(7,"Q3","op1","op2","op3","op4",0+8))
            quesList.add(Questions(8,"Q4","op1","op2","op3","op4",1+12))

        //2
            quesList.add(Questions(9,"Q1","op1","op2","op3","op4",2))
            quesList.add(Questions(10,"Q2","op1","op2","op3","op4",2+4))
            quesList.add(Questions(11,"Q3","op1","op2","op3","op4",2+8))
            quesList.add(Questions(12,"Q3","op1","op2","op3","op4",2+12))

        //3
            quesList.add(Questions(13,"Q1","op1","op2","op3","op4",2))
            quesList.add(Questions(14,"Q2","op1","op2","op3","op4",2+4))
            quesList.add(Questions(15,"Q3","op1","op2","op3","op4",2+8))
            quesList.add(Questions(16,"Q4","op1","op2","op3","op4",2+12))

        //4
            quesList.add(Questions(17,"Q1","op1","op2","op3","op4",2))
            quesList.add(Questions(18,"Q2","op1","op2","op3","op4",2+4))
            quesList.add(Questions(19,"Q3","op1","op2","op3","op4",2+8))
            quesList.add(Questions(20,"Q4","op1","op2","op3","op4",2+12))



        return quesList
    }

}