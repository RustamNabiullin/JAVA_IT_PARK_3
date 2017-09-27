package ru.itpark;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        System.out.println("Введите значение элементов массива: ");
        int array[] = new int[arraySize];
        int i = 0;
        int SumEven = 0;
        int SumOdd = 0;
        int SumEvenPosition = 0;
        int SumOddPosition = 0;
        int MaxLoc = 0;
        int maxPos = 0;
        for (i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (i = 0; i < array.length; i++) {
            int x = array[i] % 2;
            if (x == 0) {
                SumEven = SumEven + array[i];
            } else {
                SumOdd = SumOdd + array[i];
            }
            int z = i % 2;
            if (z == 0) {
                SumEvenPosition = SumEvenPosition + i;
            } else {
                SumOddPosition = SumOddPosition + i;
            }
        }
        for (i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                MaxLoc++;
            }
        }
        int temp = 1;
        for (i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                temp++;
            }
            if (array[i] >= array[i + 1] && temp > maxPos) {
                maxPos = temp;
                temp = 1;
            }
        }

        System.out.println("1) Сумма четных элементов равна: " + SumEven);
        System.out.println("2) Сумма нечетных элементов равна: " + SumOdd);
        System.out.println("3) Сумма элементов, стоящих на четной позиции равна: " + SumEvenPosition);
        System.out.println("4) Сумма элементов, стоящих на нечетной позиции равна: " + SumOddPosition);
        System.out.println("5) Количество локальных максимумов: " + MaxLoc);
        System.out.println("6) Максимальная длина подпоследовательности из возрастающих чисел: " + maxPos);
        System.out.println("7) Замена нулей отрицательным числом: ");
        for (i = 0; i < array.length; i++){
            if (array[i] == 0){
                array[i] = array[i + 1] * -1;
            }
            System.out.print(array[i] + " ");
        }

    }
}

