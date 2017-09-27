import java.util.Scanner;

public class MainMethodTigerbee {
    public static void main(String[] args) {
        System.out.println("Hello world");

        int i = 0;
        while(i <100){
            System.out.println("Hello world");
            i++;
        }

        System.out.println("---------------------");

        for(int k = 0;k < 100;k++){
            System.out.println("Hello world");
        }
        System.out.println("----------------------");

        for(int k = 10;k < 61;k+=2){
            System.out.println(k);
        }
        System.out.println("-----------------------");
        for(int k =15; k > -36;k-=5){
            System.out.println(k);
        }
        System.out.println("-----------------------");
        int [] myIntArray = new int[5];
        double [] dArray = new double[10];
        String [] spiritWeek = new String[5];
        float [] stevenFloats = new float[7];

        myIntArray[0] = 2;
        myIntArray[1] = 50;
        myIntArray[2] = 30;
        myIntArray[3] = 40;
        myIntArray[4] = 60;

        byte b; //8 bits
        short s; //16 bits
        int il; //32 bits
        long l; //64 bits

        double d; //64 bits
        float f; //32 bits

        boolean isRaining = false;

        if(isRaining){
            System.out.println("Take your raincoat with you");
        }
        else{
            System.out.println("No need for a raincoat");
        }

        System.out.println("------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("What did you get between 0 and 100?");
        int score = sc.nextInt();

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

        method1();

        System.out.println("-----------------");

        method2(2 , 3);

    }

    public static void method1(){
        System.out.println("this is from method 1");

    }

    public static void method2(int a, int b){
        System.out.println(a + b);
    }
}
