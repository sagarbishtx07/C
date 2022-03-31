package com.fortysevenx.C

//import android.os.Bundle
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import org.w3c.dom.Text

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
class First_fragment : Fragment(R.layout.fragment_first_fragment) {
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_first_fragment, container, false)
        val tv = view.findViewById<View>(R.id.tvf1_head) as TextView
        val bundle = arguments
        val c_id = bundle!!.getInt("mText")
        val p1 = view.findViewById<TextView>(R.id.p1)
        val p2 = view.findViewById<TextView>(R.id.p2)
        val p3 = view.findViewById<TextView>(R.id.p3)
        val p4 = view.findViewById<TextView>(R.id.p4)
        val foot = view.findViewById<TextView>(R.id.footer)
        val sh1 = view.findViewById<TextView>(R.id.sh1)
        val sh2 = view.findViewById<TextView>(R.id.sh2)
        val sh3 = view.findViewById<TextView>(R.id.sh3)
        val im0 = view.findViewById<ImageView>(R.id.i0)
        val im1 = view.findViewById<ImageView>(R.id.i1)
        val im2 = view.findViewById<ImageView>(R.id.i2)
        val im3 = view.findViewById<ImageView>(R.id.i3)

        when (c_id) {
            0 -> {
                tv.text = "Introduction"

                p1.text =
                    "C is one of the most popular and powerful programming languages. C is as well the most recommended programming language to learn as a beginner" +
                            ", why do you think it is recommended for most beginners?.As you might see in the future that most programming languages that are" +
                            "while learning C you will see that most programs that you will do here or in most online C beginner courses will focus on doing " +
                            "your code or obtaining required result by doing as much as work as we can like doing 2+2 using conventional method and not by " +
                            "calculator. In C we don't do things easy way."
                sh1.text = "C language is amazing"
                p2.text =
                    "If you search on the internet about C you will be surprised to find out that many of that programming languages\n" +
                            "that are used now are either made on C or are influenced by C language, you might not be wrong if you say that C is the\n" +
                            "mother of most programming languages."
                sh2.text = "Intro is over now the time to get to work"
                p3.text =
                    "So that's enough introduction for C language for now and let's talk about this course\n" +
                            ".So this course is a beginner level course made to strengthen your fundamentals. Entire course is divided into sections and \n" +
                            "each section is divided into 3 parts ,you have to read and understand the first part which contains the concepts then do \n" +
                            "the exercise based on that. There will be times later that you might get stuck somewhere or in certain exercises(that are\n" +
                            "made hard so that you learn to think) but even if you get stuck don't stop trying. Keep pushing back."

                foot.text = "Work hard to see yourself be a better programmer"
                im0.setImageResource(R.drawable.s1i0)
                im1.setImageResource(R.drawable.s1i1)
                //im1.setImageResource(R.drawable.s1i2)
            }
            1 -> {
                tv.text = "Someplace to code"
                im0.setImageResource(R.drawable.s2io1)
                im1.setImageResource(R.drawable.s2i1)
                im2.setImageResource(R.drawable.s2i2)
                p1.text =
                    "Before we start writing program we need to decide our setup someplace to write run/execute our programs.But first you should undertands these 3 terms\n" +

                            "\n\n" +
                            "1.COMPILER - Compiler is the program that reads our code then understands it and checks for error and converts it into a language understandable by the computer\n" +
                            " and then then sends the code for execution. Every programming language have different compiler for them. To run your C program you would have" +
                            "to download the C compiler and then setup the path for it.\n" +
                            "\n\n" +
                            "2.Setting the path for compiler - Every time when you run the program you might need to call the compiler and for it every time you would have " +
                            "to specify its location to computer but this gets very time consuming and not good as well to acess the compiler anytime we set the path of compiler" +
                            "in the system variables.Setting up path in simpler terms is to let your computer remember the loacation of c compiler so that we don't have to tell the computer every time we run the code.\n" +
                            "\n\n" +
                            "3. Text Editor and IDE -: " +
                            "Text editor as the name says we edit text in here notepad in windows is the most popular example of it and when we use that text editor specially for writing\n" +
                            "program and add some extra feature to support us in writing clean and nice programs then its called Code Editor. Most popular code edior are VS code, Sublime Code,Atom etc.\n" +
                            "\n" +
                            "IDE - IDE's(Integrated Development Environment) are specially made chunky software which have lots of feature that really help in developing and managing big projects.Although IDE's are feature packed but they are also a bit\n" +
                            "more system resource consuming than normal code editors.\n" +
                            "\n" +
                            "Although on today time code editors come with some popular features(like code-prediction,code-correction ,auto-indentation, direct git support,debugging etc) required for most projects.And by the way all the " +
                            "extra features that are being talked about here are optional for programing things can be accomplised without those features as well its just that when you would be working on big projects" +
                            "some extra features that IDE's would provide would come in handy.\n"
                sh1.text = "\nRunning C program In Windows"
                p2.text =
                    "There are many ways in which you can run C program in windows but mainly we would recommend using these 2 methods :\n" +
                            "\n\t1.This method will require you to do most of the work manually (like setting the compiler and path for it) -: First you would need to download the C compiler most popular c compiler" +
                            "\t is minGW which you can easily download and there you can find the detailed step by step guide to install as well set the path for C compiler in your system in which you will have" +
                            "\tto add the location of the bin folder of mingw compiler in your system path( Press start key -> search environment variables -> select that then go to environment variables -> then " +
                            "\tgo to the edit system variables section -> there add new -. browse to mingw bin directory -> OK)." +
                            "\t\tAfter you properly setup the mingW and its path then you are good to go then you can use it to execute the C program in this way-:\n" +
                            "\n\t\t\t(a)Write a C program in any text editor notepad/vs code/sublime/notepad++ etx save them with name ending with .c for example Program1.C.\n" +
                            "\n\t\t\t(b)Browse to the location of saved file by navigating in command prompt and there compile the C file using the command gcc filen_name.c.\n" +
                            "\n\n\t\t(c)After it sucessfully gets executed without any errors, type the name\tof the file and hit enter.\n" +
                            "\n\t\t\t\tnote -:if it displays error then fix those errors by correcting them in the original file and save again\n" +
                            "\n" +
                            "\n\n\t2. This is the easy way there are some popular C/C++ IDE such as Code Blocks and Turbo C which you can easily download from net and install in your system.\n" +
                            "\n\t\tTurbo C - Turbo C is a very old C IDE/compiler althoough when you would use turbo C it might feel very outdated compared to todays standard but it works like charm and has plenty" +
                            "\tof resources inside it in which you can acess lots of valuable information about tokens and library used in C program or which you want to use.\n" +
                            "\n" +
                            "\n\tRunning a program in Turbo C -:\n" +
                            "\n\t\t\t1.Download and install Turbo C.\n" +
                            "\t\t\t2.Open it Create New file and save the file with .c extension at the send\n" +
                            "\t\t\t\tnote -: while using turbo c pls make it into your habit foe saving the program whenever you make change in it cause if your program crashes or" +
                            "goes into infinity loop then you would have to reopen turbo C and then it will load from last saved state.\n" +
                            "\t\t\t3. Build and Run your program.\n" +
                            "\t\t\t4. Since turbo C is very old and hasn't been updated for a long time some syntax that you would use in turbo C might cause error in other C compiler or vice versa\n" +
                            "\t\t\tdon't worry it won't be much of a problem.\n" +
                            "\n" +
                            "\n\t\tCode Blocks - Code blocks is another popular C/C++ IDE its simple to use just remember when you download it try to download the version with compiler."
                sh2.text = "\nRunning it on Android/IOS"
                p3.text =
                    "\n\nYou can write and run C programs in your phone also there are some good apps in playstore that gives this feature on of which you can use is DCODER ,just search and install it on " +
                            "\tyour phone, open it -> start coding -> make a new C file-> press the play button to execute(make sure to keep connected to internet for it to work)" +
                            "\n\nAlternatively you can also use many online compiler(just search C online compiler) of C available to run your code for free although i wouldn't recommend them since they are a bit slow when it comes to execution.\n"
                foot.text =
                    "Plz perform the following quiz and practice programs(on code section) to improve your skills "
                //im1.setImageResource(R.drawable.s1i1)
            }
            2 -> {
                tv.text = "Writing our C first program"
                im0.setImageResource(R.drawable.s3i0)
                p1.text =
                    "So now hopefully we have set up a ide or a text editor or an app to code and execute first C program" +
                            ".Now we will be writing our first program.Open up a blank file in which have a dot C(.C) extension or simply" +
                            "open an file and later save it file filename.C so that when we run our code our computer/device would know that" +
                            "this is a C file and so will be executed accordingly."
                sh1.text = "Hello World Program"
                p2.text =
                    "If you ever had learnt any other language or attended a programming related course you might have seen that there" +
                            "also the first program or piece of code you executed was HELLO WORLD program, its a tradition like you are saying" +
                            "hello to the world from the program you wrote for the first time in my opinion its a nice tradition so we would follow" +
                            "the same and write our first hello world program in C."
                im1.setImageResource(R.drawable.s3i01)
                sh2.text = "Understanding the program we made"
                p3.text =
                    "1. '//' - First Line of Code begins with double slash as you can see in the image above\n" +
                            " -> // - double slash is just a comment that our compiler don't read when executing the program" +
                            "its for us to understand the code better, when program gets large with lots of lines of code" +
                            "// helps a lot to understand the code\n" +
                            "\n2. '#include<stdio.h> - 2nd line is a header file include which begins with #include followed by a name in arrow brackets" +
                            " which is a library name that we want to include in our program ,the library contains all the " +
                            "required files which we want to include in our program. here we have included stdio library" +
                            "(#include<stdio>) which is contains necessary files and functions required for standard input" +
                            "output ,later you will use many new libraries as needed by your program and .h means that its a header file" +
                            "since in C it stays at the top of program i.e. head of program therefore header file\n\n" +
                            "3. 'void main()' -  it is the main part of our program like driver's seat in a car mostly everything" +
                            "about our program is controlled through here when compiler executes the program it searches for the " +
                            " main function first (we will learn about functions later) where it gets the information about what to " +
                            "do and in which order things would be done and the word 'void' before main means nothing or null which we " +
                            " will learn later when we will study functions and return types.\n\n" +
                            "4. ' {  } ' - curly brackets are the container, anything that you would like to contain under something" +
                            "in C should be in curly brackets although sometimes its not necessary but for functions like main() its" +
                            "is necessary.\n\n" +
                            "5. Print statement 'printf(); - printf is a predefined word in C which tells the compiler that whatever" +
                            "comes under the curly bracket of printf will have to be displayed in the screen and it should be contained " +
                            "inside of double inverted commas if you will use single inverted commas the program will show error while" +
                            "executing and at the end the ';' semi colon symbol also known as terminator in C marks the end of line of code" +
                            " in C whenever you will write next line of code or write another code instruction always use semi-colon otherwise" +
                            "program throws error.(Lots of beginners does this mistake of forgetting to put semicolon ;)"
                foot.text =
                    "Also one last thing at first you might do lots of simple syntax mistakes like forgetting a curly bracket or a " +
                            "semi-colon so don't worry you will always be doing some mistakes.....doing mistakes and improvising on it" +
                            " will surely make us a better coder."
            }
            3 -> {
                tv.text = "Variables"
                im0.setImageResource(R.drawable.s4i0)
                p1.text =
                    "Variables as its name says it stands for things that vary or can change its value, these are  similar" +
                            "to the variables you might have studied and used in your maths classes. we assign a name to each variable" +
                            "such as a,b,x,y,sum,total etc but before assigning them names we also specify their data types"
                sh1.text = "Data Types"
                im1.setImageResource(R.drawable.s4i01)
                p2.text =
                    "In C or also in many other languages you would have to specify which type of data you want to store" +
                            " in  the variable before the variable name, you do like - int a =5; or char f ='k'.Their are mainly 4 types" +
                            "of primary data types in C that are int, float,char and double which all store different types of data" +
                            "or different size of data, heres a brief about each data types-:\n" +
                            "1. INT - It store all the integer values i.r all number in a certain size limit which are not decimal point" +
                            "or in simple words all non point numbers in a certain size limit. I think you might be getting curious" +
                            "about the size limit or the range of int, there's a program which we will be doing later to determine the " +
                            "size of int.Also, there are many sub/super types of int such as short int and long int which does the same " +
                            "job as int but give more range or higher capacity to store big numbers and vice versa.\n " +
                            "2.Float - It store the decimal point values, it is also called as precision floating point since more points" +
                            " is more precision.\n" +
                            "3.Double -  It does the same thing as done by float i.e. stores decimal point values but its gives us higher" +
                            "storage or more capacity to store very large point values.\n" +
                            "4.Char - It stores the character values or any value in its original form like 'a','b','c','2','+' or any " +
                            "single character." +
                            "\n"
                im2.setImageResource(R.drawable.s4i02)
                sh2.text = "Size of each data type"
                p3.text =
                    "Although there are certain mentioned size for each data types here but pls note that these size mentioned here " +
                            "are not fixed that is they can easily vary from compiler to compiler.You might be using some code editor or ide " +
                            "for example some of you might be using Turbo C for coding(TurboC uses boreland compiler and most recent compiler" +
                            "are called GNU/GCC/minGW compiler or GNU/GCC based comiler) and some might be using Code Blocks or GNU based code " +
                            "editor so both of you might get different sizes for data types.So don't worry if some of you get 2 byts for int size" +
                            "and some of you get 4 bytes for int size.\n Here are the size of data types in GNU based compiler.\n" +
                            "\t1. Int \t 4bytes\n" +
                            "\t2. Float\t 4bytes\n" +
                            "\t3. Char\t 1bytes\n" +
                            "\t4. Double\t 8bytes\n" +
                            "also,Assignment stands for assigning some value to some variable (int a = 5) here 5 is being assigned to a variable which" +
                            "is of type int never ever assign mismatching value for example - if you write char x =5 this is wrong since 5 is and" +
                            "integer value and you are trying to assign it to a character data type.Correct way to do it is char x = '5' and in a" +
                            " similar way "
                foot.text =
                    "we will see how to take input and store it in a variable and then perform some operations on it"
            }
            4 -> {
                im0.setImageResource(R.drawable.s5i0)
                tv.text = "Taking Input and performing some operations over it"
                p1.text =
                    "You might have used many applications which requires user to insert some data such as entering your name in a form" +
                            " or inserting some numbers in calculator to add or multiply them later or entering a password somewhere all these" +
                            "are the cases of giving input to the program or the program asking for input from the user to later perform" +
                            "some actions over it.\n\n" +
                            "scanf() - we use the scanf(\"\") to take input in C but before that we will learn about format specifiers"
                //here
                im2.setImageResource(R.drawable.s501)
                sh1.text = "Format Specifiers in C"
                p2.text =
                    "when printing or taking input(scanning) any variable in c we have to mention its data type inside the printf(\"\") statement.\n for " +
                            "example int a=5; and we want to print a in the screen then we will do it by printf(\"%d\",a); here '%d' is the " +
                            "format specifier that tells the compiler that the data type we are printing here is of type integer and same with scanning" +
                            "we have to mention the type of format specifier we will see in below section also there are format specifier for each data type -:\n" +
                            "for integer type data - \t %d" +
                            "for floating point - \t %f" +
                            "for character data - \t %c" +
                            "\t⁖ strings are stream of characters we will study later" +
                            "for string - \t %s"
                sh2.text = "Tanking Input using scanf()"
                p3.text =
                    "We use the scanf() to take input in C the syntax for it is as follows-:\n" +
                            "\tscanf(\"__format specifier__\",&variable_name); " +
                            "\there format specifier will be filled with proper format specifier for the data type of vairable used after the comma" +
                            ".\nfor example - scanf(\"%d\",&a); here a is an int type variable so we used %d format specifier. You might be thinking why" +
                            "we used '&'(amperstand symbol) after comma(&a) in above scanf() statement while we didn't used in the printf() statement" +
                            "that's because scanf() store the data at the memory location or address and we will read more about memory location and address" +
                            "in later section about pointers, which is actually one of the most important topic in learning C."


                sh3.text = " Operations in C"
                p4.text =
                    "C supports most primary arithmetic operations(+,-,*,/). we will be talking about some basic operations in brief and" +
                            "some other operations such as power(exponent function) or trignometric function will be covered later\n and there are some" +
                            "operators mentioned here" +
                            "1. + , - , * , /  - are used same as in mathematics \n" +
                            "2. % - if you are new to computer science or programming then you might think of it as percentage operator but here" +
                            "its used as the modulus operator or remainder operator it give us the remainder that we would get from dividing 2 numbers" +
                            "for ex - a= 11 % 5; will give 1(a=1) since 1 is the remainder when 11 is divided by 5.And although you might have guessed" +
                            " but if you want to calculate percentage then you would have to do it by conventional method(divide by total and *100)\n" +
                            "\tHere are the logical operators which are used of comparison which we will study more about in the later if-else section" +
                            "3. '<' '>' '<=' '=>' '!' '!=' '!>' '!<' '==' '&&' '||'  -:\n" +
                            "\t < - less than" +
                            "\t > -greater than" +
                            "\t == - checks if both number are equal to each other or not" +
                            "\t <= less than equal to  - when some number could be less than the number on right side and possibly could be equal to it" +
                            "then we use this operator" +
                            "\t >= greater than equal to" +
                            "\t ! not operator" +
                            "\t != not equal to" +
                            "\t !> not greater than" +
                            "\t !< not less than" +
                            "\t && - Logical And" +
                            "\t || - Logical OR " +
                            "" +
                            "\n4.'&' '|' '<<' '>>' - all these are bit wise operators which are used to perform operation in bit-level \n" +
                            "5. \\n \\t \\v -all these operator that start with backslash are called escape sequence becuase they don't show themselves" +
                            "in the output but they edit the statement that they are used in, for example printf(\"Day \\n Night \");  it will be printed" +
                            "as -:\n Day\n Night\n so the \\n is used to print from new line, similarly \\t is used to add a tab space"

                foot.text =
                    "All of these operators are very crucial for logical operations you will see in if-else blocks."
            }
            5 -> {
                tv.text = "Logical Statements/decisions - if else"
                p1.text =
                    "To make any type of of logical statement ww need to think about first that we should do it or we should not or " +
                            "is it right or is it wrong similar to make logical decisions in C you have if else statements.and right or wrong in" +
                            " programming is True or False or O - 1 , 0 means false and 1 means true(that you can proceed to next statement) "
                sh1.text = "if(statement) or else"
                p2.text =
                    "We write an expression inside if that is either true or false and if it is true then the program goes inside the " +
                            "if block and if the expression is false then else block is executed.We will understand it by this example-:" +
                            "\nif(3>4){\n\tprintf(\"Three is greater than 4\");\n}else{\n\tprintf(\"Four is greater\");\n}\n" +
                            "here in first if checks for the expression inside it that whether its true or false if its true then it proceeds" +
                            "inside the if block and if its false then it goes inside the else block and executes whatever code is inside it" +
                            "there are one more statement i.e. else if{ } block. To understand if , else and else if here are 2 examples that " +
                            "should understand."
                sh2.text =
                    "1.Program to compare the height of 2 Person Tony and Steve and displays the Name of person who is taller."
                im2.setImageResource(R.drawable.s602)
                p3.text =
                    "First 5 lines of code are about declaring 2 variable to store height of tony and steve and then asking them" +
                            "to input their height using the printf() statement.Then from the 6th line we take input of h1 and h2 using the " +
                            "int format specifier - %d (note that we cannot print any text inside of scanf() statement otherwise it might cause problem" +
                            ". Then wwe use the if to check that if(h1>h2) so if its true then the code inside it gets executed and the statement " +
                            "inside it gets printed and otherwise the statement inside else block is printed."
                sh3.text = "2.Program to compare if a number is divisible by 2 or 3 or 7 or 11."
                im3.setImageResource(R.drawable.s603)
                p4.text =
                    "Explanation of above program - From line 5 we take the input for the number that we would want to check whether its " +
                            " divisible by 2 or 3 or both of them or if it would not be divisible from both 2 and 3 then we would just print one" +
                            "more statement for it.\n\tFrom our first if block we check if number is divisible by 2(by taking a mod/% or remainder" +
                            "from a number if it comes zero than it means that the number is divisible by that number otherwise remainder is left " +
                            "and that number is not divisible by that number) and the '&&' symbol as we studied in the previous module means that" +
                            " both the statement should be true then only we will proceed inside the if block and the other statement on  the " +
                            "right side of '&&' checks whether the given number is also divisible by 3 or not so if both are true then it prints whatever" +
                            " inside the if statement else goes to the next statement which is if else which check for another possible condition that is if it is" +
                            "divisible by 3 but not 2 similarly next one checks that if its divisible by 2 but not 3 and the last one only runs if above three are " +
                            "not true."
                foot.text = "Plz perform the exercise and quiz by yourself"
            }
            6 -> {
                tv.text = "Loops"
                p1.text =
                    "Imagine you have to print 'Hello World' in C then you would have to write printf(\"Hello World\") every time" +
                            " then it would take some time but now imagine if you were to do it 100 or 1000 time then it would take very large amount" +
                            "of time. Thats where loops comes in to reduce the line of code that follow similar pattern or have repetition ."
                sh1.text = "While Loop"
                p2.text =
                    "While loop means that - this block of code will repeat itself or stay in loop while the condition is not false. \n" +
                            "Syntax for while loop - :\n" +
                            "\twhile(condition){\n" +
                            "\t\tstatement1;\n" +
                            "\t\tstatement2;\n" +
                            "\t\t......\n" +
                            "\t}\n" +
                            "here while loop checks for the condition inside the parenthesis(rounded brackets), if the condition gets satisfied then" +
                            "the block of code inside it gets executed again and again and when the condition is false then the while loop stops.\n" +
                            "Example to demonstrate the use of while loop\n" +
                            "\n\t#include<stdio.h>\n" +
                            "\t\tvoid main(){\n" +
                            "\t\t\tint a = 5;\n" +
                            "\t\t\twhile(a>0){\n" +
                            "\t\t\t\tprintf(\"%d a = \",a);\n" +
                            "\t\t\t\ta--;\n" +
                            "\t\t\t}\n" +
                            "\t\t}\n\n" +
                            "code explanation - we will start from the line 3 we declare a variable 5 and next we write the while loop and put the " +
                            "condition in it that while loop should run as long as a is greater than 5 and inside while loop we print the value of " +
                            "a each time loop runs now in next line we have a-- which is shortcut for 'a=a-1' which means every time we run the loop " +
                            "the value of a gets decreased or decremented by 1 each time.So after ist time the loop runs the value of a becomes a=5-1" +
                            " =4 then next time it become 3 then 2 then 1 after the 5th run value of a becomes zero and the condition inside the while" +
                            " loop i.e. a>0 becomes false so the loop stops running.\n\t Note(Very Important) - if we didn't write a-- or a=a-1 inside the" +
                            "loop then the value of a would never have decreased and a would never become zero so the conditon to rin the loop will never be" +
                            " false and the loop will forever keep on running which would make the program to enter in the state of infinite loop which is " +
                            " problematic and dangerous for the program and "
                sh2.text = "For Loop"
                p3.text =
                    "In case of while loop we only have control of the ending of loop what if we want more control over the loop directly" +
                            " i.e. from initialization(starting condition of loop in this case) of loop to the end of it that's where the For loop comes in.\n\t" +
                            "syntax-:\n" +
                            "\t\tfor(initialization; ending_condition;propagation)\n\n" +
                            "Example to demonstrate the working of for loop.\n" +
                            "\t#include<stdio.h>\n" +
                            "\tvoid main(){\n" +
                            "\t\tint a;\n" +
                            "\t\tfor(a=1;a<=10;a++){\n" +
                            "\t\t\tprintf(\"%d\n\",a);\n" +
                            "\t\t}\n" +
                            "}\n\npls perform this block of code for better understanding\n" +
                            "code explanation - : from line 4 we declare the for loop using the for statement inside the parenthesis we initilize the " +
                            " variable a to a =1 which we had declared in line 3, then we set the stop condition for the loop that until a is less than" +
                            "or equals to 10 the loop should run and at last we set that every time the loop runs a is incremented by 1,pls note here that" +
                            "the increment/decrement statement or the 3rd expression of for loop i.e. propagation is executed after all statements inside the for" +
                            "loop is executed which means first the for loop initializes the vairable then checks the stop condition then goes to code inside" +
                            " the loop then it increments a by 1. "
                sh3.text = "do while loop"
                p4.text =
                    "You might have came across some situation in some app or a game where the application might have ask you something" +
                            " - 'Do you want to Continue?(Y/n).So do while is made for similar situations its similar to while loop but unlike while" +
                            " loop which checks for the condition before entering inside the loop, do while loop runs one time then checks the condition" +
                            "\nSyntax for do while - :\n" +
                            "\tdo{\n" +
                            "\nstatement ;\n" +
                            "\t.....\n" +
                            "while(condition);\n" +
                            "so the loop start from the do statement and then goes inside the loop to execute whatever line of code are inside it" +
                            " without checking the stop condition then after processing the statements inside it. The do while loops checks for the stop" +
                            "condition here you can see that no matter what the stop conditon is do while loop will surely run once.\n" +
                            "\nExample to get better understanding of do while loop.\n\n" +
                            "\t - - - code - - - \n\n" +
                            "\t#include<stdio.h>\n" +
                            "\tvoid main(){\n" +
                            "\t\tchar choice;\n" +
                            "\t\tdo{\n" +
                            "\t\t\tprintf(\"Do you want to continue?(y/n)\");\n" +
                            "\t\t\tscanf(\"%c\",&choice);\n" +
                            "\t\t}while(choice=='y');\n" +
                            "\t}" +
                            "\n\n" +
                            "code explanation - so if you had tried running this code or have understand some part of it then you might have already realised that" +
                            " it is the same 'Do you want to continue?(y/n) ' statement that was mentioned earlier. so from line 3 we declared a character type" +
                            "variable choice which will store y or n (yes/no) which we will use in condition of our loop then we have do statemnt which will send use" +
                            "inside the loop where we asked that 'Do you want to continue?(y/n)' then if user enters 'y' in the scanf which will store it inside our choice" +
                            " variable then the while(choice == 'y') will check that if 'y' is stored inside the choice variable then it  will run the loop again" +
                            " and if something else is stored inside of it then it will terminate the loop. "
                foot.text = "pls perform all the expamples given in the code section"
            }
            7 -> {
                tv.text = "Nested Loops and Switch Statement"
                im0.setImageResource(R.drawable.s8ih)
                p1.text =
                    "Nested loop is a loop inside of another loop. The above image shows the syntax of the nested loop.\n" +
                            "In the above image we have declared 2 loops and a printf statement inside the inner loop which runs every time" +
                            " the inner loop runs.Each time it prints the total of i variable and the a variable. for the first time when the " +
                            "loop runs the value of a is set to 0 then it goes to the inner loop where i is initialized to 1 and it prints " +
                            " (0+1) 1 then i gets increased to 2 then it prints 2 and when i becomes 3 and then the inner loop stops as the condition" +
                            "gets false(i<3) therefore inner loop finish its execution and then it goes back to the outer loop outer loop increments the " +
                            "value of a to 1 and then again it goes to the inner loop which runs from 1 to 2 and prints the sum and it goes on until the " +
                            "outer loop finish it execution(a<5). "
                sh1.text = "Switch Case"
                p2.text =
                    "switch case statements are similar to the if else conditional statements but sometimes if we want to check the condition on the" +
                            "same operand or same variable then switch statement can save some lines of code and also it uses less number of brackets.The " +
                            "above image show the syntax of switch statement.\n" +
                            "Case is like the else if where it checks that the variable in the switch case follows certain case then the condition " +
                            "corresponding to that case is run and after running the case it goes to the break(break;) keyword which breaks the " +
                            " switch case(ends the switch block and lifecycle of switch ends.). \n default: - default is like the else" +
                            " in if-else when no other condition is satisfied then it is run default case do not require a break statement.\n" +
                            "You will have a better understanding in the next example.\nNote - Case in switch" +
                            " statement end with colon(:) not semi colon(;)"
                im1.setImageResource(R.drawable.s8i1)
                sh2.text = ""
                p3.text = ""
                sh3.text = ""
                p4.text = ""
            }
            8 -> {
                tv.text = "Functions"
                p1.text =
                    "Functions are like machines in real life. Machines helps in our work although making a machine takes effort" +
                            " but after we finish them then they helps us in the task for whatever we made them , Machines do the same work" +
                            " for us so that we don't have to do every time. For example -: Fan is a machine that we made without it we" +
                            " would have to blow air using  some piece of cardboard or so by doing some repetitive motion every time but we" +
                            " made fan to solve this problem and it does the work for us so that we dont have to do the repetitive motion" +
                            ".\n Lets take example of another machine that is Television Remote press 1 it directs us to channel number 1" +
                            "we press volume up button it increases the volume for us so every time we are giving some different type of " +
                            "input it does different type of work for us.\n" +
                            "Functions are no different than machines they are machines but on the software level, they reduce the line of code" +
                            " use and do the same kind of work for us.\n "
                sh1.text = "Writing our first function"
                p2.text = "We will understand it by the following example -:\n" +
                        "\t - - - code - - - \n\n" +
                        "\n\t#include<stdio.h>\n" +
                        "\tvoid add();\t\\\\declaration\n" +
                        "\tvoid main(){\n" +
                        "\t\tadd();\t\\\\calling\n" +
                        "\t}\n\n" +
                        "\tvoid add()\t\\\\definition\n" +
                        "{\n" +
                        "\t\tint a,b,sum;\n" +
                        "\t\tprintf(\"Enter First Number \");\n" +
                        "\t\tscanf(\"%d\",&a);\n" +
                        "\t\tprintf(\"Enter Second Number \");\n" +
                        "\t\tscanf(\"%d\",&b);\n" +
                        "\t\tsum=a+b;\n" +
                        "\t\tprintf(\"Total =%d \",sum);\n" +
                        "\t}\n\n" +
                        "So there are 3 parts in the lifecycle of a function -:\n" +
                        "1.Declaration - : From the above code -in the line 2 'void add(); this is saying that we have declared a function" +
                        " with name add similar to declaring a variable and the rounded brackets after its name denotes that it is a function " +
                        "\n2.Definition - we have declared our function but we also have to define that what it would do, so below the main block" +
                        " at the last of program we have defined our function that we declared earlier we define it inside the curly brackets " +
                        " and everything that we defined inside the curly bracket will run when the function is called. This time we dont use" +
                        "the semi-colon/terminator after the end of function like we did in declaration." +
                        "\n3. Function Calling - now we have declared and defined our function but it won't run until the main() function calls it" +
                        " remember during the start of our course we said main() is like the control center of the program, so to run the function" +
                        " we simply type the name of the function wi" +
                        "th brackets() and then the code inside it get executed.We can call a function as " +
                        "many times as we want. "
                sh2.text = "Return Types"
                p3.text =
                    "we mentioned about the function and even in main() did you notice something? yes it's the word 'void' that " +
                            " has came across many times it simply means nothing or empty, which is a return types" +
                            ".A return type is something that a function returns, return type can be of many types such as -:\n" +
                            "'void','int','float' all type of data types and may more(structure) that we will study later," +
                            "although we have not made any use of " +
                            "it until now because we had return type of our function as 'void' which means the function is returning " +
                            "nothing but later we will use it in many programs ."
                sh3.text = "Arguments and Parameters "
                p4.text =
                    "In the above examples of function we have only seen function with empty brackets it means that we are not sending" +
                            " any thing to the function but we can send values to the function these are known as arguments,this example will make " +
                            " it more clear -:\n\n" +
                            "\t - - - code - - - \n\n" +
                            "\t#include<stdio.h>\n" +
                            "\tvoid add(int a,int b)\t \\\\parameters declared\n" +
                            "\t{\n\t\tint c;\n" +
                            "\t\tc=a+b;\n\tprintf(\"Sum is %d\",c);\n}\n\n" +
                            "\tvoid main(){\n" +
                            "\t\tint x,y;\n\t" +
                            "\tprintf(\"Ist Number -: \");\t scanf(\"%d\",&x);" +
                            "\n\t\tprintf(\"2nd Number -: \");\t scanf(\"%d\",&y);" +
                            "\n\t\tadd(x,y);\n" +
                            "\t}\n" +
                            "First thing that you might have had noticed that we have skipped the function declaration part and directly " +
                            " defined the function this is same as sometime we declare variables like - : \n\t int a;\n\ta=5;\n and sometimes" +
                            " we do it like -:\n\t int a = 5;\n in one line only both are correct.\nNow coming back to our program above about arguments " +
                            "and parameters, so in line 2 you can see that we have passed some values to the function add(the values inside brackets) int a" +
                            "and int b so these are what we call parameters it tell that these are the values that are demanded by function to run or " +
                            "these values should be passed when the function is called.Now in the main function you can see we have first input 2 values " +
                            "in x and y and then we have passed it to function add(x,y); these values that are now being passed to the function is called as the" +
                            " arguments it should be of the same data type of as parameters.\n"
                foot.text =
                    "In next module we will study more about functions before that please perform the programs and quiz in the right sections."
            }
            9 -> {
                tv.text = "Pointers"
                p1.text =
                    "One of the many reason that why C/C++ is recommended for beginners to learn is that it teaches the concept of memory and variable addressing with the help of pointers" +
                            " very well.  " +
                            "\n" +
                            "DO you ever wondered while declaring variables in C that how are they getting stored in the memory or how are they getting retrieved when ever we print " +
                            " or take input.Pointers will help use learn and understand this and then we will see how to apply them in program and even make use of it to great " +
                            "extent."
                sh1.text = "What are Pointers?"
                p2.text =
                    "Every data that you store inside a variable or somewhere in memory has an address associated to it using that address it is retrieved for further use. We can" +
                            " point to the value that is stored at that address by using the name of the variable or by using pointers - point to the memory address.Although you can " +
                            "find the memory address but memory address can be very random, so for our understanding we will use some 5 digit numbers to understand pointers.\n" +
                            "Suppose you have declared a variable int a; you can guess that as integer has a value of 2/4 bytes (depending on the compiler used) so there is a block of " +
                            "2/4 bytes gets reserved in the memory for a with some address for say 20000 so when ever we say a then our compiler will go to retrieve the value at address" +
                            " 20000 but since we have not given any value to int a it stores some garbage value for now so now,\n" +
                            "a=5;\t we have stored an integer value 5 at address 20000, we will retrieve it using the pointers as well as the conventional way but before that we will" +
                            "learn the difference between '*' and '&' "
                sh2.text = "'*' and '&' "
                p3.text =
                    "'&' - if you want to get the address of some variable where its stored in memory then you would have to use the '&' operator like in the previous case where " +
                            "we stored 5 at memory address 20000 in variable a now if we want to print the address of a then we would use &a whihc will give use 20000\n\n" +
                            "'*' - now we have seen how to get address but what if we already have address but we want the value which is stored at that address then we would use " +
                            "the '*' pointer symbol like suppose we have a variable b which is storing 20000 and we want to find out the value at this address then we would use" +
                            " *b which would give us the value present at 20000 address. "
                sh3.text = "Working with pointers "
                p4.text =
                    "we will use the following program to demonstrate the use of pointers in more detail-:\n\n" +
                            "\t- - - code - - - \n" +
                            "\t#include<stdio.h>\n" +
                            "\tvoid main(){\n" +
                            "\t\tint *a,b;\n" +
                            "\t\tb=5;" +
                            "\t\ta=&b;" +
                            "\t\\\\now we will print b using 2 ways\n" +
                            "\t\tprintf(\"b=%d\n\",b);\n" +
                            "\t\tprintf(\"b=%d\n\",*a);\n" +
                            "\t\\\\now we will print the address and then directly use the address\n" +
                            "\t\tprintf(\"address = %p\",&b);\n" +
                            "\t\tprintf(\"address = %\",a);\n" +
                            "\t}\n\n" +
                            "code explanation - from line 3, we have declared a pointer type variable and a integer.The pointer type variable is meant to store address the '*' says" +
                            " to the compiler that its a pointer type variable which will hold and integer value, remember that at the time of printing/accessing or using the pointer" +
                            " type variable if you use * in its name(*a) then it will give the value at that address as a will hold address and *a means point to the address a means " +
                            "the value present at a.\nNow we give b a value 5 after which we given the address of b to our pointer now we printed b, first using the simple method and " +
                            "second using the other method in which we use the pointer a but with '*' it gave use the value present at its address that is why we used the format specifier " +
                            " as %d in second print statement and not %p(%p is te format specifier of pointers used to print address).\nNow in the next part we would print the address for which" +
                            " we would use pointer type format/data type specifier which is '%p' so in the 3rd printf statement we use &b which gives the address of b and in the next printf statement " +
                            " we directly printed the address from the a variable which already stored the address of b.(remember without * the pointer variable gives address)."
                foot.text =
                    "Pointer are a very important part of learning C and for which we recommend you to practice pointer more and more and master them."
            }
            10 -> {
                tv.text = "More about Functions and Pointers"
                p1.text =
                    "In this section we will see about passing pointers to functions and working with them and also what is the difference between passing a value(call by value)" +
                            " and passing the address of the value(reference) and how it affects the value at the address.\n"
                sh1.text = "passing a pointer to function"
                p2.text =
                    "let's understand with the help of this example in which we will add the first number into second number and display the result - :\n" +
                            "\t - - - code - - - \n\n" +
                            "\t#include<stdio.h>\n" +
                            "\tvoid addWithP(int *a,int *b){" +
                            "\n\t\t*b=*a+*b;" +
                            "\n\t}" +
                            "\n\n" +
                            "\tvoid addWithoutP(int a,int b){" +
                            "\n\t\tb=a+b;" +
                            "\n\t}" +
                            "\n" +
                            "\tvoid main()\n\t{\n" +
                            "\t\tint a1=5,b1=7,a2=5,b2=7;\n" +
                            "\t\taddWithP(&a1,&b1);\n" +
                            "\t\taddWithoutP(a2,b2);\n" +
                            "\t\tprintf(\"b1=%d\n\",b1);\n" +
                            "\t\tprintf(\"b2=%d\n\",b2);\n" +
                            "\t}\n\n" +
                            "code exp - in the first function there are 2 pointer type parameters so it will take the address as parameter unlike the second function which just have normal" +
                            " parameters in the 1st function we will add the value directly at the address due to which the original value at the address will change.But in the second function " +
                            " no pointer is being passed so the function creates new variable where it copies the data that is being sent to it in the parameters into that new variables and thus " +
                            "then performs the calculation so it doesn't performs any operation on the original data but on the copy of it due to which the original data stays intact and unchanged" +
                            ". now getting inside the main function now since the first function takes the pointer variables as the parameters so we will send the address of the a1 and b1 as arguments" +
                            " and not their value directly to them and to send the address we use the '&' ampersand operator and second function directly sends the copy of the original values so the " +
                            "output of b1 and b2 will be 12 and 7 respectively. You can see that the value of b1 gets changes but the value of b2 stays the same because b1 was operated at the value at its" +
                            " address due to which its original value changes."


                sh2.text = "Call By Value Vs Call By Reference"
                p3.text =
                    "It is a very popularly asked question in C/C++ about the difference between call by value and call by reference.\n" +
                            "\nCall by Value - When we call a function by passing the value to it which then used as local values and the original values remain unchanged,like in  the " +
                            " case of the above 2nd function in which we sent the values and it didn't affect the original values that is Call by Values.Remember it sends local copies of data " +
                            " not original data .\n" +
                            "Call by Reference - Like in the above first function we passed the address of the variable due to which the original value was also affected from the operation and " +
                            " this is what is called Call by Reference (Reference as the word means address)" +
                            "The above program was the example for call by value vs call by reference there is one more very popular example about it. In the code section to right which will make it more clear."
                sh3.text = "Returning a pointer"
                p4.text =
                    "The last thing in this pointers with function section is returning a pointer while we will be learning with the help of this example -:" +
                            "\n" +
                            "\t - - - code - - - \n\n" +
                            "\t#include<stdio.h>\n" +
                            "\tint* big(int *a,int *b){\n" +
                            "\t\tif(a>b)\n" +
                            "\t\t\treturn &a;\n" +
                            "\t\telse\n" +
                            "\t\t\treturn &b;\n" +
                            "\t}\n" +
                            "\tvoid main(){\n" +
                            " \t\tint a,b;" +
                            "\n\t\tint *big_num;" +
                            "\t\tprintf(\"Enter 1st Number \");\n" +
                            "\t\tscanf(\"%d\",&a);\n "+
                            "\t\tprintf(\"Enter 2nd Number \");\n" +
                            "\t\tscanf(\"%d\",&b);\n " +
                            "\t\tbig_num = big(&a,&b);\n" +
                            "\t\tprintf(\"Bigger Number = %d\",*big_num);" +
                            "\n\t}\n" +
                            "before you proceed to code explanation we recommend you to go through the program and rrun it in yourself and understand so that you get good " +
                            "practise of pointers\n" +
                            "code explanation - : "
            }
            11->{
                tv.text="Arrays"
                p1.text="Imagine a situation like in a class there are 50 students and you have to store their names, so " +
                        "you would probably declare 50 variables to store each name but don't you think that declaring 50 variables" +
                        " to store the same type of data for same type of data will be a very bad idea and actually it will also" +
                        " take too much time. So we hae arrays which are collection of similar data types. "
                sh1.text="Working with Arrays "
                p2.text="First we declare an array and syntax for it is as follows=:\n" +
                        "\t 1st way to declare an array\n" +
                        "\tdata_type name[array_length];\n" +
                        "for example-: int a[50];\t here we declared an array of 50 integer type variables in one go" +
                        "\n\t 2nd way to declare an array\n" +
                        "\tdata_type name[]={data};\n" +
                        "for ex-:  int a[]={23,45,11}; \n" +
                        "here we have declared an integer type array inside which we have stored 3 values;\n" +
                        "TO access an array we do it like a[0] which gives the data present at first position or the zero index in the" +
                        " array,the index is the number that we give inside the square brackets that specifies the position of data" +
                        " that we want to access from the array and remember that the index for array starts from zero and goes to" +
                        "the total length - 1(l-1),for example if you have an array a of 10 elements then ist element will be located " +
                        "at a[0] and the last element will be accessed as a[9], all these will be more clear with the example below.\n" +
                        "\t - - - code - - - \n\n" +
                        "\t#incldude<stdio.h>\n" +
                        "\tvoid main(){\n" +
                        "\t\tint a[10],i;\n" +
                        "\t\tfor(i=0;i<10;i++){\n" +
                        "\t\tprintf(\"Enter Value in position no.%d =\",i);\n" +
                        "\t\tscanf(\"%d\",&a[i]);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\nHere are all the values inside the array\n\");\n" +
                        "\t\tfor(i=0;i<10;i++){\n" +
                        "\t\tprintf(\"%d\t\",a[i]);\n" +
                        "\t\t}\n" +
                        "\t}\n\n" +
                        " code exp - so here we have first declared an int array of 10 elements we can add values to each " +
                        "elements manually like a[0] =3,a[1] =4 ....so on, but that would be too much time so we used a loop" +
                        " of 10 then asked the user to input the values and then whenever we input the value of i changes as " +
                        " the loop proceeds and therefore every time we are inputting to the next element in the array.\n" +
                        "then at last we run the loop again to print the values inside the array,here you might have realised that how much array " +
                        "saves the time and lines of code for us that we were able to take 10 inputs and do 10 outputs in just 4 or 5 lines of code."

                sh2.text="String - Array of characters"
                p3.text="String as the name means is a chain of characters like Apple its made from A,p,p,l,e which is a combination " +
                        "of characters. It can contain any alphabetical character and numbers and many special characters like 'Apple 2'," +
                        "'tony@gmail.com' all are valid strings but some characters such as back slash \\ are not simple to store in string." +
                        " Although most other programming languages have a dedicated data type called String for storing strings but in C" +
                        " we have to store it inside the array of characters.\n" +
                        "To declare a string in C the syntax is as follows-:\n" +
                        "char name[String_Length] = \"String\";\n" +
                        "Here's a program to understand the concept in more detail -:\n" +
                        "In this program we will declare a string and then print the individual character with spaces in between.\n" +
                        "\t - - - code - - - \n" +
                        "\n" +
                        "\t#include<stdio.h> \n" +
                        "\tvoid main(){\n" +
                        "\t\tchar str[10]=\"TURBOSNAIL\";\n" +
                        "\t\tint i;\n" +
                        "\t\tfor(i=0;i<10;i++){\n" +
                        "\t\t\tprintf(\"%c\t\",str[i]);\n" +
                        "\t\t}\n" +
                        "\t}\n\n" +
                        "code explanation - : as we talked before to declare a string in C we use a character array so we declare a array of characters str of length 10 and stored " +
                        " 'TURBOSNAIL' string in it. Then we used a loop of 10 iterations(repetitions) to print our str string, remember as its an array so it will follow the indexing of arrays" +
                        " that is ist character at position 0 and last at 9 (10 - 1). "

                sh3.text="Some operations on Strings"
                p4.text="\n\tFinding Length of String\n\n" +
                        "\tIn the previous program we knew that our string was of length 10 but what if we don't know about the length" +
                        " of the given string or we need to perform some operations on string but it requires us to know about the length" +
                        " of string, So there are mainly 2 methods for this one of the method you will find in the code section to the right and the " +
                        "other method is here where we will use the header file <String.h>.We will see using this program -: \n" +
                        "\t - - - code - - - \n" +
                        "\t#include<string.h>\n" +
                        "\t#include<stdio.h>\n" +
                        "\tvoid main(){\n" +
                        "\t\tchar str[20];\n" +
                        "\t\tint ln;\n" +
                        "\t\tprintf(\"Enter a string between 0 to 20 words \n\");\n"
                        "\t\tscanf(\"%s\",str);\n" +
                        "\t\tln=strlen(str);\n" +
                        "\t\tprintf(\"Length of given string is %d\",ln);\n" +
                        "\t\tprintf(\"The given string is -: %s \n\",str);\n" +
                        "\t\tprintf(\"\nNow we will print the string in reverse \n" +
                        "\t\tfor(i=ln-1;i>=0;i--){\n" +
                                "\t\t\tprintf(\"\t%c\",str[i]);"+
                                "\n\t\t}\n\t}" +
                        "\n\ncode explanation - : here in this program we use the string.h header file remember that header file is a library " +
                                "of many necessary functions and more that we use and they helps us in our program, so in this string.h header file" +
                                " it many contains string related functions such as a strlen() function which gives us the length of string in integer" +
                                " that we put inside its brackets,now back to our program we initialized a 20 length string and now user can insert any " +
                                "length of string between 0 to 20 above it, the program will not take the string letters after 19 index.\n\t" +
                                "if you already have noticed it better and if not then see that in scanf statement we have not used '&' character which " +
                                "as i told you before tell the address at which data is to be stored.We will talk about it in the next section where we will " +
                                "learn more about pointers and array and addressing after that we used the above mentioned strlen() function to calculate the length" +
                                " of the string that user has entered after that we print the string using %s format specifier which tells its string and here we used" +
                                " just the name of the string and not the square brackets to print the full string, after that we used a loop that run backwards from" +
                                " the end of the string(ln-1 because the indexing goes to the length - 1 and starts from zero), to the starting index 0 which will " +
                                "print the string backwards.This part might be little hard to get if you are very new to programming but understand this part very " +
                                "thoroughly and don't move to next part until you understand this part because it will strength you knowledge about strings which will be " +
                                "very much need for becoming good programmer."

            }
            12 ->{
                tv.text = "Pointers in Arrays"
                p1.text = "We know that to access the elements of the array we use the name of the array with the square brackets " +
                        "but to know how these all work under the hood and how actually the program is finding them, these array elements" +
                        " in the memory is related to pointers."
                sh1.text = "Name of the Array is a Pointer"
                p2.text = "Suppose we have a array a[5] so the name of the array - a is a pointer that points to the location of the" +
                        " zeroth element of the array.How this works is that when we declare a a[5] variable the compiler reserves a block" +
                        " of storage of size of the 5 integers i.e. 10 bytes (if we take int as 2 bytes) in the memory and divides it into" +
                        " 5 parts where the address of the first part is given to the a(without square brackets) which in itself is" +
                        " a pointer,if you write *a or *(a+0) it will do the same work as a[0] and give you the first element of the array.\n\t" +
                        "Remember in the last section when we were inputting string we didn't write '&' ampersand symbol in the scanf(\"%s\",str);" +
                        " we missed the '&' because the str[20] was a character array and the str itself is a pointer which means it already holds " +
                        "some address so we don't need the '&' to get the address for the scanf(). "
                sh2.text = "Accessing ll elements with pointers"
                p3.text = "Now we know that to access first element of the array without using the square brackets we do it by" +
                        "*(a+0) or *a. To access the other elements of the array -: *(a+element_index) ,for second element *(a+1)" +
                        " to access the third element *(a+2) and so on. When we declare a array suppose of 5 elements - a[5] mem1ory" +
                        " gets divided into 5 parts  with each having address as a,a+1,a+2.... so to access elements there -*(a),*(a+1)" +
                        " *(a+2),..... so on.\n\n" +
                        "Lets access the elements of the array using the pointer notations in the following program -:\n" +
                        "\n\t - - - code - - - \n" +
                        "\t#include<stdio.h>\n" +
                        "\tvoid main(){\n" +
                        "\t\tint a[]={10,20,40,80,160},i;\n" +
                        "\t\tfor(i=0;i<5;i++)\n" +
                        "\t\t\tprintf(\"Element No %d is = %d\",i,*(a+i));\n" +
                        "\t}\n" +
                        "\ncode explanation - we declare an array of 5 elements and as we know that using pointer elements will " +
                        "be accessed as *(a+0),*(a+1).. so we put it inside a loop of 5 and *(a+i) will give the elements of the array " +
                        "as the value of i changes from 0 to 4. Practice this program and try to implement more array based program using this " +
                        "method."
                sh3.text="Dynamic Memory Allocation"
                p4.text="Although this topic needs good understanding of pointers and if in future you will learn data structure in C" +
                        " then you will have to understand dynamic memory allocation but i will introduce the basics of this for now." +
                        "\n\tTo understand dynamic memory allocation first we need to know what is Static memory allocation. Memory allocation" +
                        " as its name tells is to reserve some memory for some data type. As we have done until now whenever we declare a variable" +
                        "like int a[5]; we are allocating some storage for this variable suppose 10 bytes in this case but suppose if user only" +
                        "enters data in the 3 out of 5 elements of the array a then the 2 storage spaces are getting unused and we are having memory wastage." +
                        " This is Static Memory allocation that once we have declared the variables we are unable to change the storage allocated to them and also" +
                        " we cannot allocate or declare some variables at the run time because we won't be able to give storage/memory to them in the" +
                        " static method. Now to solve this problem we have dynamic memory allocation in which we can change/reallocate and free the memory " +
                        " that we decide to give or change. It mainly has 3 functions to do so i.e. - malloc(),free(),realloc(). Which you will" +
                        "study about later when you read about data structure or you probably would use them in list,nodes,stack,queue,trees,graphs etc."
                foot.text="Although we have finished about pointers in beginner level but you should practice pointers as they have many" +
                        " use in C and many programs are based on pointers and dynamic memory allocation in competitive program so it would" +
                        " be very beneficial to master these."
            }
        }
        //tv.text=c_id.toString()
        return view
    }
}