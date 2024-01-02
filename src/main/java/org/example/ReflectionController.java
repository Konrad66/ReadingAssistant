package org.example;

import java.util.Scanner;

public class ReflectionController {

    private InputReader inputReader = new InputReader();
    private String bookTitle;
    private int chapters;
    private String goal;
    private String goalStep;


    public void startingQuestions() {
        System.out.println("Jaka książkę zaczynasz czytać?");
        bookTitle = inputReader.readLine();

        System.out.println("Jaki problem chcesz rozwiązać czytając ta książa?");
        goal = inputReader.readLine();

        System.out.println("Ile ta książka ma rozdziałów?");
        chapters = inputReader.readNumber();
    }


    public void firstGoals() {
        System.out.println("Czy masz jakiś pomysł na zmiany jakie chcesz wproawdadzić po przeczytantu tej książki?");
        //chcemy aby użytkownik rozpisał jak osiągnie swój cel - np zmieni sposób odzywiania co pomoże schudnąć
        //TODO znaleźć nazwę na coś co jest krokiem do celu
        goalStep = inputReader.readLine();
    }

    @Override
    public String toString() {
        return "ReflectionController{" +
                "bookTitle='" + bookTitle + '\'' +
                ", chapters=" + chapters +
                ", goal='" + goal + '\'' +
                ", goalStep='" + goalStep + '\'' +
                '}';
    }
}