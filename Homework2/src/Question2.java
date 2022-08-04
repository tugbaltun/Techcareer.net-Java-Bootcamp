import java.util.Scanner;

public class Question2 {

    /*str = Car races were started in France in 1894. Today, they are one of  the most popular audience sports.
    Competition is something that cars attend and results are announced and issued. The competition has a
    wholeness and it is original in its own outcomes. It can be combined with a couple of level and a final.
    Those were the information that Hilmi got from Wikipedia. He is really into the car races. He watches them
    on T.V whenever he can. He is planning to go and watch a race next weekend and he is just really excited.*/
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text:");
        String str = input.nextLine();
        System.out.println("Enter search word:");
        String searchWord = input.nextLine();

        String split[] = str.split(searchWord, -1);
        System.out.println("Number of '"+searchWord+"' in the text:"+(split.length-1));

        input.close();
    }
}
