package main.java.com.apiats21.javacore.chapter09;
// Реализация "наращеваемого" стека
class DynaStack implements IntStack {
    private int[] stck;
    private int tos;

    // выделить память и инициализировать стек
    DynaStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    public void push(int item) {
        // если стек заполнен, выделить память под больший стек
         if (tos == stck.length-1) {
             int temp[] = new int[stck.length*2]; // удвоить размер стека
             for (int i=0; i< stck.length; i++ ) temp[i] =stck[i];
             stck = temp;
             stck[++tos] = item;
         }
         else stck[++tos] = item;
    }

    // извлечь элемент из стека
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не заполнен");
            return 0;
        }
        else return stck[tos--];
    }
}

public class IFTest2 {
    public static void main(String[] args) {
        DynaStack mystack1 = new DynaStack(5);
        DynaStack mystack2 = new DynaStack(8);

        // в этих циклах увеличивается размер каждого из стека
        for (int i=0; i<12; i++) mystack1.push(i);
        for (int j=0; j<12; j++) mystack2.push(j);

        System.out.print("Стек в mystack1: ");
        for (int i=0; i<12; i++)
            System.out.print(mystack1.pop() + " ");
        System.out.println();

        System.out.print("Стек в mystack2: ");
        for (int j=0; j<12; j++)
            System.out.print(mystack2.pop() + " ");

    }
}
