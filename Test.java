
// Gabriel Wright

import java.util.Scanner;

public class Test {

    //write the shortcut for making a main method
    public static void main(String[] args) {

        //output Hello world
        System.out.println("Hello world");

        //make a while loop which prints out hello world 100 times
        //(don't forget to declare your variable first, and
        //increment it each time through the loop.
        int i = 0;
        while(i < 100){
            System.out.println("hello world ");
            i++;
        }
        //print out a diving line between each question, like "-------------------"
        System.out.println("-------------------");

        //do the same looping thing as you just did, only with a for loop
        for(int k = 0; k < 100; k++){
            System.out.println("hello world");
        }
        System.out.println("--------------------");
        //remember to print out a dividing line between each question
        //Now, output the even numbers between and including 10 and 60
        //using a for loop
        for(int j = 10; j < 62; j+=2)
            System.out.println(j);

        System.out.println("--------------------");

        //and now a for loop printing out 15 to -35 (inclusive) down by
        //5 each time (so 15, 10, 5, 0, -5.... -30, -35
        for(int l = 15; l > -40; l-=5)
            System.out.println(l);

        System.out.println("-----------------------");

        //Write a line to declare an array of 5 ints called myIntArray.
        new int[5] = myIntArray();
        //Write a line to declare an array called dArray, which is 10 doubles.
        new double[10] = dArray();
        //Write a line to declare an array called spiritWeek, which is 5 Strings.
        new String[5] = spiritWeek();
        //Write a line to declare an array called stevenFloats, which is 7 floats.
        new float[7] = stevenFloats();
        //Assign each of the elements of the int array above to be a number between 1 and 100.

        //Declare a variable of each integer data type of Java,
        //and comment how many bits each takes
        //
        byte a =  125; //8
        short b = 31121; //16
        int c = 1999999987; //32
        long d = 234213463; //64

        //Declare a variable of each real number data type of Java,
        //and comment how many bits each takes
        //

        float e = 32; //32
        double f = 64; //64

        //     GROUP QUESTION - You can solve this one together:
        //        Given that the range of values byte can represent is:
        //        byte: -2^7 <--> 2^7-1
        //        What is the range of values each integer data type can store?
        //        -32,000 <--> 32,000
        //        Now assign each of the integer variables above a number close to its upper limit.


        //declare a boolean called isRaining and assign it false
        boolean isRaining = false;

        //write a conditional in which if isRaining is true,
        //print out "Take your rain coat with you.",
        if (isRaining = true){
        System.out.println("Take a raincoat. ");
    }
        //and if the isRaining variable is false, print out "No need for a raincoat".
        else if (isRaining = false ){
            System.out.println("No need for a raincoat. ");
        }

        //Declare a Scanner object called sc. (Be sure it is imported properly....)
        //Ask the user the grade they got on the test (0 - 100)
        //Assign that to an int variable called score.
        new Scanner[arr]= sc.Scanner;
        System.out.println("What was the grade on the test? 0 - 100 ");
        int score;


        //Now, write a conditional block in which if the score is
        //over 89, output A
        //else if over 79, output B
        //else if over 69, output C
        //else output below C
        if (score > 89){
            System.out.println("A");
        }
        else if (score > 79){
            System.out.println("B");
        }
        else if (score > 69){
            System.out.println("C");
        }
        else (score < 69){
            System.out.println("C");
        }

        //******* Plus, method calling, and parameter passing.

        //Call a method here which is named method1(), and then implement it below,
        //right after the main method.
        //All that method1() is to do is print out "This is from method1."
        new method1();
        //Next, call a method here named method2(), and send to it two parameters,
        new method2() = int r, int v;
        //which will be two ints. Then implement the method below, right after method1();
        //It is to take those two numbers, and print out their sum.
    }
    method1(){
        System.out.println("This is from method1. ");
    }
    method2(){
        System.out.println(Math (int r = 3 + int v = 4);
    }

}
