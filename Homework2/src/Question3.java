import java.util.*;


public class Question3 {

    private static String str = "Car races were started in France in 1894. Today, they are one of  the most popular " +
            "audience sports.Competition is something that cars attend and results are announced and issued. The competition has a " +
            "wholeness and it is original in its own outcomes. It can be combined with a couple of level and a final."+
            "Those were the information that Hilmi got from Wikipedia. He is really into the car races. He watches them"+
            "on T.V whenever he can. He is planning to go and watch a race next weekend and he is just really excited";

    private static void countingTheElements(String str){
        ArrayList<String> myList = new ArrayList<>();
        String splitArray[] = str.toLowerCase().split(" ");

        for(int i=0;i<splitArray.length;i++) {
            int count=0;
            for(int j=0;j<splitArray.length;j++) {

                String temp1 = splitArray[i];
                String temp2 = splitArray[j];

                if(j<i && temp1.equals(temp2)) {
                    break;
                }

                if(temp1.equals(temp2)) {
                    count++;
                }

                if(j==splitArray.length-1) {
                    System.out.println(splitArray[i]+" "+count);
                }
            }
        }
    }

    public static void main(String[] arg) {

        countingTheElements(str);
    }
}
