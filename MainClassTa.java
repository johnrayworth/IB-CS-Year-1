package com.company;

import java.util.Scanner;

public class MainClassTa {

    public static void main(String[] args) {

        //write the shortcut for making a main method
        //output Hello world

        System.out.println("Hello World");

        //make a while loop which prints out hello world 100 times
        //(don't forget to declare your variable first, and
        //increment it each time through the loop.

        int i = 0;
        while (i < 100) ;
        System.out.println("Hello World");
        i++;

        //print out a diving line between each question, like "-------------------"

        System.out.println("----------------");

        //do the same looping thing as you just did, only with a for loop

        for (int j = 0; j < 100; j++) {
            System.out.println("Hello World");
        }

        //remember to print out a dividing line between each question
        //Now, output the even numbers between and including 10 and 60
        //using a for loop

        System.out.println("----------------");
        for (int j = 10; j < 61; j += 2) {
            System.out.println(j);
        }

        //and now a for loop printing out 15 to -35 (inclusive) down by
        //5 each time (so 15, 10, 5, 0, -5.... -30, -35

        System.out.println("------------");
        for (int k = 15; k > -36; k -= 5) {
            System.out.println(k);
        }

        System.out.println("------------");

        //Write a line to declare an array of 5 ints called myIntArray.

        int[] myIntArray = new int[5];

        //Write a line to declare an array called dArray, which is 10 doubles.

        double[] dArray = new double[10];

        //Write a line to declare an array called spiritWeek, which is 5 Strings.

        String[] spiritWeek = new String[5];

        //Write a line to declare an array called stevenFloats, which is 7 floats.

        float[] stevenFloats = new float[7];

        //Assign each of the elements of the int array above to be a number between 1 and 100.

        myIntArray[0] = 2;
        myIntArray[1] = 4;
        myIntArray[2] = 8;
        myIntArray[3] = 16;
        myIntArray[4] = 32;

        System.out.println("-------------");

        //Declare a variable of each integer data type of Java,
        //and comment how many bits each takes
        //

        byte b; //8 bits
        short s; //16 bits
        int p; //32 bits
        long l; //64 bits

        //Declare a variable of each real number data type of Java,
        //and comment how many bits each takes
        //

        float f; //32 bits
        double d; //64 bits

        //GROUP QUESTION - You can solve this one together:
        //Given that the range of values byte can represent is:
        //byte: -2^7 <--> 2^7-1
        //What is the range of values each integer data type can store?

        System.out.println("---------------");
        byte c = 127;//8 bits | range: -2^7 ~ (2^7)-1
        short h = 32767;//16 bits | range: -2^15 ~ (2^15)-1
        int v = 214748367;//32 bits | range: -2^31 ~ (2^31)-1
        long a = 9223372036854775807l;//64 bits | range: -2^63 ~ (2^63)-1


        //Now assign each of the integer variables above a number close to its upper limit.
        //declare a boolean called isRaining and assign it false

        boolean isRaining = false;

        //write a conditional in which if isRaining is true,
        //print out "Take your rain coat with you.",
        //and if the isRaining variable is false, print out "No need for a raincoat".

        if (isRaining) {
            System.out.println("Take your rain coat with you.");
        } else {
            System.out.println("No need for a raincoat.");
        }

        System.out.println("-----------------");

        //Declare a Scanner object called sc. (Be sure it is imported properly....)
        //Ask the user the grade they got on the test (0 - 100)
        //Assign that to an int variable called score.

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, what grade did you get from 0-100?");
        int score = sc.nextInt();

        //Now, write a conditional block in which if the score is
        //over 89, output A
        //else if over 79, output B
        //else if over 69, output C
        //else output below C

        if (score > 89) {
            System.out.println("A");

        } else if (score > 79) {
            System.out.println("B");
        } else if (score > 69) {
            System.out.println("C");
        } else {
            System.out.println("Below C.");

            //******* Plus, method calling, and parameter passing.

            //Call a method here which is named method1(), and then implement it below,
            //right after the main method.
            //All that method1() is to do is print out "This is from method1."

            method1();

            System.out.println("---------------");

            method2(4, 20);
        }
    }

    public static void method1(){
        System.out.println("This is from method1.");
    }

    //Next, call a method here named method2(), and send to it two parameters,
    //which will be two ints. Then implement the method below, right after method1();
    //It is to take those two numbers, and print out their sum.

    public static void method2(int a, int b){
        System.out.println(a + b);
    }
}
