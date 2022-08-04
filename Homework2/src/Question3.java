import java.util.ArrayList;
import java.util.List;

public class Question3 {

    private static int countingTheElements(List<String> myList){
        int counter = 0;
        String split[];
        for(String list:myList){
            split = list.split(" ", 0);
            counter+=split.length;
        }
        return counter;
    }

    public static void main(String[] arg) {

        List<String> myList = new ArrayList<String>();
        myList.add("Happy New Year");
        myList.add("Coding Interview");

        System.out.println("Number of element in the list:"+countingTheElements(myList));
    }
}
