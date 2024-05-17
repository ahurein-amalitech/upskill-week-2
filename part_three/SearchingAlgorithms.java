package part_three;

/**
 * Comparing linear search and binary search, for a sorted collection
 * binary search is more efficient since it cut the iteration to half
 * Linear search goes through the element one after the other
 */
public class SearchingAlgorithms {

    /**
     *Linear search return the index when the search item is found.
     *It goes through the item one by one to find the target item.

     *The worst case is O(n)
     */
    public int linearSearch(int searchItem, int[] collection){
        for (int i = 0; i < collection.length; i++) {
            if (collection[i] == searchItem) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Binary search return the index when the search item is found
     * It needs a sorted array

     * The worst case is O(logn)
     */
    public int binarySearch(int searchItem, int[] collection){
        int startIndex = 0;
        int endIndex = collection.length - 1;

        while(startIndex <= endIndex){
            int mid = (startIndex + endIndex) / 2;
            if(collection[mid] == searchItem){
                return mid;
            } else if (collection[mid] < searchItem) {
                startIndex = mid +1;
            } else {
                endIndex = mid - 1;
            }
        }

        return -1;
    }
}
