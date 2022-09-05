package ru.mirea.lab1;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        for (int count = 0; count < line.length(); count++){
            System.out.println(line.charAt(count));
        }
    }
}
