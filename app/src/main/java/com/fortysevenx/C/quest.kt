package com.fortysevenx.C

object quest{
    fun getQuest():ArrayList<Questions>{
        val quesList = ArrayList<Questions>()
        //0
            quesList.add(Questions(1,"Which of these is not a programming language?",
                "Java","HTML","Unity","Python",2));

            quesList.add(Questions(2,"Which of the following language is preferred for game development? ","Java","C/C++","Python","HTML",1+4));

            quesList.add(Questions(3,"The correct language in the above question, what is the most accurate reason that this language is preferred for game development?",
                "It is easy to learn.","It does the work in less lines of code.","It is very fast when comes to processing.","It is used to created nice graphics.",2+8));

        quesList.add(Questions(4,"What should be the course of action you should pick as a newbie/beginner in programming.",
                "Learning lots of programming languages in less time","First Mastering one language then moving to other",
                "Improving your logic building and implementation of logic in programs that you make","Both 2 and 3",3+12));

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