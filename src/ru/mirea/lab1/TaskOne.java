package ru.mirea.lab1;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        int len = 0;
        float sum = 0, average = 0;

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt())
        {
            len = sc.nextInt();
        }

        int[] array = new int[len];

        for (int count = 0; count < len; count++)
        {
            if (sc.hasNextInt())
            {
                array[count] = sc.nextInt();
                sum += array[count];
            }
        }

        average = sum / len;

        System.out.print("Sum = " + sum + "\nAverage = " + average);
    }
}
