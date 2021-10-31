package main.java.com.apiats21.javacore.practicepatterns.behavioral.strategy;

import java.util.Arrays;

public class StrategyDemo {
    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient();

        int[] arr0 = {1,4,3,6,5};
        strategyClient.setStrategy(new SelectionSort());
        strategyClient.executeStrategy(arr0);

        int[] arr1 = {1,5,3,8,6,8,23};
        strategyClient.setStrategy(new InsertingSort());
        strategyClient.executeStrategy(arr1);

        int[] arr2 = {4,3,7,4,8,32,86};
        strategyClient.setStrategy(new BubbleSort());
        strategyClient.executeStrategy(arr2);
    }
}

// Strategy
interface Sorting {
    void sort(int[] arr);
}

class StrategyClient {
    Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int[] arr) {
        strategy.sort(arr);
    }
}

// Bubble sorting strategy
class BubbleSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Bubble sort");
        System.out.println("before:" + Arrays.toString(arr));
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int i = 0; i < barrier; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        System.out.println("after: " + Arrays.toString(arr));
    }
}

// Selection sorting strategy
class SelectionSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Selection sorting");
        System.out.println("before: " + Arrays.toString(arr));
        for (int barrier = 0; barrier < arr.length - 1; barrier++)
            for (int i = barrier + 1; i < arr.length; i++) {
                if (arr[i] < arr[barrier]) {
                    int tmp = arr[i];
                    arr[i] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        System.out.println("After: " + Arrays.toString(arr));
    }
}

// Inserting sorting strategy
class InsertingSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Inserting sorting");
        System.out.println("before: " + Arrays.toString(arr));
        for (int barrier = 1; barrier < arr.length; barrier++) {
            int index = barrier;
            while(index-1>=0 && arr[index]< arr[index-1]) {
                int tmp = arr[index];
                arr[index] = arr[index-1];
                arr[index-1] = tmp;
                index--;
            }
        }
        System.out.println("After: " + Arrays.toString(arr));
    }
}









