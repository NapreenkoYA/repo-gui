package lesson3;

public class HomeWork3 {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


    }
// Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
    private static void task5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

// Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    private static void task4() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static void task3() {
        int[] mult = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int multOn2 = mult.length;
        for (int i = 0; i < mult.length; i++) {
            if (mult[i] < 6) {
                mult[i] = mult[i] * 2;
            }
            System.out.print(mult[i] + " ");
        }

    }

// Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void task1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arrll = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
// 
    private static void task2() {
        int[] fillArr = new int[100];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.println(fillArr[i] + " ");
        }

    }


}









