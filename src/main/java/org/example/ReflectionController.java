package org.example;

import java.util.Scanner;

public class ReflectionController {

    public void startingQuestions() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jaka książkę zaczynasz czytać?");
        String bookTitle = scanner.nextLine();

        System.out.println("Ile ta książka ma rozdziałów?");
        int chapters = scanner.nextInt();

        System.out.println("Jaki problem chcesz rozwiązać czytając ta książa?");
        String goal = scanner.nextLine();
    }
}