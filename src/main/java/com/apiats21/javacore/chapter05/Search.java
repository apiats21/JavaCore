package main.java.com.apiats21.javacore.chapter05;
// Поиск в массиве с пременением цикла for в стиле for each
public class Search {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        for (int i : nums) {
            if (i == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Значение найдено!");
    }
}
