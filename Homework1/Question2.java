package Homework1;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //ax^2 + bx + c = 0
        double a=0, b=0, c=0, delta=0, x1=0, x2=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of a:");
        a = scan.nextDouble();
        System.out.println("Enter value of b:");
        b = scan.nextDouble();
        System.out.println("Enter value of c:");
        c = scan.nextDouble();

        delta = (b*b)-(4*a*c);

        if(delta>0){
            x1 = ((-1*b) - Math.sqrt(delta))/(2*a);
            x2 = ((-1*b)+ Math.sqrt(delta))/(2*a);
            System.out.println("x1="+x1+"\nx2="+x2);
        }else if(delta<0){
            System.out.println("Equation has no real roots.");
        }else{
            x1 = (-1*b)/(2*a);
            System.out.println("The equation has a coincident root. x1=x2="+x1);
        }
    }
}
