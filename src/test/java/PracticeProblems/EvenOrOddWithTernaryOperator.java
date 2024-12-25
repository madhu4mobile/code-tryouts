package PracticeProblems;

/*import java.util.Scanner;

public class EvenOrOddWithTernaryOperator {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number to find even or odd.");
        int num = reader.nextInt();

        System.out.printf("The number %d is %s. \n",num, (num % 2 == 0) ? "even":"odd");

    }
}*/


import java.util.Scanner;
public class EvenOrOddWithTernaryOperator{


    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number to check even or odd :");
        int num = reader.nextInt();

        //System.out.printf("The number %d is %s. \n",num, (num % 2 == 0) ? "even":"odd");
        System.out.printf("The number %d is %s. \n",num, (num % 2 == 0) ? "even":"odd");

    }

}
