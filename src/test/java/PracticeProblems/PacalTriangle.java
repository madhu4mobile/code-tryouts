package PracticeProblems;

import java.awt.print.Printable;
import java.util.Scanner;

public class PacalTriangle {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number of rows for the Pascal's triangle : ");
        int rows = reader.nextInt();

        int[][] pascalTriangle = new int[rows][rows];
       //Prepare pascal triangle
        for(int i = 0; i < rows; i ++){
            pascalTriangle[i][0] = 1;
            pascalTriangle[i][i] = 1;
            //inner loop
            for(int j = 1; j<i ; j++){
                pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
            }
    }
        // Print the tirangle with formatting
        for(int i = 0; i< rows; i++){
            //print leading spaces for alignment
            for(int k = 0; k < rows -i; k++){
                System.out.print(" ");
            }
            //print row values
            for(int j=0; j<= i; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println(); // move to the next line
        }
    }
}
