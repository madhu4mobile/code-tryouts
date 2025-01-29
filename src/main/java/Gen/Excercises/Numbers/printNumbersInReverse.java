package Gen.Excercises.Numbers;

import java.util.Scanner;

public class printNumbersInReverse {

    // https://www.javatpoint.com/how-to-reverse-a-number-in-java

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int myNumber = scn.nextInt();
        int givenNumber = myNumber;
        int reversedNumber = 0;
        int numberOfDigitsInGivenNumber = (int) (Math.log10(myNumber) + 1);

/*        for(int i=0; i< numberOfDigitsInGivenNumber; i++){

            int reminder = myNumber % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            myNumber = myNumber / 10;
        }*/

        while(myNumber != 0){
            int reminder = myNumber % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            myNumber = myNumber / 10;
        }

        System.out.printf("The given number %d will become %d when reversed. \n", givenNumber, reversedNumber);



    }
}
