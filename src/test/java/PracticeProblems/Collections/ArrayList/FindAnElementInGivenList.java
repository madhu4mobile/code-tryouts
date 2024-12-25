package PracticeProblems.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAnElementInGivenList {
    public static void main(String[] args) {
        // Initiating the list of fruits.
        List<String> fruits = new ArrayList<String>();

        //adding elements to a list of fruits
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Water Melon");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Guava");
        //System.out.println(fruits);

        //Get user option of fruit as input
        Scanner reader = new Scanner(System.in);
        System.out.print("Which fruit you want to find the list of fruits? : ");
        String userOption = reader.nextLine();

        //Now to check if the userOption exists in the list of Fruits
        if (fruits.contains(userOption)) {
            System.out.printf("Great guess! '%s' exists in the given list of fruits. \n", userOption);
        } else {
            System.out.printf("Sorry! '%s' do not exist in the given list of fruits. \n ", userOption);
        }

        //Without using list.contains but using a loop
        // initiate a flag
        boolean found = false;
        for (String fruit : fruits) {
            if (userOption.equals(fruit)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.printf("Great guess! '%s' exist in the given list of fruits. \n", userOption);
        } else {
            // if the userOption is not found in the loop
            System.out.printf("Sorry! '%s' fruit do not exist in the given list of fruits. \n ", userOption);
        }
    }

}
