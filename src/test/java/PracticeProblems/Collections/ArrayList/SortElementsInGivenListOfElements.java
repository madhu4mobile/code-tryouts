package PracticeProblems.Collections.ArrayList;

public class SortElementsInGivenListOfElements {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] listOfNumbers = {23, 9, 67, 5, 89, 23, 67};

        // Create an instance of the class to call the non-static method
        SortElementsInGivenListOfElements sorter = new SortElementsInGivenListOfElements();
        sorter.bubbleSortForIntegers(listOfNumbers);

        // Print the sorted array
        System.out.println("Sorted list of numbers:");
        //to print the list uisng loops with a last period,
        System.out.print("{ ");
        for( int j = 0; j < listOfNumbers.length-1; j++) {
            System.out.print(listOfNumbers[j] + ", ");;
        }
        System.out.print(listOfNumbers[listOfNumbers.length-1]+" }"+".\n");

    }

    // BubbleSort method
    public void bubbleSortForIntegers(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swapKeys(array, j, j + 1);
                }
            }
        }
    }

    public void swapKeys(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
