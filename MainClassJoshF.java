import java.util.Scanner;

public class MainClassJoshF {

    public static void main(String[] args) {

        //write the shortcut for making a main method
        //output Hello world
        System.out.println("Hello world.");

        //make a while loop which prints out hello world 100 times
        //(don't forget to declare your variable first, and
        //increment it each time through the loop.

        int i = 0;
        while(i < 101){
            System.out.println("hello world");
            i++;
        }

        System.out.println("-------------");



        //print out a diving line between each question, like "-------------------"

        //do the same looping thing as you just did, only with a for loop

        for(int x = 0; x < 101; x++){
            System.out.println("hello world");
        }

        System.out.println("-------------");


        //remember to print out a dividing line between each question
        //Now, output the even numbers between and including 10 and 60
        //using a for loop

        for(int even = 10; even < 61; even+=2){
            System.out.println(even);
        }

        System.out.println("-------------");

        //and now a for loop printing out 15 to -35 (inclusive) down by
        //5 each time (so 15, 10, 5, 0, -5.... -30, -35

        for(int inc = 15; inc > -36; inc-=5){
            System.out.println(inc);
        }

        System.out.println("-------------");

        //Write a line to declare an array of 5 ints called myIntArray.

        int[]myIntArray = new int[5];

        //Write a line to declare an array called dArray, which is 10 doubles.

        double[]dArray = new double[10];


        //Write a line to declare an array called spiritWeek, which is 5 Strings.

        String[]spiritWeek = new String[5];

        //Write a line to declare an array called stevenFloats, which is 7 floats.

        float[]stevenFloats = new float[7];


        //Assign each of the elements of the int array above to be a number between 1 and 100.

        myIntArray[0] = 23;
        myIntArray[1] = 51;
        myIntArray[2] = 92;
        myIntArray[3] = 78;
        myIntArray[4] = 66;



        //Declare a variable of each integer data type of Java,
        //and comment how many bits each takes
        //

        byte b = 126;//8 bits
        short s = 32766;//16 bits
        long l = 9^18;//64 bits
        int i1 = 2147483647;//32 bits


        //Declare a variable of each real number data type of Java,
        //and comment how many bits each takes
        //

        float f = 2147483647;//32 bits
        double d = 9^18;//64 bits


        //     GROUP QUESTION - You can solve this one together:
        //        Given that the range of values byte can represent is:
        //        byte: -2^7 <--> 2^7-1
        //        What is the range of values each integer data type can store?

        byte b1;//RANGE: -2^7 <--> 2^7-1
        short s1;//RANGE: -2^15 <--> 2^15-1
        long l1;//RANGE: -2^63 <--> 2^63-1
        int i2;//RANGE: -2^31 <--> 2^31-1


        //
        //        Now assign each of the integer variables above a number close to its upper limit.


        //declare a boolean called isRaining and assign it false

        boolean isRaining = false;


        //write a conditional in which if isRaining is true,
        //print out "Take your rain coat with you.",
        //and if the isRaining variable is false, print out "No need for a raincoat".

        if(isRaining = true){
            System.out.println("Take your rain coat with you.");
        }
        else{
            System.out.println("No need for a raincoat.");
        }

        System.out.println("-------------");

        //Declare a Scanner object called sc. (Be sure it is imported properly....)
        //Ask the user the grade they got on the test (0 - 100)
        //Assign that to an int variable called score.

        Scanner sc = new Scanner(System.in);
        System.out.println("What score did you get on the test?");
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
            System.out.println("Below a C");
        }

        System.out.println("------------");


        //******* Plus, method calling, and parameter passing.

        //Call a method here which is named method1(), and then implement it below,
        //right after the main method.
        //All that method1() is to do is print out "This is from method1."

        method1();


        //Next, call a method here named method2(), and send to it two parameters,
        //which will be two ints. Then implement the method below, right after method1();
        //It is to take those two numbers, and print out their sum.

        method2(12, 2);



    }

    public static void method1(){
        System.out.println("This is from method1.");
        System.out.println("---------------");
    }


    public static void method2(int x, int y){
        System.out.println(x + y);
        System.out.println("---------------");
    }


}
