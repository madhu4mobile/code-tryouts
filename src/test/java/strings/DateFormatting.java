package strings;


import java.util.Date;

public class DateFormatting {
    public static void main(String[] args) {
        System.out.println("source : https://www.studytonight.com/java-examples/formatting-with-printf-in-java" );
        System.out.println("#####         Date Formatting        #####");
        System.out.println("\tA is used to print the full name of the day.\n\ta is used to print the abbreviated name of the day\n\tB is used to print the full name of the month.\n\tb is used to print the abbreviated name of the month.\n\td is used to print the two-digit day of the current month.");
        System.out.println("\tm is used to print the two-digit month of the year.\n\tY is used to output the year in four digits.\n\ty is used to output the year in two digits.");
        System.out.println("##########################################");
        Date date = new Date();
        System.out.printf("Time: %tT", date);
        System.out.println();
        System.out.printf("Day: %tA Date: %td Month: %tB Year: %tY%n", date, date, date, date);
        System.out.println("As we can see in the code above, we need to mention the date variable several times.\nThere is a simple way to get around this by using the index reference 1$ in the format string.");
        System.out.printf("Day: %1$tA Date: %1$td Month: %1$tB Year: %1$tY%n", date);
        System.out.println("##########################################");
    }
}
