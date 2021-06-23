package main.java.com.apiats21.javacore.chapter05;
// Продемонстрировать применение конструкции if-else-if
public class IfElse {
    public static void main(String[] args) {
        int month = 4; // Апрель
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "зиме";
        else if (month == 3 || month == 4 || month == 5)
            season = "весне";
        else if (month == 6 || month == 7 || month == 8)
            season = "лету";
        else if (month == 9 || month == 10 || month == 11)
            season = "осени";
        else season = "Вымышленным месяцам";

        System.out.println("Апрель относится к " + season + ".");
    }
}
