package main.java.com.apiats21.javacore.Chapter18;

import java.util.EmptyStackException;
import java.util.Stack;

// Продемонстрировать применение класса Stack
public class StackDemo {
    static void showpush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("стек:" + st);
    }

    static void showpop(Stack<Integer> st) {
        System.out.println("pop ->");
        int a = st.pop();
        System.out.println();
        System.out.println("стек: " + st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println("стек: " + st);

        showpush(st, 42);
        showpush(st, 66);
        showpush(st,99);
        showpop(st);
        showpop(st);
        showpop(st);

        try {
            showpop(st);
        } catch (EmptyStackException е) {
            System.out.println("стек пуст");
        }

    }
}
