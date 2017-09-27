import java.util.Scanner;

public class MainClassLucas {
    //write the shortcut for making a main method
    public static void main(String[] args) {


        //output Hello world
        System.out.println("Hello world");

        //make a while loop which prints out hello world 100 times
        //(don't forget to declare your variable first, and
        //increment it each time through the loop.
        int i = 0;
        while( i < 100){
            System.out.println("hello world 1");
            i++;
        }




        //print out a diving line between each question, like "-------------------"
        System.out.println("------------------------");

        //do the same looping thing as you just did, only with a for loop
        for(int l = 0; l < 100; l++){
            System.out.println("hello world 2");
        }


        //remember to print out a dividing line between each question

        System.out.println("-------------------------");
        //Now, output the even numbers between and including 10 and 60
        //using a for loop
        for(int k = 10; k < 61; k+=2){
            System.out.println("hello world 3");
        }

        System.out.println("-----------------------");

        //and now a for loop printing out 15 to -35 (inclusive) down by
        //5 each time (so 15, 10, 5, 0, -5.... -30, -35
        for(int p = 15; p > -36; p-=5){
            System.out.println("hello world 4");
        }

        System.out.println("-------------------------");
        //Write a line to declare an array of 5 ints called myIntArray.
        int[5] myIntArray;

        //Write a line to declare an array called dArray, which is 10 doubles.
        double[10] dArray;

        //Write a line to declare an array called spiritWeek, which is 5 Strings.
        String[5] spiritWeek;

        //Write a line to declare an array called stevenFloats, which is 7 floats.
        float[7] stevenFloats;

        //Assign each of the elements of the int array above to be a number between 1 and 100.


        myIntArray = 9;
        dArray = 15;
        spiritWeek = 24;
        stevenFloats = 34;



        //Declare a variable of each integer data type of Java,
        //and comment how many bits each takes
        //
        byte b; // = 8 bits
        short s; // = 16 bits
        double d; // = 32 bits
        long l; // = 64 bits


        //Declare a variable of each real number data type of Java,
        //and comment how many bits each takes
        float f; // = 16 bits
        boolean b; // = 32 bits
        //


        //     GROUP QUESTION - You can solve this one together:
        //        Given that the range of values byte can represent is:
        //        byte: -2^7 <--> 2^7-1
        //        What is the range of values each integer data type can store?
        //
        //        Now assign each of the integer variables above a number close to its upper limit.


        //declare a boolean called isRaining and assign it false
        boolean isRaining = false;

            //write a conditional in which if isRaining is true,

            if System.out.println("Take your rain coat with you");

        else if System.out.println("No need for raincoat");

        //print out "Take your rain coat with you.",
        //and if the isRaining variable is false, print out "No need for a raincoat".


        //Declare a Scanner object called sc. (Be sure it is imported properly....)
        //Ask the user the grade they got on the test (0 - 100)
        //Assign that to an int variable called score.
        Scanner = sc(System.in);


        System.out.println("What is your score?");

        //Now, write a conditional block in which if the score is
        //over 89, output A
        //else if over 79, output B
        //else if over 69, output C
        //else output below C
        if(sc > 89){
            System.out.println("A");
        }
        else if(sc > 79){
            System.out.println("B");
        }
        else if(sc > 69){
            System.out.println("C");
        }


        //******* Plus, method calling, and parameter passing.

        //Call a method here which is named method1(), and then implement it below,
        //right after the main method.
        //All that method1() is to do is print out "This is from method1."

        method1();
        method2();


        //Next, call a method here named method2(), and send to it two parameters,
        //which will be two ints. Then implement the method below, right after method1();
        //It is to take those two numbers, and print out their sum.
        System.out.println("This is from method 1");
        System.out.println("This is from method 2");

    }

}
