package task06;


import java.util.Collections;
import java.util.List;

public class QuickSort implements ISortStrategy {


    private static void sort(List<Integer> list, int from, int to) {
        if (from < to) {
            int left = from + 1;
            int right = to;
            int pivotValue = list.get(from);
            while (left <= right) {
                // left <= to -> limit protection
                while (left <= to && pivotValue >= list.get(left)) {
                    left++;
                }
                // right > from -> limit protection
                while (right > from && pivotValue < list.get(right)) {
                    right--;
                }
                if (left < right) {
                    Collections.swap(list, left, right);
                }
            }
            Collections.swap(list, from, left - 1);
            sort(list, from, right - 1); // <-- pivot was wrong!
            sort(list, right + 1, to);   // <-- pivot was wrong!
        }
    }

    public void executeSort(List<Integer> data) {
        sort(data, 0, data.size() - 1);
    }
}