package strings;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class IntroStings {

    static String str = "It is my String";
    static String str2 = "It is my String";
    static String str3 = "It is a different String";


    public static void main(String[] args){
        /*
        //when the variable is non static
        IntroStings introStings = new IntroStings();
        System.out.println("String value : "+introStings.str);
        */
        /*
        To make it easy, making the string as static
         */
        //printing values
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("******************");
        // other methods available in string
        int myStringLength = str.length();
        System.out.println("myStringLength = " + myStringLength);

        int result_after_comparing_strings = str.compareToIgnoreCase(str2);
        System.out.println("result_after_comparing_strings = " + result_after_comparing_strings);
        
        int result_after_comparing_different_strings = str.compareTo(str3);
        System.out.println("result_after_comparing_different_strings = " + result_after_comparing_different_strings);

        System.out.println("string when in lower case = " + str.toLowerCase());

        System.out.println("str.concat(\" !!!\") = " + str.concat(" !!!"));
        System.out.println("str.replace(\"my\",\"our\") = " + str.replace("my","our"));

        System.out.println("str.substring(6,12) = " + str.substring(6,12));
        System.out.println("str.equalsIgnoreCase(str3) = " + str.equalsIgnoreCase(str3));


    
        
    }


}

