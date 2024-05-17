package part_three;

/**
 * Comparing bubble sort and selection sort, since they both repeatedly
 * iterate through all the elements to sort if collection is reversed,
 * they have worst case complexity of O(n^2)
 */
public class SortingAlgorithms {

    /**
     * It returns a sorted array
     * The worst case complexity is O(n^2)
     */
    public  void bubbleSort(int[] collection) {
        for (int i = 0; i < collection.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < collection.length - i - 1; j++) {
                if (collection[j] > collection[j + 1]) {
                    swap(collection, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * It returns a sorted array
     * The worst case complexity is O(n^2)
     */
    public void selectionSort(int[] collection){
        for(int i =0; i < collection.length -1; i++){
            int minIndex = i;
            for(int m = i +1; m < collection.length; m++){
                if(collection[m] < collection[minIndex]){
                    minIndex = m;
                }
            }
            swap(collection, i, minIndex);
        }
    }


    /** Swap elements in place */
    private void swap(int[] collection, int i, int m){
        int temp = collection[i];
        collection[i] = collection[m];
        collection[m] = temp;
    }
}
