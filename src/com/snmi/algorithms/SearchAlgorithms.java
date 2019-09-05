package com.snmi.algorithms;

/**
 * SearchAlgorithms implement 3 search algorithms
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class SearchAlgorithms {

    public int linearSearch(int[] array, int searchingNumber){
        for (int i=0; i < array.length; i++){
            if (searchingNumber == array[i]){
                return i;
            }
        }
        return 0;
    }

    public int binarySearch(int[] array, int target, int start, int end){
        int middle = (int) Math.floor((start + end)/2);
        int value = array[middle];

        if (target > value){
            return binarySearch(array, target, middle + 1, end);
        } else if (target < value){
            return binarySearch(array, target, start, middle - 1);
        }

        return middle;
    }

    public int interpolationSearch(int[] integers, int elementToSearch) {
        int startIndex = 0;
        int lastIndex = (integers.length - 1);

        while ((startIndex <= lastIndex) && (elementToSearch >= integers[startIndex]) &&
                (elementToSearch <= integers[lastIndex])) {

            int pos = startIndex + (((lastIndex-startIndex) /
                    (integers[lastIndex]-integers[startIndex]))*
                    (elementToSearch - integers[startIndex]));

            if (integers[pos] == elementToSearch) {
                return pos;
            }

            if (integers[pos] < elementToSearch) {
                startIndex = pos + 1;
            } else {
                lastIndex = pos - 1;
            }

        }
        return -1;
    }

}
