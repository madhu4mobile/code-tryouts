package PracticeProblems;

import java.beans.beancontext.BeanContextChild;
import java.util.Scanner;

/*public class RevertAString {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in) ;
        System.out.print("Enter a string to revert :");
        String myString = reader.nextLine();

        String revertedString = "";

        for (int i = myString.length() - 1; i >= 0; i--) {
            revertedString = revertedString + myString.charAt(i);
        }

        System.out.println("Reverted String :" + revertedString);
    }
}*/

public class RevertAString {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a string to revert : ");
        String myString = reader.nextLine();

        String revertedString = "";

        for (int i = myString.length()-1;  i>=0; i--){
            revertedString = revertedString + myString.charAt(i);
        }
        System.out.printf(" The original string is '%s' and the reverted string is '%s' \n", myString, revertedString);
    }
}


/*public class RevertAString {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a string to revert: ");
        String myString = reader.nextLine();

        String revertedString = "";

        for (int i = myString.length() - 1; i >= 0; i--) {
            revertedString = revertedString + myString.charAt(i);
        }

        System.out.println("Reverted string: " + revertedString);
    }
}*/

