package main.java.com.apiats21.javacore.chapter28;

// Простой пример применения класса RecursiveTask<V>

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

// Класс RecursiveTask, используемый для вычисления суммы
// значений элементов в массиве типа double
class Sum1 extends RecursiveTask<Double> {

    // Пороговое значение последовательного выполнения
    final int seqThreshold = 500;

    // Обрабатываемый массив
    double[] data;

    // определить часть обрабатываемых данных
    int start, end;

    public Sum1(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    // определить сумму значений элементов в массиве типа double

    @Override
    protected Double compute() {
        double sum = 0;

        // Если количество элементов ниже порогового значения,
        // то выполнить далее обработку последовательно
        if ((end - start) < seqThreshold) {
            // суммировать значения элементов в массиве типа double
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        } else {
            // в противном случае продолжить разделение данных на
            // меньшие части

            // найти середину
            int middle = (start + end) / 2;

            // запустить новые подзадачи на выполнение, используя
            // разделеные на части данные
            Sum1 subTaskA = new Sum1(data, start, middle);
            Sum1 subTaskB = new Sum1(data, middle, end);

            // запустить каждую подзадачу путем развлетвления
            subTaskA.fork();
            subTaskB.fork();

            // ожидать завершения подзадач и накопить результаты
            sum = subTaskA.join() + subTaskB.join();
        }
        // возвратить конечную сумму
        return sum;
    }
}

// Продемонстрировать параллельное выполнение
public class RecurTaskDemo {
    public static void main(String[] args) {
        // создать пулл задач
        ForkJoinPool fjp = new ForkJoinPool();

        double[] nums = new double[5000];

        // инициализировать массив nums чередующимися
        // положительными и отрицательными знанениями
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) (((i % 2) == 0) ? i : -i);
        }

        Sum1 task = new Sum1(nums, 0, nums.length);

        // Запустить задачи типа ForkJoinTask. Обратите
        // внимание на то, что в данном слочае метод invoke()
        // возвращает результат
        double summation = fjp.invoke(task);

        System.out.println("Суммирование " + summation);
    }
}
