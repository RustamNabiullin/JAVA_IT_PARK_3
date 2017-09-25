package ru.itpark;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];

        int min = 0; int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
            max = array[0];
            for (int k = 0; k < array.length; k++) {
                if (array[k] > max) {
                    max = array[k];
                }
                int temp = min;
                min = max;
                max = temp;
            }
            System.out.print(max + " " + min);
        }
    }
