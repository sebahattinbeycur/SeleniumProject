package utils;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        String value = scanner.next();
        System.out.println("Input entered: "+ value);
        scanner.close();

    }
}
