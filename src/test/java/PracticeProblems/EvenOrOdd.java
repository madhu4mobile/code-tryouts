package PracticeProblems;


import java.util.Scanner;

public class EvenOrOdd{

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number to check even or odd : ");
        int num = reader.nextInt();

        //logic to check
        if (num % 2 == 0) {
            System.out.printf("The number '%d' is even. \n", num);
        } else {
            System.out.printf("The number '%d' is odd.\n", num );
        }
    }

}
