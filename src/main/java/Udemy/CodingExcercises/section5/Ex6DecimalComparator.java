package Udemy.CodingExcercises.section5;

    /*DecimalComparator
    https://www.udemy.com/course/java-the-complete-java-developer-course/learn/quiz/6103546#questions/21046480
    Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

    The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.



    EXAMPLES OF INPUT/OUTPUT:

    areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

    areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

    areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

    areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.



    TIP: Use paper and pencil.

    TIP: Use casting.

    NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static ​like we have been doing so far in the course.
    NOTE: Do not add a  main method to solution code.*/

public class Ex6DecimalComparator {
        public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {
            // Multiply both numbers by 1000 to shift decimal places
            System.out.printf("Given numbers are %f, %f.\n",firstValue,secondValue);
            long firstValueInt = (long) (firstValue * 1000);
            long secondValueInt = (long) (secondValue * 1000);

            System.out.println("shifted firstValue :"+firstValueInt);
            System.out.println("shifted secondValue :"+secondValueInt);

            // Compare the integer values after shifting
            return firstValueInt == secondValueInt;
        }

        public static void main(String[] args) {
            System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // true
            System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); // false
            System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); // true
            System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); // false
            System.out.println(areEqualByThreeDecimalPlaces(-3.1756,3.1757)); //false
        }

}
