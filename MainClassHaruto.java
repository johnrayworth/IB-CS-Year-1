import java.util.Scanner;

public class MainClassHaruto {
    //write the shortcut for making a main method
    public static void main(String[] args) {
        //output Hello world
        System.out.println("Hello world");

        //make a while loop which prints out hello world 100 times
        //(don't forget to declare your variable first, and
        //increment it each time through the loop.
        int i = 0;
        while(i < 100){
            System.out.println("Hello world");
            i++;
        }

        //print out a diving line between each question, like "-------------------"
        System.out.println("-----------------");

        //do the same looping thing as you just did, only with a for loop
        for(int j = 0; j < 100; j++){
            System.out.println("Hello world");
        }

        //remember to print out a dividing line between each question
        System.out.println("-----------------");

        //Now, output the even numbers between and including 10 and 60
        //using a for loop
        for(int k = 10; k < 60; k+=2){
            System.out.println(k);
        }

        System.out.println("----------------");

        //and now a for loop printing out 15 to -35 (inclusive) down by
        //5 each time (so 15, 10, 5, 0, -5.... -30, -35
        for(int l = 15; l > -36; l-=5){
            System.out.println(l);
        }

        System.out.println("------------------");

        //Write a line to declare an array of 5 ints called myIntArray.
        int [] myIntArray = new int[5];

        System.out.println("-------------------");

        //Write a line to declare an array called dArray, which is 10 doubles.
        double[] dArray = new double[10];

        System.out.println("---------------------");

        //Write a line to declare an array called spiritWeek, which is 5 Strings.
        String[] spiritWeek = new String[5];

        System.out.println("--------------------");

        //Write a line to declare an array called stevenFloats, which is 7 floats.
        float[] stevenFloats = new float[7];

        System.out.println("---------------------");

        //Assign each of the elements of the int array above to be a number between 1 and 100.
        myIntArray[0] = 45;
        myIntArray[1] = 86;
        myIntArray[2] = 99;
        myIntArray[3] = 12;
        myIntArray[4] = 75;

        System.out.println("----------------------");

        //Declare a variable of each integer data type of Java,
        //and comment how many bits each takes
        //
        byte b; //8 bits
        short s; //16 bits
        int i1; //32 bits
        long l; //64 bits

        System.out.println("------------------------");

        //Declare a variable of each real number data type of Java,
        //and comment how many bits each takes
        //
        float f; //32 bits
        double d; //64 bits

        System.out.println("-------------------------");

        //     GROUP QUESTION - You can solve this one together:
        //        Given that the range of values byte can represent is:
        //        byte: -2^7 <--> 2^7-1
        //        What is the range of values each integer data type can store?
        // short: -2^15 <--> 2^15-1
        // int: -2^31 <--> 2^31-1
        // long: -2^63 <--> 2^63-1
        //        Now assign each of the integer variables above a number close to its upper limit.

        byte b1 = 127;
        short s1 = 32767;
        int i2 = 2147483647;
        long l1 = 9*(10^18);

        System.out.println("-----------------------");

        //declare a boolean called isRaining and assign it false
        boolean isRaining = false;

        //write a conditional in which if isRaining is true,
        //print out "Take your rain coat with you.",
        //and if the isRaining variable is false, print out "No need for a raincoat".
        if(isRaining){
            System.out.println("No need for a raincoat");
        }

        else{
            System.out.println("Take your rain coat with you");
        }

        System.out.println("---------------------------");

        //Declare a Scanner object called sc. (Be sure it is imported properly....)
        //Ask the user the grade they got on the test (0 - 100)
        //Assign that to an int variable called score.
        Scanner sc = new Scanner(System.in);
        System.out.println("What was your grade for a test?");
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
            System.out.println("below C");
        }

        System.out.println("-------------------------");

        //******* Plus, method calling, and parameter passing.

        //Call a method here which is named method1(), and then implement it below,
        //right after the main method.
        method1();
        method2(4, 9);
        //All that method1() is to do is print out "This is from method1."


        //Next, call a method here named method2(), and send to it two parameters,
        //which will be two ints. Then implement the method below, right after method1();
        //It is to take those two numbers, and print out their sum.
    }

    public static void method1(){
        System.out.println("This is from method1.");
    }

    public static void method2(int i, int k){
        System.out.println(i + k);
    }



}
