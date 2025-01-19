package Udemy.CodingExcercises.section7.s7RecordProject;

public class Main {

    public static void main(String[] args){

        //Student student = new Student("1","Mary","031298","");
        for (int i = 1; i <= 5; i++){
           Student s = new Student("S92300" + i,
            switch (i){
                case 1 -> "Mary";
                case 2 -> "John";
                case 3 -> "Madhu";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
            },
                   switch (i){
               case 1 -> "04/12/2001";
               case 2 -> "01/08/2008";
               case 3 -> "11/25/1969";
               case 4 -> "08/08/1976";
               case 5 -> "01/08/1976";
               default -> "Anonymous";
                   },
                   "Java Masterclass");
           System.out.println(s);
        }
    }
}
