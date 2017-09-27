import java.util.Scanner;

public class MainClassSteven {
        public static void main(String[] args) {

            System.out.println("----------");

            System.out.println("Hello world.");

            System.out.println("----------");

            method1();

            System.out.println("----------");

            int c = 0;
            while(c < 101){
                System.out.println("Hello world.");
                c++;
            }

            System.out.println("----------");

            for(int y = 0; y < 101; y++){
                System.out.println("Hello world.");
            }

            System.out.println("----------");

            for(int z = 10; z < 61; z+=2){
                System.out.println("Hello world.");
            }

            System.out.println("----------");

            for(int s = 15; s > -36; s-=5){
                System.out.println(s);
            }

            System.out.println("----------");

            int [] myIntArray = new int[5];

            System.out.println("----------");

            double [] dArray = new double[10];

            System.out.println("----------");

            String [] spiritWeek = new String[5];

            System.out.println("----------");

            float [] stevenFloats = new float[7];

            System.out.println("----------");

            myIntArray[0] = 20;
            myIntArray[1] = 18;
            myIntArray[2] = 16;
            myIntArray[3] = 14;
            myIntArray[4] = 12;

            System.out.println("----------");

            byte b; //8 bits
            int i; //32 bits
            short s; //16 bits
            long l; //64 bits
            float f; //32 bits
            double d; //64 bits

            System.out.println("----------");

            boolean isRaining = false;

            System.out.println("----------");

            if(isRaining = false){
                System.out.println("Take your raincoat with you.");
            }
            else{
                System.out.println("No need for a raincoat.");
            }

            System.out.println("----------");

            Scanner scanner = new Scanner(System.in);

            System.out.println("----------");

            Scanner sc = new Scanner(System.in);
            System.out.println("What score did you receive for the assessment?");
            int score = sc.nextInt();

            if(score > 89){
                System.out.println("Nice! You got an A.");
            }
            else if(score > 79){
                System.out.println("Not bad! It's an B.");
            }
            else if(score > 69){
                System.out.println("Good efforts! It's an C.");
            }
            else{
                System.out.println("Can you talk to me in person?");
            }

            System.out.println("----------");

            method2(99999999, 222222222);

            System.out.println("----------");

        }


        public static void method1(){
            System.out.println("This is from method 1.");
        }

        public static void method2(int c, int s){
            System.out.println(c + s);
        }

        //     GROUP QUESTION - You can solve this one together:
        //        Given that the range of values byte can represent is:
        //        byte: -2^7 <--> 2^7-1
        //        What is the range of values each integer data type can store?
        //
        //        Now assign each of the integer variables above a number close to its upper limit.

    }

}
