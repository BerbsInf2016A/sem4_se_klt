package task06;

import java.util.List;

/**
 * The context for the sort operations.
 */
public class SortProcess implements IStorageChangedListener {

    /**
     * The sort strategy.
     */
    private ISortStrategy strategy;

    /**
     * Constructor for the sort process..
     *
     * @param strategy The strategy, which should be used.
     */
    public SortProcess(ISortStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Execute the strategy.
     *
     * @param data The data to sort.
     */
    public void executeStrategy(List<Integer> data) {
        this.strategy.executeSort(data);
    }

    /**
     * Should be called, when the data is changed.
     *
     * @param data The changed data.
     */
    public void storageChanged(List<Integer> data) {
        this.executeStrategy(data);
    }
}