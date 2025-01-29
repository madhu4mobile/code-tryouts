package Gen.Excercises.Numbers;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class RevertAString {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.print("\nPlease provide your string that has to be reverted : ");
        String myString = scn.nextLine();

        System.out.printf("\nWhen the given string '%s' is reverted it is : '%s'",myString,reverseAString(myString));


        // Using StringBuffer class
        StringBuffer buffer = new StringBuffer(myString);
        System.out.print("\nUsing StringBuffer class, the reverted string : ");
        System.out.print(buffer.reverse());

        // To revert the given string by StringBuffer
        System.out.print("\nUsing StringBuffer class, the reverted words of the string : ");
        System.out.print(reverseStringByWords(myString));
    }

    public static String reverseAString(@NotNull String string) {

        String revertedString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            revertedString += string.charAt(i);
        }
        return revertedString;
    }

    public static StringBuilder reverseStringByWords(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = string.split(" ");

        for (int j = words.length-1; j >= 0; j--) {
            stringBuilder.append(words[j]).append(' ');
        }
        return stringBuilder;
    }

}
