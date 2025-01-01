package Udemy.CodingExcercises.section5;

import java.util.Scanner;

    /*Leap Year Calculator
    Write a method isLeapYear with a parameter of type int named year.

    The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.

    Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.



    To determine whether a year is a leap year, follow these steps:
            1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
            2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
            3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
            4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
            5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.


    Another way to put is:

        A leap year is a year that is divisible by 4 but not 100.
        If it's divisible by 100, it has to be divisible by 400.


    The following years are not leap years:
            1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
    This is because they are evenly divisible by 100 but not by 400.

    The following years are leap years:
            1600, 2000, 2400
    This is because they are evenly divisible by both 100 and 400.


    Examples of input/output:

    isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)

    isLeapYear(1600); → should return true since 1600 is a leap year

    isLeapYear(2017); → should return false since 2017 is not a leap year

    isLeapYear(2000);  → should return true because 2000 is a leap year

    NOTE: The method isLeapYear needs to be defined as public static ​like we have been doing so far in the course.
    NOTE: Do not add a  main method to solution code.*/

public class Ex5LeapYearCalculator {

    public static boolean isItALeapYear(int year){
        boolean flag = false;
        if (year < 1 || year > 9999) {
            flag = false;
        } else if (year % 100 == 0) {
            if ( year % 400 == 0) {flag = true;} // if the year is divisible by 100 then need to check if it is divisible by 400 too.
        } else if (year % 4 == 0) { // if the year is not divisible by 100, 400 then need to check if it is divisible by 4.
            flag = true;
        }

        return flag;
    }
    public static void printResult(int year){
        boolean isLeapYear = isItALeapYear(year);
        if(isLeapYear){
            System.out.printf("%d is a leap year. \n",year);
        } else {
            System.out.printf("%d is not a leap year. \n",year);
        }
    }

    public static void main(String[] args){
/*        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of year: ");
        int year = sc.nextInt();
        printResult(year);*/

        //second way of displaying test case results
        printResult(1700); // not a leap year as it is not divisible by 400
        printResult(1800); // not a leap year as it is not divisible by 400
        printResult(1600); // leap year as it is not divisible by 100 and 400 as well.
        printResult(2017); // not a leap year as not divisible by 4
        printResult(2400); // leap year as divisible by 400 and 4.
        printResult(2024); // leap year as divisible by 4.
        printResult(1924); // leap year as divisible by 4.
        printResult(1944); // leap year as divisible by 4.
        printResult(1980); // leap year as divisible by 4.
        printResult(2000); // leap year as divisible by 4, 100 and 400.
        printResult(-1600); // should return not a leap year. But according the instructions should return false.

    }

}
