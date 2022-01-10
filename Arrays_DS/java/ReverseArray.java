import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ReverseArray {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 4, 3, 2);
        List<Integer> list2 = Arrays.asList(5833, 9919, 6731);

        System.out.println(reverseArray(list1)); // expected 2 3 4 1
        System.out.println(reverseArray(list2)); // expected 6731 9919 5833
    }

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> sortedArray = new ArrayList<>();

        sortedArray.addAll(a);

        Collections.reverse(sortedArray);

        return sortedArray;

    }
}
