package task06;

import java.util.List;

public class SortContext implements IStorageChangedListener {

    private ISortStrategy strategy;


    public SortContext(ISortStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(List<Integer> data) {
        this.strategy.executeSort(data);
    }

    public void storageChanged(List<Integer> data) {
        this.executeStrategy(data);
    }
}