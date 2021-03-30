import com.hubko.binarysearch.BinarySearch;

public class Runner {

    public static void main(String[] args) {
        int[] sortArray = {0,2,3,4,5,8,9,10,12,13};
        int elementToSearch = 4;
        BinarySearch.recursiveBinarySearch(sortArray, elementToSearch);
    }
}
