package main.java.com.apiats21.javacore.chapter28;

// Простой пример программы, позволяющий эксперементировать
// с эффектом от изменения порогового значения и уровня параллелизма
// выполнения задач в классе ForkJoinTask

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

// класс ForkJoinTask преобразует (через класс RecursiveAction)
// элементы массива типа double
class Transform extends RecursiveAction {

    // Порог последовательного выполнения,
    // устанавливаемый конструктором
    int seqThreshold;

    // обрабатываемый массив
    double[] data;

    // определить часть обрабатываемых данных
    int start, end;

    public Transform(int seqThreshold, double[] data, int start, int end) {
        this.seqThreshold = seqThreshold;
        this.data = data;
        this.start = start;
        this.end = end;
    }

    // этот метод выполняет параллельное вычисление
    @Override
    protected void compute() {
        // выполнить далее обработку последовательно,
        // если количество элементов ниже порогового значения
        if((end - start) < seqThreshold) {
            // В следуюшем фрагменте кода элементу по четному
            // индексу присваивается квадратный корень его
            // первоначального значения, а элементу по нечетному
            // индексу ь кубический корень его первоначального значения.
            // Этот код предназначен только для потребления времени ЦП,
            // что бы сделать нагляднее эффект от параллельго выполнения
            for (int i = start; i < end; i++) {
                if((data[i] % 2) == 0)
                    data[i] = Math.sqrt(data[i]);
                else
                    data[i] = Math.cbrt(data[i]);
            }
        }
        else {
            // В противном случае продолжить разделение данных на
            // меньшие части

            // найти середину
            int middle = (start + end) / 2;

            // запустить новые подзадачи на выполнение,
            // используя разделенные на части данные
            invokeAll(new Transform(seqThreshold, data, start, middle),
                      new Transform(seqThreshold, data, middle, end));
        }
    }
}

public class FJExperiment {
    public static void main(String[] args) {
        int pLevel;
        int threshold;

//        if(args.length != 2) {
//            System.out.println(
//                    "Использование: FJExperiment парралелизм порог ");
//            return;
//        }
//        pLevel = Integer.parseInt(args[0]);
//        threshold = Integer.parseInt(args[1]); 91_569_000 60_669_000 42_535_900 62_642_800

        pLevel = 8;
        threshold = 1000;

        // Эти переменные используются для измерения
        // времени выполнения задачи
        long beginT, endT;

        // Создать пулл задач.
        // Обратить внимане на установку уровня параллелизма
        ForkJoinPool fjp = new ForkJoinPool(pLevel);

        double[] nums = new double[1000000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        Transform task =
                new Transform(threshold,nums,0, nums.length);

        // начать измерение времени выполнения задачи
        beginT = System.nanoTime();
        fjp.invoke(task);

        // завершить измерение времени выполнения задачи
        endT = System.nanoTime();

        System.out.println("Уровень параллелизма: " + pLevel);
        System.out.println("Порог последоваельной обработки: " + threshold);
        System.out.println("Истекшее время:" + (endT - beginT) + " нс");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
