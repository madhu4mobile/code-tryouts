package PracticeProblems.Collections.ArrayList;

import java.util.List;
import java.util.ArrayList;

public class createArraryListAndPrint {
    public static void main(String[] args) {
        //step1 initiate the list like any parameter
        List<String> names = new ArrayList<>();

        //add elements into the list
        names.add("Mathews");
        names.add("Venky");
        names.add("Pavan");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");



        for (String name : names){
          System.out.print(name + ",");
        }
        System.out.println();
        //The above way will leave a comma at the end.

        //To print the list without the last comma, it is better to use String.join
        String myFinalNames = String.join(", ",names);
        System.out.println(myFinalNames);

        //to print the list uisng loops with a last period,
        for( int j = 0; j < names.size()-1; j++) {
            System.out.print(names.get(j) + ", ");;
        }
        System.out.print(names.get(names.size()-1)+".\n");
    }
}
