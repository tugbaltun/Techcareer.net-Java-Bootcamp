package Homework1;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character:");
        char character = scan.nextLine().charAt(0);

        if(character>='A' && character<='Z' ||  character>='a' && character<='z'){
            System.out.println("You entered an alphabet character!");
        }else{
            System.out.println("You didn't enter an alphabet character!");
        }


    }
}
