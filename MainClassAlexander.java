import java.util.Scanner;

public class MainClassAlexander {
    //write the shortcut for making a main method
    public static void main(String[] args) {
        //output Hello world
        System.out.println("Hello world");
        System.out.println("-------------------");

        //make a while loop which prints out hello world 100 times
        //(don't forget to declare your variable first, and
        int i = 0;
        while (i < 100) {
            System.out.println("hello world");
            //increment it each time through the loop.
            i++;
        }

        //print out a diving line between each question, like "-------------------"
        System.out.println("-------------------");

        //do the same looping thing as you just did, only with a for loop
        for (int j = 0; j < 100; j++) {
            System.out.println("hello world");
        }

        //remember to print out a dividing line between each question
        System.out.println("-------------------");

        //Now, output the even numbers between and including 10 and 60
        //using a for loop
        for (int j = 10; j < 61; j += 2) {
            System.out.println(j);
        }
        System.out.println("-------------------");

        //and now a for loop printing out 15 to -35 (inclusive) down by
        //5 each time (so 15, 10, 5, 0, -5.... -30, -35
        for (int j = 15; j > -36; j -= 5) {
            System.out.println(j);
        }
        System.out.println("-------------------");

        //Write a line to declare an array of 5 ints called myIntArray.
        int [] myIntArray = new int [5];

        //Write a line to declare an array called dArray, which is 10 doubles.
        double [] dArray = new double [10];

        //Write a line to declare an array called spiritWeek, which is 5 Strings.
        String [] spiritWeek = new String [5];

        //Write a line to declare an array called stevenFloats, which is 7 floats.
        float [] stevenFloats = new float [7];

        //Assign each of the elements of the int array above to be a number between 1 and 100.
        for (int j = 0; j < myIntArray.length; j++) {
            myIntArray[j] = (int) (Math.random() * 100);
        }

        //Declare a variable of each integer data type of Java,
        //and comment how many bits each takes
        byte b; // 8 Bits
        short s; // 16 Bits
        int intI; // 32 Bits
        long l; // 64 Bits

        //Declare a variable of each real number data type of Java,
        //and comment how many bits each takes
        //
        float f; // 32 Bits
        double d; // 64 Bits

        //     GROUP QUESTION - You can solve this one together:
        //        Given that the range of values byte can represent is:
        //        byte: -2^7 <--> 2^7-1
        //        What is the range of values each integer data type can store?
        //        Answer: An int can store a range of values from -2^31 <--> 2^31-1
        //        Now assign each of the integer variables above a number close to its upper limit.
        b = 7;
        s = 32767;
        intI = 2147483646;
        l = 2000000000;
        //declare a boolean called isRaining and assign it false
        boolean isRaining = false;

        //write a conditional in which if isRaining is true,
        //print out "Take your rain coat with you.",
        //and if the isRaining variable is false, print out "No need for a raincoat".
        if (isRaining) {
            System.out.println("Take your rain coat with you.");
        } else {
            System.out.println("No need for a raincoat");
        }
        System.out.println("-------------------");

        //Declare a Scanner object called sc. (Be sure it is imported properly....)
        Scanner sc = new Scanner(System.in);

        //Ask the user the grade they got on the test (0 - 100)
        System.out.println("What grade did you get on the test? (0 - 100)");

        //Assign that to an int variable called score.
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
            System.out.println("below C");
        }
        System.out.println("-------------------");

        //******* Plus, method calling, and parameter passing.

        //Call a method here which is named method1(), and then implement it below,
        //right after the main method.
        //All that method1() is to do is print out "This is from method1."
        method1();
        System.out.println("-------------------");

        //Next, call a method here named method2(), and send to it two parameters,
        //which will be two ints. Then implement the method below, right after method1();
        //It is to take those two numbers, and print out their sum.
        method2(4, 6);

    }

    public static void method1() {
        System.out.println("This is from method1.");
    }

    public static void method2(int a, int b) {
        System.out.println(a + b);
    }
}
