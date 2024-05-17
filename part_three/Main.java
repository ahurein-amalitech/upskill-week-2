package part_three;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] collection = {1,5,98,8,4,5};
        int[] sortedCollection = {1,5,8,41,55};
        SearchingAlgorithms searchingAlgorithms = new SearchingAlgorithms();

        //linear search for 98 - returns the index
        System.out.println(searchingAlgorithms.linearSearch(985, collection));

        //binary search for 4 - returns the index
        System.out.println(searchingAlgorithms.binarySearch(1, sortedCollection));


        int[] ages1 = {1,5,98,8,4,5};
        int[] ages2 = {1,5,98,8,4,5};
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

        //selection sort
        sortingAlgorithms.selectionSort(ages1);
        System.out.println("Selection sort: " + Arrays.toString(ages1));

        //bubble sort
        sortingAlgorithms.bubbleSort(ages2);
        System.out.println("Bubble sort: " + Arrays.toString(ages2));
    }
}
