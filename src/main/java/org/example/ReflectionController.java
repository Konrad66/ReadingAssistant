package org.example;

import java.util.Scanner;

public class ReflectionController {

    private String bookTitle;
    private int chapters;
    private String goal;




    public void startingQuestions() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jaka książkę zaczynasz czytać?");
        bookTitle = scanner.nextLine();

        System.out.println("Jaki problem chcesz rozwiązać czytając ta książa?");
        goal = scanner.nextLine();

        System.out.println("Ile ta książka ma rozdziałów?");
        chapters = scanner.nextInt();


    }

    @Override
    public String toString() {
        return "ReflectionController{" +
                "bookTitle='" + bookTitle + '\'' +
                ", chapters=" + chapters +
                ", goal='" + goal + '\'' +
                '}';
    }

}