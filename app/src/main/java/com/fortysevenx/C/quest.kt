package com.fortysevenx.C

object quest{
    fun getQuest():ArrayList<Questions>{
        val quesList = ArrayList<Questions>()
        //0 Intro
            quesList.add(Questions(1,"Which of these is not a programming language?",
                "Java","HTML","Unity","Python",2));

            quesList.add(Questions(2,"Which of the following language is preferred for game development? ","Java","C/C++","Python","HTML",1+4));

            quesList.add(Questions(3,"The correct language in the above question, what is the most accurate reason that this language is preferred for game development?",
                "It is easy to learn.","It does the work in less lines of code.","It is very fast when comes to processing.","It is used to created nice graphics.",2+8));

        quesList.add(Questions(4,"What should be the course of action you should pick as a newbie/beginner in programming.",
                "Learning lots of programming languages in less time","First Mastering one language then moving to other",
                "Improving your logic building and implementation of logic in programs that you make","Both 2 and 3",3+12));

        //1 Setting Up
            quesList.add(Questions(5,"What is the use of compiler?","It saves the code for us, so it doesn't get lost if there was some unexpected power cut.",
                "It removes the errors and warnings from the program.","Compiler coverts the code into readable file.","It scans the code for error and syntax checking if " +
                        "errors are found it displays the error" +
                        " and if everything alright converts the code into low level language code for computer to understand.",3))

            quesList.add(Questions(6,"Which of the following is a text editor.","Notepad++","Notepad","VS code","All of them",3+4))
            quesList.add(Questions(7,"Which of the following is not an IDE","Code Blocks","Turbo C","Vs Code","Netbeans",2+8))
            quesList.add(Questions(8,"What is an environment path when we were setting up the compiler?","It sets the IDE for coding",
                "It tells the computer the location/path of the bin file of the compiler where the program for executing our code exists.","It installs the compiler in our" +
                        " computer so we can run the code without any problem","None of these",2+12))

        //2 First Program
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

        //3 Variables Data Types
            quesList.add(Questions(13,"Which of these is not a data type in C?","struct","number","int","float",1))
            quesList.add(Questions(14,"What is the range of integers that we could normally store in the int data type with using long int?","0 to 1 million ",
                "-32767 to 32767","0 to 32767","0 to 65535",1+4))

            quesList.add(Questions(15,"Which of the following values is wrong to put inside an int?","32767","-4000","3132.42","0",2+8))
            quesList.add(Questions(16,"To store 5.43234 which data type will you prefer?","Int","Double","Point","Float",1+12))

        //4 Format specifies and Taking input
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


        //5 if-else
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


        //6 Loops
        quesList.add(Questions(25,"Which of the following type of loop will definitely run once no matter the condition?",
            "For Loop",
            "While Loop",
            "do while",
            "all of the above",2))

        quesList.add(Questions(26,"How many time this loop will run?\n\twhile(1){\n\t\tprintf(\"RUNNING\\n\");\n\t}\n",
            "1 time","Will not run even once","This will be a infinity loop",
            "Program will throw error because there is no condition specified inside while loop",0+4))

        quesList.add(Questions(27,"Identify the correct output of this program -:\n\t" +
                "for(i=5;i<=7;i++)\n\t\tprintf(\"Yo \");\n\t\tprintf(\"HELLO \");\n",
            "Yo Yo Yo HELLO HELLO HELLO",
            "Yo HELLO Yo HELLO Yo HELLO",
            "Yo Yo Yo HELLO",
            "Yo Yo HELLO HELLO",2+8))

        quesList.add(Questions(28,"How many times this loop will run?\n\t" +
                "for(i=0;i<5;i++)\n\t\tfor(j=i;j<5;j++)\n\t\t\tprintf(\"HELLO\");\n",
            "25","10","50","15",3+12))


        //7 Nested Loops and Switch Case
        quesList.add(Questions(29,"What does nesting means in programming?",
            "Using one or more than one loop inside other loop",
            "Using one or more than one if statement inside other",
            "Using loops outside main()","Both 1 and 2",3))

        quesList.add(Questions(30,"Which of the following is a decision control block like if-else block.",
            "For Loop",
            "Switch statement",
            "Return Keyword",
            "do while loop",1+4))

        quesList.add(Questions(31,"Guess the output of the following code -:\n" +
                "\t" +
                "char a = 'B';\n\t" +
                "switch(a){\n\t\t" +
                "case 'A':\n" +
                "\t\t\tprintf(\"APPLE\");\n\t\t\t" +
                "break;\n" +
                "\t\t\tcase 'B':\n\t\t\t" +
                "printf(\"Bat\");\n\t\t\t" +
                "break;\n\t\t\t" +
                "default:\n\t\t\t" +
                "printf(\"DOG\");\n\t\t}\n",
            "APPLE",
            "DOG",
            "BAT",
            "program will give error because no break statement inside default case",
            3+8))

        quesList.add(Questions(32,
            "Which of these is an invalid statement.",
            "Case 'A': will not work as c is in uppercase 'C', it should be case",
            "default case is not compulsory to run switch block without error ",
            "default case is compulsory to run switch block without error ",
            "Both 1 and 3",2+12))


        //8 Functions
        quesList.add(Questions(33,"Which of the following is not true for a function in C?",
            "Functions helps in reducing lines of code.",
            "We can pass as many parameters as we need in function.",
            "Running of function stops when it encounters return statement",
            "We cannot define the function before the main()",3))

        quesList.add(Questions(34,"What is the purpose of return statement at the end of function?",
            "It marks the end of definition of function in other words it tells that function finishes here.",
            "It returns the name of the function to the main()",
            "return keyword is also used to pass an value back from where the function was called.",
            "Both 1 and 3",3+4))

        quesList.add(Questions(35,"What is the right syntax to call this function? -:\n\t" +
                "void add(int a,int b);\n","add(2,3.5);","add(2);","add(a=2,b=3);","add(2,3);",
            3+8))

        quesList.add(Questions(36,"From where can we call a function?",
            "function can be called from another function.",
            "function can be called from inside main().","function can be called from inside another function",
            "ALL OF THE ABOVE",3+12))

        //9 Pointers
        quesList.add(Questions(37,"Which one is correct for '&' and '*' for pointers?",
            "'&' provides the address and '*' also provides the address",
            "'*' provides the address and '&' points to that address",
            "'&' provides the address and '*' points to that address",
            "'&' is pointer to address and '*' is the value there",2))

        quesList.add(Questions(38,"Find the values of a,b and c -:\n\t" +
                "int a,*b,c;\n\t" +
                "a=5;\n\t" +
                "*b=&a;\n\t" +
                "c=*b;\n\t" +
                "a=a+1;\n","a=5 b=5 c=5","a=6 b=5 c=6","a=6 b=6 c=6","a=6 b=6 c=5",
            3+4))

        quesList.add(Questions(39,"What will this expression be address or value(a is an integer values)?-:\n\t" +
                "x=*(&(*(&(*(&a)))))","Address","Value","pointer pointing to that address","Both 2 and 3",
            3+8))

        quesList.add(Questions(40,"Which of the following is incorrect for pointers?",
            "Pointers contains the address and when used with * points to that address",
            "When we declare a pointer like int *a; it doesn't get space for storing the value but for storing the " +
                    "space so if we do *a=5; it might return an error.",
            "We can store value in an pointer.",
            "We can store the address of the variable which is storing the value.",2+12))

        //10 More about functions
        quesList.add(Questions(41,"Which of the following way is the correct way of passing pointer/address for two int variable x and y to the function sum(int *a,int *b)?",
            "sum(&x,&y);",
            "sum(*x,*y);",
            "sum(**x,**y);",
            "sum(&(*x),&(*x));",
            0))

        quesList.add(Questions(42,"Correct syntax to receive a pointer from function int* add(int a,int b) in an int *a;.",
            "&a=add(&5,&6);",
            "*a=add(5,6);",
            "a=add(5,6);",
            "a=add(*5,*6);",
            2+4))

        quesList.add(Questions(43,"Which of the following function call demonstrates call by value and call by reference respectively with two int variables a and b.",
            "add(&a,&b); and add(a,b);",
            "add(a,b); and add(*a,*b);",
            "add(a,b) and add(&a,&b);",
            "add(*a,*b); and add(a,b);",
            2+8))

        quesList.add(Questions(44,"Which of these statements does not define functions and pointers.",
            "Functions are the block of code that we write to reduce lines of code.",
            "We cannot store value in an pointer variable but only address of the value",
            "We can operate with pointer variable just like normal variable like c=*a+*b is valid",
            "Functions cannot return pointer variable.",3+12))


        //11 Array and strings
        quesList.add(Questions(45,"Determine the correct properties of this array of length 6 -:" +
                "\n\tint a[]={2,3,-1,45,0,9};",
            "starting index 1 and last index 6",
            "starting index is -1 and last index is 5",
            "starting index is 0 and last index is 5",
            "starting index = 0 and last index = 5",
            2))

        quesList.add(
            Questions(46,"Given an array-:\n\tint a[]={1,2,3,4,5,6};\n" +
                "what will the output of this block of code. -:\n\t" +
                "for(i=0;i<6;i++){\n\t\tif(i%2!=0)\n\t\t\tprintf(\"%d \",a[i]);\n\t}\n,",
            "It will print all the even values from the array",
            "It will print all the prime numbers in the array",
            "This will print all the odd numbers in the array",
            "This will print all the elements of the  array",2+4))

        quesList.add(Questions(47,"We are given an array a[5] what will be the size of the array assuming size of 1 int" +
                " as 2bytes in the given compiler.",
            "5 bytes","10 bytes","6 bytes","12bytes",1+8))

        quesList.add(Questions(48,"If we have an array string st of 10 elements (char st[10];) then which of the following statement" +
                " given below is incorrect.",
            "st without square brackets is an pointer pointing to the starting of array",
            "size of given array is double the size of one char",
            "to print the whole character string we can use %s format specifier",
            "we cannot print the whole string at once without using loop",3+12))


        //12 Pointers in array
        quesList.add(Questions(49,"Can we change the length of array in C once we declare it",
            "No array is a static data type and its length cannot be changed normally",
            "Yes we can change the length of array by adding another array to it",
            "Yes we can change the length of array by the use of dynamic memory allocation",
            "Both 1 and 3 are correct",
            2))

        quesList.add(
            Questions(51,"What do we mean by dynamic memory allocation?",
            "Adding, removing and changing memory space  at run time that is once allocated",
            "allocating memory without even declaring the variable",
            "Using the malloc() function for memory allocation",
            "all of the above",3+4))

        quesList.add(Questions(52,"Which is the correct format to access array elements with using pointers.",
            "(*a+[1])","(&a+2)","*(a+1)","*(a[1])",2+8))

        quesList.add(Questions(53,"Suppose we have a pointer variable int *a; and we want to store the address of start" +
                " of array int x[]; in it.Which is the correct method to do this. ",
            "&a=x;",
            "&a=&x;",
            "a=x;",
            "*a=&x[1];",
            2+12))

        //13 2D array
       quesList.add(Questions(54,
           "Which of the following correctly defines the starting and ending index of an array in C? (n=number of elements in array",
           "start index = 1 and end index = l",
           "start index = 1 and end index = l-1",
           "start index = 0 and end index = l",
           "start index = 0 and end index = l-1",
           3))

       quesList.add(Questions(55,"Which of the following is incorrect for string and characters?",
           "A string is an array of characters",
           "In C string is under double quotes and character under single quotes",
           "Characters can also be under double quotes same as string in C",
           "Both string can character when converted to int give ASCII values of respective characters",
           2+4))

       quesList.add(Questions(56,"Which header file provide some essential functions such as strlen(),gets(),strcat() ets " +
               "which are useful when working with strings in C ?",
           "stdio.h",
           "conio.h",
           "string.h",
           "dos.h",2+8))

       quesList.add(Questions(57,"Which of the function can you use to input a string which contains spaces?",
           "strcat()",
           "gets()",
           "puts()",
           "strlen()",1+12))

        //14 Structures
       quesList.add(Questions(58,"If *a is the starting element of an array then what will be the next 2 elements?",
           "*a+1 and *a+2",
           "*(a+1) and *(a+2)",
           "*(a+2) and *(a+4)",
           "*a+2 and *a+4",
           1))

       quesList.add(Questions(59,
           "What is dynamic memory allocation in array?",
           "Allocating memory at the run time",
           "Flexible memory allocation that is allocated memory can be changed later",
           "Allocating memory then assigning it to a pointer.",
           "All of the above",
           3+4))

       quesList.add(Questions(60,
           "Which is the best method to calculate the number of elements in array if we dont know the length of array.",
           "Using strlen function",
           "running a loots until \\n is encountered",
           "dividing the total size of array by size of each element",
           "none of the above",
           2+8))

       quesList.add(Questions(61,
           "Which is the correct syntax for allocation an int array of length 5 using dynamic memory allocation.",
           "a={1,2,3,4,5}",
           "*a = calloc(5*sizeof(int))",
           "*a = malloc(5*sizeof(int))",
           "int *a[5];",
           2+12))

        //15 FileHandling
       quesList.add(Questions(62,
           "Which of the following is valid for 2-D array.",
           "It is an array with 2 or more rows",
           "It is denoted by the syntax a[i][j]",
           "in a[i][j] i is row index and j is column index",
           "All of the above",
           0))

       quesList.add(Questions(63,
           "What is a square matrix.",
           "A 2-D array with 1 row and 1 column",
           "A multidimensional array with i>j",
           "A multidimensional array with equal number of rows and columns ",
           "A array which consist of square of all the elements in its first row",
           2+4))

        quesList.add(Questions(64,"What do you mean by transpose of a square matrix a.",
            "A matrix which contains the index numbers of all the elements of a",
            "A 2-D array which contains the index number starting from 1 of all elements of a.",
            "A matrix which contains all the row elements of a in its column and all the column elements of a in its rows.",
            "A 2-D array with reciprocal values of each elements of a.",
            2+8))

        quesList.add(Questions(65,"Which of the following is not true for a 2-D array",
            "Its size can be calculated by size of one element into total number of elements i.e. - i x j x n",
            "a[2][4] will give the element in the second column and 3rd row",
            "a[2][4] will give the element in the second row and 4th column",
            "a[9][9] is s 9 cross 9 square matrix",1+12))

        //16 Structures
        quesList.add(
            Questions(66,
            "Which of these best describes the difference between structure and function",
            "Function is also a data type same as structure.",
            "Structures are used as a data type whereas function is method defined by us.",
            "Structure is not reusable but function is reusable",
            "Structure cannot be used as d data type but function can be used",1)
        )

        quesList.add(Questions(67,
            "Which is the correct syntax for creating a variable of a struct employee{}.",
            "struct emp1;",
            "struct employee;",
            "struct employee emp1;",
            "employee emp1",2+4))

        quesList.add(Questions(68,
            "What is wrong with this piece of code.\n\t" +
                    "struct emp1(\n\t" +
                    "int x;\n" +
                    "};",
            "semi colon at the end",
            "s is in Lowercase(small letters) in struct",
            "no curly brackets used",
            "all of the above",2+8))

        quesList.add(Questions(69,
            "Which is the correct syntax for initializing a struct using dynamic memory allocation",
            "struct emp* = malloc(sizeof(struct));",
            "struct *emp = sizeof(struct emp));",
            "struct emp = sizeof((struct emp));",
            "struct emp = (struct *)sizeof(struct));",0 ))

        //17 File Handling
        quesList.add(
            Questions(70,
        "What is the need for file handling?.",
        "It help us save the data that we entered into the main memory.",
        "It helps to read and write data from RAM",
        "It helps to permanently save and retrieve data.",
        "It is used to write and create text files only.",
        2)
        )

        quesList.add(Questions(70,
            "Which is not a correct syntax for initializing a file pointer.",
            "FILE *fp;",
            "FILE *fp = fopen(\"F1.txt\",\"r\");",
            "File *fp = Fopen(\"F1.txt\",\"w\");",
            "FILE *fp = fopen(\"F1.txt\",\"w\");",
            2+4))

        quesList.add(Questions(70,
            "Why do we have to close the opened file using fclose().",
            "Because it will not save the data without closing the file",
            "It is a good practice and removes the opened file from ram.",
            "It also helps if we have to reopen file in the same program then if we had closed it then we can use the " +
                    "same FILE variable to open the file.",
            "Both 2 and 3 are correct",
            3+8))

        quesList.add(Questions(70,
            "Which header file is used in file handling or which header file contains the keywords and functions for" +
                    " file handling in C.",
            "conio.h",
            "stlib.h",
            "stdio.h",
            "dos.h",
            2+12))

        return quesList
    }

}