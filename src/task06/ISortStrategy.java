package task06;

import java.util.List;

/**
 * Interface for the different sort strategies.
 */
public interface ISortStrategy {

    /**
     * Execute the sort operation.
     *
     * @param data The data to sort.
     */
    void executeSort(List<Integer> data);

}