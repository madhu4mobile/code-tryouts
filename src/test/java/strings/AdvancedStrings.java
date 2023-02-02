package strings;

import java.util.Date;

public class AdvancedStrings {

    public static void main(String[] args) {
        System.out.println("###########  USING FORMATTING ############");

        System.out.println("source : https://www.studytonight.com/java-examples/formatting-with-printf-in-java" );

        System.out.printf("Printing an integer %d %n", 10);
        System.out.printf("Printing a floating-point number %f %n", 10.0);
        System.out.printf("Printing an exponential floating-point number %e %n", 10.0);
        System.out.printf("Printing a string %s %n", "String");
        System.out.printf("Printing a character %c %n", 'A');
        System.out.println();
        System.out.printf("%d%n", 1000000);//without flag
        System.out.printf("%,d", 1000000);//with flag
        System.out.println(); //Notice that it is not printing space after printf
        System.out.println();
        System.out.println("Setting width with printf() ");
        System.out.printf("%5s", "string");
        System.out.println();
        System.out.println("##########################################");

    }
}
