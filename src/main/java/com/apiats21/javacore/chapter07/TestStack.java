package main.java.com.apiats21.javacore.chapter07;
// В этом классе определяется целочисленный стек, в который
// может содержать 10 значений
class Stack {
    /*  Теперь переменные stck и tos являются закрытыми.
        Это означает что они не могут быть случайно или
        намеренно изменены таким образом, чтобы нарушить стек.
     */
    private int stck[] = new int[10];
    private int tos;

    // инициализировать вершину стека
    Stack () {
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item) {
        if (tos == 9)
            System.out.println(" Стек заполнен.");
        else stck[++tos] = item;
    }
    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println(" Стек не загружен");
            return 0;
        }
        else return stck[tos--];
    }
}
public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // разместить числа в стеке
        for (int i=0; i<10; i++) mystack1.push(i);
        for (int j=0; j<10; j++) mystack2.push(j);

        // извлечь эти числа из стека
        System.out.println("Стек в mystack1:");
        for (int i=0; i<10; i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("Стек в mystack2:");
        System.out.println(mystack2.pop());

        // эти операторы не допустимы
        // mystack1.tos = -2;
        // mystack2.stck[3] = 100;
    }

}
