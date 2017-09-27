import java.util.Scanner;

public class MainClassNagon {
    //write the shortcut for making a main method
    public static void main(String[] args) {
        System.out.println("Hello world");

        int i = 0;
        while(i < 100){
            System.out.println("hello world");
            i++;
        }

        System.out.println("-------------------");
        for(i = 0; i < 100; i++){
            System.out.println("hello world");
        }

        System.out.println("-------------------");
        for(i = 10; i < 61; i+=2){
            System.out.println(i);
        }

        System.out.println("-------------------");
        for(i = 15; i > -36; i-=5){
            System.out.println(i);
        }

        System.out.println("-------------------");
        int [] myIntArray = new int[5];
        double [] dArray = new double[10];
        String [] spiritWeek = new String[5];
        float [] stevenFloats = new float[7];

        myIntArray [0] = 12;
        myIntArray [1] = 43;
        myIntArray [2] = 93;
        myIntArray [3] = 56;
        myIntArray [4] = 99;

        //(With the bonus group question)
        byte b; //8 bits, values from -2^7 to (2^7)-1
        short s; //16 bits, values from -2^15 to (2^15)-1
        long l; //64 bits, values from -2,147,483,648 to 2,147,483,647
        int i1; //32 bits, values from -2 billion to (2 billion)-1

        b = 127;
        s = 32767;
        l = 2147483647;
        i1 = 1999999999;

        float f; //32 bits
        double d; //64 bits

        boolean isRaining = false;
        if (isRaining = true){
            System.out.println("Take your raincoat with you.");
        }
        else{
            System.out.println("There is no need for a raincoat.");
        }

        System.out.println("-------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("What grade did you receive?");
        int grade = sc.nextInt();

        if (grade > 89){
            System.out.println("A");
        }
        else if (grade > 79){
            System.out.println("B");
        }
        else if (grade > 69){
            System.out.println("C");
        }
        else if (grade > 59){
            System.out.println("D");
        }
        else{
            System.out.println("You have failed the assignment.");
        }

        System.out.println("-------------------");

        method1();
        method2(2, 4);
    }

    public static void method1(){
        System.out.println("This is from method 1");
    }

    public static void method2(int x, int y){
        System.out.println(x + y);
    }


    //output Hello world

    //make a while loop which prints out hello world 100 times
    //(don't forget to declare your variable first, and
    //increment it each time through the loop.

    //print out a diving line between each question, like "-------------------"

    //do the same looping thing as you just did, only with a for loop

    //remember to print out a dividing line between each question
    //Now, output the even numbers between and including 10 and 60
    //using a for loop

    //and now a for loop printing out 15 to -35 (inclusive) down by
    //5 each time (so 15, 10, 5, 0, -5.... -30, -35

    //Write a line to declare an array of 5 ints called myIntArray.

    //Write a line to declare an array called dArray, which is 10 doubles.

    //Write a line to declare an array called spiritWeek, which is 5 Strings.

    //Write a line to declare an array called stevenFloats, which is 7 floats.

    //Assign each of the elements of the int array above to be a number between 1 and 100.

    //Declare a variable of each integer data type of Java,
    //and comment how many bits each takes

    //Declare a variable of each real number data type of Java,
    //and comment how many bits each takes
    //

    //     GROUP QUESTION - You can solve this one together:
    //        Given that the range of values byte can represent is:
    //        byte: -2^7 <--> 2^7-1
    //        What is the range of values each integer data type can store?

    //        Now assign each of the integer variables above a number close to its upper limit.

    //declare a boolean called isRaining and assign it false

    //write a conditional in which if isRaining is true,
    //print out "Take your rain coat with you.",
    //and if the isRaining variable is false, print out "No need for a raincoat".

    //Declare a Scanner object called sc. (Be sure it is imported properly....)
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
