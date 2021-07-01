package main.java.com.apiats21.javacore.chapter09;
// Определить интерфейс для целочисленного типа
interface IntStack{
    void push(int num); // сохранить элемент в стеке
    int pop();          // извлечь элемент из стека
}
// Реализация интерфейса IntStack  для стека фиксированного размера
class FixedStack implements IntStack {
    private int stck[];
    private int tos;
    // выделить память и инициализировать стек
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    public void push(int num) {
        if(tos == stck.length)
            System.out.println("Стек заполнен");
        else stck[++tos] = num;
    }

    // извлечь элемент из стека
    public int pop() {
        if
            (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else
            return stck[tos--];
    }
}

public class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        // разместить числа в стеке
        for (int i=0; i<5; i++) mystack1.push(i);
        for (int j=0; j<8; j++) mystack2.push(j);

        // извлечь эти числа из стека
        System.out.print("Стек в mystack1: ");
        for (int i=0; i<5; i++)
            System.out.print(mystack1.pop() + " ");
        System.out.println();

        System.out.print("Стек в mystack2: ");
        for (int j = 0; j<8; j++)
            System.out.print(mystack2.pop() + " ");
    }
}
