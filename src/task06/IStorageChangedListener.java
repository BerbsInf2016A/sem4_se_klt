package task06;

import java.util.List;

/**
 * An interface for listeners, which are interested in event of changed
 * storage / memory.
 */
public interface IStorageChangedListener {

    /**
     * The method is called, when the stored data has been changed.
     *
     * @param data The changed data.
     */
    void storageChanged(List<Integer> data);

}