package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] Array;

        Array = new int [11];

        Array[0] = 100;
        Array[1] = 200;
        Array[2] = 300;
        Array[3] = 400;
        Array[4] = 500;
        Array[5] = 600;
        Array[6] = 700;
        Array[7] = 800;
        Array[8] = 900;
        Array[9] = 1000;
        Array[10] = 0;

        //for(int NewArray : Array){
        //    System.out.println("Elements are \n" + NewArray);
       // }
        System.out.println("Element at Index 0: " + Array[0]);
        System.out.println("Element at Index 1: " + Array[1]);
        System.out.println("Element at Index 2: " + Array[2]);
        System.out.println("Element at Index 3: " + Array[3]);
        System.out.println("Element at Index 4: " + Array[4]);
        System.out.println("Element at Index 5: " + Array[5]);
        System.out.println("Element at Index 6: " + Array[6]);
        System.out.println("Element at Index 7: " + Array[7]);
        System.out.println("Element at Index 8: " + Array[8]);
        System.out.println("Element at Index 9: " + Array[9]);

        Scanner U = new Scanner(System.in);
        System.out.println("Enter new value \n");

        String User = U.nextLine();
        System.out.println("Element at Index 10: " + Array[10]);

    }
}