package Homework1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int number=0, sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = scan.nextInt();

        for(int i=1; i<=number; i++){
            sum+=i;
        }

        System.out.println("Sum of numbers="+sum);


    }
}
