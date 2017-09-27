package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //write the shortcut for making a main method
        System.out.println("public static void main(String[] args) { }");
        System.out.println("--------------------");
        //output Hello world
        System.out.println("Hello World!");
        System.out.println("--------------------");
        //make a while loop which prints out hello world 100 times
        //(don't forget to declare your variable first, and
        //increment it each time through the loop.
        int i = 0;
        while (i < 100) {
            System.out.println("Hello world.");
            i++;
        }


        //print out a diving line between each question, like "-------------------"
        System.out.println("--------------------");
        //do the same looping thing as you just did, only with a for loop
        for (int k = 0; k < 100; k ++) {
            System.out.println("Hello World!");
        }

        //remember to print out a dividing line between each question
        System.out.println("--------------------");
        //Now, output the even numbers between and including 10 and 60
        //using a for loop
        for (int a = 10; a < 62; a += 2){
            System.out.println(a);
        }
        System.out.println("--------------------");
        //and now a for loop printing out 15 to -35 (inclusive) down by
        //5 each time (so 15, 10, 5, 0, -5.... -30, -35
        for (int b = 15; b < -40; b -= 5){
            System.out.println(b);
        }
        System.out.println("This doesn't work for some reason :/");
        // lines 40-42 looks okay to me

            //Write a line to declare an array of 5 ints called myIntArray.
            int [] myIntArray = new int[5];

            //Write a line to declare an array called dArray, which is 10 doubles.
            double [] dArray = new double[10];

            //Write a line to declare an array called spiritWeek, which is 5 Strings.
            String [] spiritWeek = new String[5];

            //Write a line to declare an array called stevenFloats, which is 7 floats.
            float [] stevenFloats = new float[7];

            //Assign each of the elements of the int array above to be a number between 1 and 100
            myIntArray[0] = 34;
            myIntArray[1] = 45;
            myIntArray[2] = 99;
            myIntArray[3] = 2;
            myIntArray[4] = 33;

            //Declare a variable of each integer data type of Java,
            //and comment how many bits each takes

            // 8 bits
            byte bite;

            // 16 bits
            short shorty;

            // 32 bits
            int 1;

            // 64 bits
            long l;

            //Declare a variable of each real number data type of Java,
            //and comment how many bits each takes

            // 32 bits
            float sink;

            // 64 bits
            double uno;


            //     GROUP QUESTION - You can solve this one together:
            //        Given that the range of values byte can represent is:
            //        byte: -2^7 <--> 2^7-1
            //        What is the range of values each integer data type can store?

            //          -128 and 127 respectively

            //        Now assign each of the integer variables above a number close to its upper limit.


            //declare a boolean called isRaining and assign it false

            boolean isRaining = false

            //write a conditional in which if isRaining is true,

            //print out "Take your rain coat with you.",
            //and if the isRaining variable is false, print out "No need for a raincoat".

            if(isRaining){
                System.out.println("Don't get hypothermia!");

            //Declare a Scanner object called sc. (Be sure it is imported properly....)

                System.out.println("Didn't get to finish!");

            //Ask the user the grade they got on the test (0 - 100)
            //Assign that to an int variable called score.


            //Now, write a conditional block in which if the score is
            //over 89, output A
            //else if over 79, output B
            //else if over 69, output C
            //else output below C


            //******* Plus, method calling, and parameter passing.

            //Call a method here which is named method1(), and then implement it below,
            //right after the main method.
            //All that method1() is to do is print out "This is from method1."


            //Next, call a method here named method2(), and send to it two parameters,
            //which will be two ints. Then implement the method below, right after method1();
            //It is to take those two numbers, and print out their sum.
        }
    }

