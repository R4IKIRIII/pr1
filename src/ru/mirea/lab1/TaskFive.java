package ru.mirea.lab1;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.print(Factorial(number));
    }

    private static int Factorial(int number)
    {
        int result = 1;
        for (int count = 2; count <= number; count++)
        {
            result *= count;
        }

        return result;
    }
}
