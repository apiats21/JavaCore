package main.java.com.apiats21.javacore.chapter05;
// Применение цикла for в стиле for each для
// обращения к двухмерному массиву
public class ForEach3 {
    public static void main(String[] args) {
        int nums[][] = new int[3][5];
        int sum = 0;

        // присвоить значения элементам массива
        for (int i=0; i<3; i++)
            for (int j=0; j<5; j++)
                nums[i][j] = (i + 1)*(j + 1);

        for(int i[] : nums)
            for (int y : i) {
                System.out.println("Значение равно: " + y);
                sum +=y;
            }
        System.out.println("Сумма:" + sum);


    }
}
