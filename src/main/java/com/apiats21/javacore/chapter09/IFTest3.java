package main.java.com.apiats21.javacore.chapter09;
/* Создать переменную интерфейса
   и обратиться к стекам через нее.
 */
public class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack; // создать переменную ссылки на интерфейс
        DynaStack ds = new DynaStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds; // загрузить динамичный стек
        // разместить числа в стеке
        for (int i=0; i<12; i++) mystack.push(i);

        mystack = fs; // загрузить фиксированный стек
        for(int j=0; j<8; j++) mystack.push(j);

        mystack = ds;
        System.out.print("Значения в динамическом стеке: ");
        for (int i=0; i<12; i++) System.out.print(mystack.pop() + " ");
        System.out.println();

        mystack = fs;
        System.out.print("Значения в фиксированном стеке: ");
        for (int j=0; j<8; j++) System.out.print(mystack.pop() + " ");
    }
}
