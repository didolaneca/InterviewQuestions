import java.util.List;

public class SortedArraySearch {

    public static void main(String[] args) {
        List<Integer> testCaseOne = List.of(-2,0,2,5,6,7,9);
        //should return 2
        System.out.println(searchEntryEqualToItsIndex(testCaseOne));

        List<Integer> testCaseTwo = List.of(-2,0,1,2,3,4,6);
        //should return 6
        System.out.println(searchEntryEqualToItsIndex(testCaseTwo));

        List<Integer> testCaseThree = List.of(-2,1,5,8,9,20,30);
        //should return 2
        System.out.println(searchEntryEqualToItsIndex(testCaseThree));
    }


    /*
     * Design an efficient algorithm that takes a sorted array of distinct integers, and returns an index i such that
     * the element at index i equals i. For example, when the input is (-2,0,2,4,6,7,9) your algorithm should return 2.
     * */
    public static int searchEntryEqualToItsIndex(List<Integer> A) {
        //Implement your code below 
        return -1;
    }
}
