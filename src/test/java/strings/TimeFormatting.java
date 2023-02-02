package strings;

import java.util.Date;

public class TimeFormatting {
    public static void main(String[] args) {
        System.out.println("source : https://www.studytonight.com/java-examples/formatting-with-printf-in-java" );
        System.out.println("##############Time Formatting#############");
        Date date = new Date();
        System.out.printf("Time: %tT", date);
        System.out.println();
        System.out.printf("Hours: %tH Minutes: %tM Seconds: %tS Milliseconds: %tL%n", date, date, date, date,"\n");
        System.out.println("As we can see in the code above, we need to mention the date variable several times.\nThere is a simple way to get around this by using the index reference 1$ in the format string.");
        System.out.printf("Hours: %1$tH Minutes: %1$tM Seconds: %1$tS Milliseconds: %1$tL%n", date);
        System.out.println("##########################################");
    }
}
