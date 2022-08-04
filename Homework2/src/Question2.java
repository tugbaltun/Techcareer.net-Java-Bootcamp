import java.util.Scanner;

public class Question2 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text:");
        String str = input.nextLine();

        String split[] = str.split(" ", 0);
        System.out.println("Number of words in the text:"+split.length);
        input.close();
    }
}
