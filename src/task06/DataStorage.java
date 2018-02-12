package task06;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataStorage {

    private final List<Integer> memory;
    private final List<IStorageChangedListener> listeners;

    public DataStorage(int size) {
        MersenneTwisterFast random = new MersenneTwisterFast();
        this.memory = new ArrayList<>(size);
        this.listeners = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            this.memory.add(random.nextInt());
        }
    }

    public List<Integer> getMemory() {
        return memory;
    }

    public void addListener(IStorageChangedListener listener) {
        if (!this.listeners.contains(listener)) this.listeners.add(listener);
    }

    public void changeStorage() {
        Collections.shuffle(this.memory);
        System.out.println("Memory has been changed! : " + Arrays.toString(this.memory.toArray()));
        this.storageChanged();
    }

    public void removeListener(IStorageChangedListener listener) {
        if (this.listeners.contains(listener)) this.listeners.remove(listener);
    }

    public void storageChanged() {
        for (IStorageChangedListener listener : this.listeners) {
            listener.storageChanged(this.memory);
        }
    }
}