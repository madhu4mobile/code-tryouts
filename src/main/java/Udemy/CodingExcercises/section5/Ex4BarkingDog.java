package Udemy.CodingExcercises.section5;
    /*Barking Dog
    We have a dog that likes to bark.  We need to wake up if the dog is barking at night!

    Write a method shouldWakeUp that has 2 parameters.

    1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
    2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.

    We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.

    In all other cases return false.

    If the hourOfDay parameter is less than 0 or greater than 23 return false.

    Examples of input/output:

    shouldWakeUp (true, 1); → should return true

    shouldWakeUp (false, 2); → should return false since the dog is not barking.

    shouldWakeUp (true, 8); → should return false, since it's not before 8.

    shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.*/


public class Ex4BarkingDog {
    // write code here
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if ((hourOfDay < 0 || hourOfDay > 23)) {
            return false;
        } else return ( barking && (hourOfDay < 8 || hourOfDay > 22) );
    }
    public static void main(String[] args){
        System.out.println(shouldWakeUp(true,1)); // true expected
        System.out.println(shouldWakeUp(false,2)); // false expected as dog is not barking though it is 2AM
        System.out.println(shouldWakeUp(true,8)); // false expected as it is 8 O'clock not less than 8
        System.out.println(shouldWakeUp(false,-5)); //false expected --> hour is not valid
        System.out.println(shouldWakeUp(false,24)); //false expected --> hour is not valid per assignment
        System.out.println(shouldWakeUp(true,24)); //false expected as hour is not right in format
        System.out.println(shouldWakeUp(true,-1)); //false expected --> hour is not valid
        System.out.println(shouldWakeUp(true,22)); // false expected as it is 22 hrs not greater than 22.
        System.out.println(shouldWakeUp(true,44)); // false expected --> hour is not valid
        System.out.println(shouldWakeUp(true,7)); // true expected --> 7AM so you have to wakeup
        System.out.println(shouldWakeUp(true,0)); // true expected --> midnight
        System.out.println(shouldWakeUp(true,12)); // false expected --> it is Noon.
    }
}
