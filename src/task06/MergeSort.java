package task06;

import java.util.ArrayList;
import java.util.List;

/**
 * MergeSort as strategy.
 */
public class MergeSort implements ISortStrategy {

    /**
     * Do the merge sort.
     *
     * @param left  Left part to merge sort.
     * @param right Right part to merge sort.
     * @param list  The list to work on.
     */
    private static void merge(List<Integer> left, List<Integer> right, List<Integer> list) {
        int leftIndex = 0;
        int rightIndex = 0;
        int listIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) < right.get(rightIndex)) {
                list.set(listIndex++, left.get(leftIndex++));
            } else {
                list.set(listIndex++, right.get(rightIndex++));
            }
        }
        while (leftIndex < left.size()) {
            list.set(listIndex++, left.get(leftIndex++));
        }
        while (rightIndex < right.size()) {
            list.set(listIndex++, right.get(rightIndex++));
        }
    }

    /**
     * Execute the sort operation.
     *
     * @param data The data to sort.
     */
    public void executeSort(List<Integer> data) {
        if (data.size() < 2) {
            return;
        }
        int mid = data.size() / 2;
        List<Integer> left = new ArrayList<>(data.subList(0, mid));
        List<Integer> right = new ArrayList<>(data.subList(mid, data.size()));

        executeSort(left);
        executeSort(right);
        merge(left, right, data);
    }
}
