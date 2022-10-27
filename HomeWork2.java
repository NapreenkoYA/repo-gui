package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {

        printCheck();
        printDigital();
        checkNegative();
        printLines();

    }

    private static void printCheck() {
        int a = 5;
        int b = 7;
        int s = a + b;
        System.out.println(s);
        if (s > 10 && s < 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static void printDigital() {
        int a = 5;
        System.out.println("a");
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println(" Число отрицательное");
        }
    }

    private static void checkNegative() {

        int a = 5;
        System.out.println("a");
        if (a < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void printLines() {

        String text = "Hello world";
        int count = 5;
        for (int i = 0; i < count; i++) {
            System.out.println("String text, count");
        }
    }
 }







