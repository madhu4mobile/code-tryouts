package Gen.Excercises.Strings;

/*
Write a pogram to take a string  input from user and count the number of Vowels in the given string.
Vowels : AEIOUaeiou
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class CountVowels {

    static String vowels = "AEIOUaeiou";

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String myString = userInput.nextLine();
        int numberOfVovelsInGivenString = countOfVowels(myString);
        int numberOfVowelsUsingIntStreamInGivenString = countVowelsWithIntStreamRange(myString);
        int numberOfVowelsUsingPatternMatch = countVowelsUsingRegExAndPatternMatcher(myString);
        System.out.printf("\nUsing for loop to count the vowels.\nThe given string '%s' has %d number of vowels \n", myString,numberOfVovelsInGivenString);
        System.out.printf("\nUsing IntStream.range() to count the vowels.\nThe given string '%s' has %d number of vowels \n", myString,numberOfVowelsUsingIntStreamInGivenString);
        System.out.printf("\nUsing Pattern Match() to count the vowels.\nThe given string '%s' has %d number of vowels \n", myString,numberOfVowelsUsingPatternMatch);
    }

    public static int countOfVowels(String str){
        int count = 0;

        for(int i = 0; i< str.length(); i++){ // to run a loop for each char of the input string
            if(vowels.indexOf(str.charAt(i)) != -1) { // explained below.
                /*This is the core of the vowel counting logic.
                        str.charAt(i) extracts the character at the current index i from the input string.
                        vowels.indexOf(str.charAt(i)) searches for the occurrence of this character within the vowels string.
                        indexOf() returns the index of the first occurrence of the character in the string, or -1 if the character is not found.
                        vowels.indexOf(str.charAt(i)) != -1 checks if the returned index is not equal to -1.
                        This condition is true if the character is found among the vowels.*/
                count++; // if index is found increment the count.
            }
        }
        return count;
    }

    public static int countVowelsWithIntStreamRange(String str){
/*
    Explanation:
    ============
       1.  IntStream.range(0, str.length()):
            -   Creates an IntStream of integers starting from 0 (inclusive) and going up to the length of the input string (exclusive).
            -   This effectively represents the indices of each character in the string.
        2. .filter(i -> vowels.indexOf(str.charAt(i)) != -1):
            -   This is where the vowel filtering happens.
                - filter() is a stream operation that selects elements from the stream based on a given predicate.
                -   The predicate i -> vowels.indexOf(str.charAt(i)) != -1 checks if the character
                    at the current index i is a vowel using the same indexOf() logic as before.
                -   Only the indices corresponding to vowels will pass this filter.
        3.  .count():
            -   This terminal operation counts the number of elements (indices) remaining in the stream after the filtering.
                This count represents the total number of vowels in the string.

       This approach leverages the power of Java Streams to express the vowel counting logic in a concise and functional style.

   Key Advantages of using IntStream:
   -----------------------------------
        - Conciseness: Stream operations often provide a more concise and readable way to express data processing logic.
        - Parallelism: Streams can be easily parallelized, which can significantly improve performance for larger strings.
        - Functional Programming: This approach aligns with functional programming principles, emphasizing immutability and pure functions.
 */
        return (int) IntStream.range(0,str.length())
                .filter(i -> vowels.indexOf(str.charAt(i)) != -1)
                .count();
    }

    public static int countVowelsUsingRegExAndPatternMatcher(String str){
        int newCount = 0;
//        String myVowels = vowels.toString();
        Pattern pattern = Pattern.compile("["+vowels+"]");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            newCount++;
        }
        return newCount;
    }
}
