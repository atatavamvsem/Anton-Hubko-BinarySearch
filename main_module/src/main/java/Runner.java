import com.hubko.binarysearch.BinarySearch;

public class Runner {

    public static void main(String[] args) {
        int[] sortArray = {0,2,3,4,5,8,9,10,12,13};
        int firstElementPosition = 0, lastElementPosition = sortArray.length-1, elementToSearch = 3;
        BinarySearch.recursiveBinarySearch(sortArray,firstElementPosition,lastElementPosition,elementToSearch);
    }
}
