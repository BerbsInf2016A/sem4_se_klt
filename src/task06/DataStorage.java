package task06;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A class, representing the storage of data.
 */
public class DataStorage {

    /**
     * The storage for the data.
     */
    private final List<Integer> memory;
    /**
     * A list of listeners, which are interested in changes
     * of the stored data.
     */
    private final List<IStorageChangedListener> listeners;

    /**
     * Constructor for the data storage.
     *
     * @param size The size of the storage.
     */
    public DataStorage(int size) {
        MersenneTwisterFast random = new MersenneTwisterFast();
        this.memory = new ArrayList<>(size);
        this.listeners = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            this.memory.add(random.nextInt());
        }
    }

    /**
     * Getter for the storage / memory.
     *
     * @return The storage / memory.
     */
    public List<Integer> getMemory() {
        return memory;
    }

    /**
     * Add a listener, which is interested in the event of changed storage.
     *
     * @param listener The listener to add.
     */
    public void addListener(IStorageChangedListener listener) {
        if (!this.listeners.contains(listener)) this.listeners.add(listener);
    }

    /**
     * Change the memory / storage, to trigger the sorting.
     */
    public void changeStorage() {
        Collections.shuffle(this.memory);
        System.out.println("Memory has been changed! : " + Arrays.toString(this.memory.toArray()));
        this.storageChanged();
    }

    /**
     * Remove a listener.
     *
     * @param listener The listener to remove.
     */
    public void removeListener(IStorageChangedListener listener) {
        if (this.listeners.contains(listener)) this.listeners.remove(listener);
    }

    /**
     * Called, when the storage / memory has changed.
     */
    public void storageChanged() {
        for (IStorageChangedListener listener : this.listeners) {
            listener.storageChanged(this.memory);
        }
    }
}