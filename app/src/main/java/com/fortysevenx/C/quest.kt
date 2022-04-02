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
            quesList.add(Questions(5,"What is the use of compiler?","It saves the code for us, so it doesn't get lost if there was some unexpected power cut.",
                "It removes the errors and warnings from the program.","Compiler coverts the code into readable file.","It scans the code for error and syntax checking if " +
                        "errors are found it displays the error" +
                        " and if everything alright converts the code into low level language code for computer to understand.",3))

            quesList.add(Questions(6,"Which of the following is a text editor.","Notepad++","Notepad","VS code","All of them",3+4))
            quesList.add(Questions(7,"Which of the following is not an IDE","Code Blocks","Turbo C","Vs Code","Netbeans",2+8))
            quesList.add(Questions(8,"What is an environment path when we were setting up the compiler?","It sets the IDE for coding",
                "It tells the computer the location/path of the bin file of the compiler where the program for executing our code exists.","It installs the compiler in our" +
                        " computer so we can run the code without any problem","None of these",2+12))

        //2
            quesList.add(Questions(9,"Which of the following type of brackets is used to the define the definition of program or specify the code inside of a block of code.",
                "Circular brackets ( )"
                ,"Curly Brackets { }",
                "Square Brackets [ ] ","Arrows < >",1))

            quesList.add(Questions(10,"What if we miss ';' at the end of the line? ","Compiler will show warning not error for this","C compiler will put the semi colon at the end of line for us."
                ,"Program will give error","Nothing will happen",2+4))

            quesList.add(Questions(11,"What is the function of the header file that we include at the top of C program.",
                "It tells the compiler that it is C file.",
                "It has all the essential libraries which include important functions and such which are required by our program."
                ,"It tells the compiler that program starts from this line.",
                "It contains the methods to solve the errors if we encounter error.",1+8))

            quesList.add(Questions(12,"What does the header file stdio.h that we include in every C program contains?",
                "Its called standard input output header file and it contains the source code of compiler",
                "It contains the information about the location of C compiler installed in our system.",
                "It is the Standard Input output header file and it contains the information related to input output functions.","op4",2+12))

        //3
            quesList.add(Questions(13,"Which of these is not a data type in C?","struct","number","int","float",1))
            quesList.add(Questions(14,"What is the range of integers that we could normally store in the int data type with using long int?","0 to 1 million ",
                "-32767 to 32767","0 to 32767","0 to 65535",1+4))

            quesList.add(Questions(15,"Which of the following values is wrong to put inside an int?","32767","-4000","3132.42","0",2+8))
            quesList.add(Questions(16,"To store 5.43234 which data type will you prefer?","Int","Double","Point","Float",1+12))

        //4
        quesList.add(Questions(17,"Which of these is not a valid format specifier for data types?",
            "%d",
            "%s",
            "%q",
            "%c",
            2))
            quesList.add(Questions(18,"Can we print more than one types of data using only one printf statement?",
                "Yes, C only allows us to print all type of data more than once inside the printf statement",
                "No, C only allows us to print only same type of data more than once inside the printf statement",
                "No we can only print only 1 data type and only once",
                "It is possible but only inside the main() block",0+4))

            quesList.add(Questions(19,"What is wrong with this input expression of an int x?\n\tScanf(\"%d\",x);\n",
                "S is in uppercase, it should be 'scanf'",
                "ampersand '&' is missing after x",
                "ampersand '&' is missing before x","Both 1 and 3 are correct",3+8))

            quesList.add(Questions(20,"Which of the following statement is incorrect?","\\n is used to start newline",
                "a=>b is a correct expression for comparison between a and b in c",
                "In C true is 1 and false is 0 or any negative number as boolean values.",
                "a>=b is a correct expression for comparison between a and b in c",2+12))


        //5
        quesList.add(Questions(21,"What is a Boolean Value?",
            "Value which is only divisible by 100",
            "Values which can only be positive or negative",
            "Values which are either true or false, or 0 or 1 , where 0 is false and 1 is true",
            "Binary Values are Boolean Values",2))

        quesList.add(Questions(22,"Guess the output of this portion of code? -: " +
                "\n\t if(4%2!=0)\n\t{\n\t\tprintf(\"YES\");\n\t}else\n\t\tprintf(\"NO\");\n",
            "Program will not give output and give error because there is not curly brackets with else block",
            "Output will be YES",
            "Output will be NO",
            "Output will be ZERO",2+4))

        quesList.add(Questions(23,"Identify the incorrect statement.",
            "&& only gives true if both the statement around it are true",
            "|| only works if both the statement around it are false",
            "!= is an operator for checking if both the number are different or not",
            " = is called assignment operator",1+8))

        quesList.add(Questions(24,"What will be output of this block of code -:\n\t" +
                "if(1)\n\t\tprintf(\"FIRE\");\n\telse\n\t\tprintf(\"ICE\");",
            "FIRE","ICE","Program will give error","Program will run but will not give output",0+12))


        //6
        quesList.add(Questions(21,"Which of the following type of loop will definitely run once no matter the condition?",
            "For Loop",
            "While Loop",
            "do while",
            "all of the above",2))

        quesList.add(Questions(22,"How many time this loop will run?\n\twhile(1){\n\t\tprintf(\"RUNNING\\n\");\n\t}\n",
            "1 time","Will not run even once","This will be a infinity loop",
            "Program will throw error because there is no condition specified inside while loop",0+4))

        quesList.add(Questions(23,"Identify the correct output of this program -:\n\t" +
                "for(i=5;i<=7;i++)\n\t\tprintf(\"Yo \");\n\t\tprintf(\"HELLO \");\n",
            "Yo Yo Yo HELLO HELLO HELLO",
            "Yo HELLO Yo HELLO Yo HELLO",
            "Yo Yo Yo HELLO",
            "Yo Yo HELLO HELLO",2+8))

        quesList.add(Questions(24,"How many times this loop will run?\n\t" +
                "for(i=0;i<5;i++)\n\t\tfor(j=i;j<5;j++)\n\t\t\tprintf(\"HELLO\");\n",
            "25","10","50","15",3+12))


        //7
        quesList.add(Questions(21,"","","","","",0))
        quesList.add(Questions(22,"","","","","",0+4))
        quesList.add(Questions(23,"","","","","",0+8))
        quesList.add(Questions(24,"","","","","",0+12))


        //8
        quesList.add(Questions(21,"","","","","",0))
        quesList.add(Questions(22,"","","","","",0+4))
        quesList.add(Questions(23,"","","","","",0+8))
        quesList.add(Questions(24,"","","","","",0+12))


        return quesList
    }

}