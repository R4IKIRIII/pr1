package ru.mirea.lab1;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        int len = 0, sum = 0;

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
            }
        }

        int count = len-1;
        do {
            sum += array[count];
            count--;
        } while (count >= 0);

        int max = array[0], min = array[0];
        for (count = 1; count < len; count++)
        {
            if (max < array[count])
                max = array[count];

            if (array[count] < min)
                min = array[count];
        }

        System.out.print("sum = " + sum + "\nmax = " + max + "\nmin = " + min);
    }
}
