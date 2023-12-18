package org.example;

import java.util.Scanner;

public class Questions {


    public void firstQuestions() {
        Scanner scanner = new Scanner(System.in);

        String bookName;
        String numberOfChapter;
        String goal;

        System.out.println("Jaka książkę zaczynasz czytać?");
        bookName = scanner.nextLine();

        System.out.println("Ile ta książka ma rozdziałów?");
        numberOfChapter = scanner.nextLine();

        System.out.println("Jaki problem chcesz rozwiązać czytając ta książa?");
        goal = scanner.nextLine();
    }
}
