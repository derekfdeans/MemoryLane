package com.derekfdeans;

import java.util.Random;
import java.util.Scanner;

class Main {
    static int scannerToInteger(Scanner scanner) {
        String input = scanner.nextLine().trim().toLowerCase();

        try { return Integer.parseInt(input);
        } catch (NumberFormatException ignored) { }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password = new Random().nextInt(10, 20);

        System.out.println("what's the password? ( " + password + " )");
        boolean passwordIsCorrect = false;
        for (int input = scannerToInteger(scanner); !passwordIsCorrect;) {
            if (input == password) {
                System.out.println("correct!");
                passwordIsCorrect = true;
            } else {
                System.out.println("incorrect. try again:");
                input = scanner.nextInt();
            }
        }
    }
}
