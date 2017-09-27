package com.company;

import java.util.Scanner;

public class MainClassPiyaornProud {
    //write the shortcut for making a main method
    public static void main(String[] args) {

        //output Hello world

        System.out.println("Hello World");

        methodSpacer();

        //make a while loop which prints out hello world 100 times

        int i = 0;
        while(i < 100){
            System.out.println("Hello World "+ i);
            i++;
        }

        //(don't forget to declare your variable first, and
        //increment it each time through the loop.

        methodSpacer();

        //print out a diving line between each question, like "-------------------"
        //do the same looping thing as you just did, only with a for loop

        for(i = 0; i < 100; i++){
            System.out.println("Hello World "+ i);
        }

        methodSpacer();

        //remember to print out a dividing line between each question
        //Now, output the even numbers between and including 10 and 60
        //using a for loop

        for(int a = 10; a < 61; a+=2){
            System.out.println(a);
        }

        methodSpacer();

        //and now a for loop printing out 15 to -35 (inclusive) down by
        //5 each time (so 15, 10, 5, 0, -5.... -30, -35

        for(int b = 15; b > -36; b-=5){
            System.out.println(b);
        }

        methodSpacer();

        //Write a line to declare an array of 5 ints called myIntArray.
        int [] myIntArray = new int[5];
        //Write a line to declare an array called dArray, which is 10 doubles.
        double [] dArray = new double[10];
        //Write a line to declare an array called spiritWeek, which is 5 Strings.
        String [] spiritWeek = new String[5];
        //Write a line to declare an array called stevenFloats, which is 7 floats.
        float [] stevenFloats = new float[7];

        //Assign each of the elements of the int array above to be a number between 1 and 100.

        myIntArray[0] = 3;
        myIntArray[1] = 36;
        myIntArray[2] = 45;
        myIntArray[3] = 56;
        myIntArray[4] = 68;

        //Declare a variable of each integer data type of Java,
        //and comment how many bits each takes

        int myInt;//32 bits
        short myShort;//16 bits
        long myLong; //64 bits
        byte myByte; //8 bits

        //Declare a variable of each real number data type of Java,
        //and comment how many bits each takes
        //

        float myFloat = 0; //32 bits
        double myDouble = 0;//64 bits

        //     GROUP QUESTION - You can solve this one together:
        //        Given that the range of values byte can represent is:
        //        byte: -2^7 <--> 2^7-1
        //        What is the range of values each integer data type can store?
        //        Now assign each of the integer variables above a number close to its upper limit.

        int intLimit = 2147483647; // -2^31 -> 2^31
        short shortLimit = 32000; // -2^15 -> 2^15
        long longLimit = 2139999999; // -2^63 -> 2^63
        byte byteLimit = 127; // -2^7 -> 2^7

        //declare a boolean called isRaining and assign it false

        boolean isRaining = false;

        //write a conditional in which if isRaining is true,
        //print out "Take your rain coat with you.",
        //and if the isRaining variable is false, print out "No need for a raincoat".

        if(isRaining = true){
            System.out.println("Take your rain coat with you.");
        }
        else{
            System.out.println("No need for a rain coat.");
        }

        methodSpacer();

        //Declare a Scanner object called sc. (Be sure it is imported properly....)
        //Ask the user the grade they got on the test (0 - 100)
        //Assign that to an int variable called score.
        Scanner sc = new Scanner(System.in);
        System.out.println("What grade did you get on the test? (0 - 100)");

        int score = sc.nextInt();

//Now, write a conditional block in which if the score is
        //over 89, output A
        //else if over 79, output B
        //else if over 69, output C
        //else output below C

        if(score > 89){
            System.out.println("A");
        }
        else if(score > 79){
            System.out.println("B");
        }
        else if(score > 69){
            System.out.println("C");
        }
        else{
            System.out.println("Below C");
        }

        methodSpacer();

        System.out.println(method2(4,5));

        methodSpacer();

        method1();

        //******* Plus, method calling, and parameter passing.

    }
    public static void methodSpacer(){
        System.out.println("----------");
    }

    //Call a method here which is named method1(), and then implement it below,
    //right after the main method.
    //All that method1() is to do is print out "This is from method1."

    public static void method1(){
        System.out.println("This is from method 1.");
    }

    //Next, call a method here named method2(), and send to it two parameters,
    //which will be two ints. Then implement the method below, right after method1();
    //It is to take those two numbers, and print out their sum.

    public static int method2(int x, int y){
       return x + y;
    }
}
