package PracticeProblems.Collections.ArrayList;

import oops.MyConstants;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/java-exercises/#
//15. Write a Java Program to Find the Largest Element in Array

public class FindLargestElementInArray {
    public static void main(String[] args){
       int[] myNumbers = {23, 9, 12,91,67, 5, 89, 23, 67};

       int greater = myNumbers[0];
       for(int number : myNumbers ){
           if(number > greater){
               greater = number;
           }
       }
       System.out.println("The largest number in the given array is : "+ greater);

    }
}
