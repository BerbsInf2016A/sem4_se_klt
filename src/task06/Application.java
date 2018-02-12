package task06;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        DataStorage storage = new DataStorage(64);


        SortContext context = new SortContext(new QuickSort());
        storage.addListener(context);

        storage.changeStorage();

        System.out.println("Sorted memory: " + Arrays.toString(storage.getMemory().toArray()));

        storage.removeListener(context);

        context = new SortContext(new MergeSort());
        storage.addListener(context);

        storage.changeStorage();

        System.out.println("Sorted memory: " + Arrays.toString(storage.getMemory().toArray()));


    }
}
