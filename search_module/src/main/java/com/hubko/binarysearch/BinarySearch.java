package com.hubko.binarysearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearch {
    private static final Logger LOGGER
            = LoggerFactory.getLogger(BinarySearch.class);

    public static int recursiveBinarySearch(int arr[], int firstElementPosition, int lastElementPosition, int elementToSearch) {
        LOGGER.debug("Looking for an element: {}, search range:[{},{}] ", elementToSearch, arr[firstElementPosition],arr[lastElementPosition]);
        if (lastElementPosition >= firstElementPosition) {
            int mid = firstElementPosition + (lastElementPosition - firstElementPosition) / 2;
            LOGGER.debug("Element in the middle:{}", arr[mid]);
            if (arr[mid] == elementToSearch) {
                LOGGER.debug("Element found, its position:{}", mid);
                return mid;
            }
            if (arr[mid] > elementToSearch){
                LOGGER.debug("Element not found, our value is less");
                return recursiveBinarySearch(arr, firstElementPosition, mid - 1, elementToSearch);
            }
            LOGGER.debug("Element not found, our value is more");
            return recursiveBinarySearch(arr, mid + 1, lastElementPosition, elementToSearch);
        }
        LOGGER.debug("Element not found");
        return -1;
    }
}
