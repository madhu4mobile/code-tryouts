package Udemy.CodingExcercises.section5;

import javax.naming.Name;
import javax.print.attribute.standard.MediaSize;
import javax.xml.namespace.QName;
import java.util.Scanner;

/*Create two methods with MediaSize.Other same Name : convertToCentimeters
    1. The First method has one parameter of type int, which represents the entire height in inches.
    You will convert inches to centimeters, in this method, and pass back the number of centimeters as a double

    2. The second method has two parameters of type int, one to represent height in feet, and one to represent remaining height in inches.
    So if a person is 5 foot, 8 inches, the value of 5 for feet and 8 for inches would be passed to this method.
    This method will convert feet and inches to just inches, then call the first method, to get the number of centimeters, also returning the value as double.
*/

public class Sect5MethodOverLoadingChallenge {

    public static void main(String[] args) {

        //TODO : Need to workout on scanner class when multiple values are supplied with comma
/*        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height in Feet, inches (separated by comma when needed) to convert into centimeters :");
        int htInFeet, htInInches;
        String readLine;
        String[] lineVector;
        readLine = sc.nextLine();
        lineVector = readLine.split(",");
        System.out.println("");
        //Parsing the values to Integer
        htInFeet = Integer.parseInt(lineVector[0]);
        htInInches = Integer.parseInt(lineVector[1]);
        System.out.printf("The height of the object is %dft, %din as entered.",htInFeet,htInInches);*/

        //using hardcoded values of 5ft, 8in
        System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + "cm");
        //using hardcoded values of 68in, equivalent to 5ft, 8in.
        System.out.println("68in = " + convertToCentimeters(68) + "cm");

    }

    public static double convertToCentimeters(int heightInInches) {

        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches){
        int totalHeightInInches = (heightInFeet * 12 ) + remainingHeightInInches;

        return convertToCentimeters( totalHeightInInches);
    }

}
