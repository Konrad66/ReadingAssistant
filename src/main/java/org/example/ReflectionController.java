package org.example;

import java.util.ArrayList;
import java.util.List;

public class ReflectionController {

    private InputReader inputReader = new InputReader();

    //Pytania na start
    private String bookTitle;
    private int chapters;
    private String goal;
    private String goalStepBook;
    private String known;
    private String unknown;

    //Pytania do pierwszego rozdziału
    private List<String> goalStepChapterList = new ArrayList<>();
    private String chapterEssence;
    private String justification;
    private String observations;
    private String readerQuestions;

    //pytania po przeczytaniu książki
    ////podsumowanie książki
    private String importantThing;
    private String mainMessage;
    private String goalAnswer;
    private String unanswered;

    ////wprowadzanie zmian
    private String endGoal;
    private String problemResolved;
    private String motivated;

    ////ocena książki
    private String recommendAuthor;
    private String recommendBook;


    public void assistBookReading() {
        System.out.println("Zaczynasz czytać książkę.");
        startingQuestions();
        for (int i = 0; i > chapters; i++) {
            System.out.println("Jesteś na rozdziale nr: " + (i + 1));
            oneChapter();
        }
        System.out.println("Skończyłeś czytać książkę.");
        summaryBook();
    }

    private void startingQuestions() {
        System.out.println("Jaka książkę zaczynasz czytać?");
        bookTitle = inputReader.readLine();

        System.out.println("Jaki problem chcesz rozwiązać czytając ta książa?");
        goal = inputReader.readLine();

        System.out.println("Ile ta książka ma rozdziałów?");
        chapters = inputReader.readNumber();

        System.out.println("Co już wiesz o temacie który porusza ta książka?");
        known = inputReader.readLine();

        System.out.println("Czego chciałbyś się dowiedzieć?");
        unknown = inputReader.readLine();

        System.out.println("Czy ta książka nasuwa Ci pomysł na wprowadzenie jakiejś zmiany?");
        //chcemy aby użytkownik rozpisał jak osiągnie swój cel - np zmieni sposób odzywiania co pomoże schudnąć
        //TODO znaleźć nazwę na coś co jest krokiem do celu
        goalStepBook = inputReader.readLine();
    }


    private void oneChapter() {
        System.out.println("Jaka jest główna myśl przeczytanego rozdziału? Co autor chciał przekazać?");
        chapterEssence = inputReader.readLine();

        System.out.println("Uzasadnij, dlaczego jest to prawda lub nie.");
        justification = inputReader.readLine();

        System.out.println("Wypisz najważniejsze spostrzeżenia z tego rozdziału. Co zwróciło twoją uwagę?");
        observations = inputReader.readLine();

        System.out.println("Czy ten rozdział zainspirował Cię do wprowadzenia jakichś zmian?");
        goalStepChapterList.add(inputReader.readLine());

        System.out.println("Jakie pytania nasuwa ten rozdział?");
        readerQuestions = inputReader.readLine();
    }


    private void summaryBook() {

    }

    @Override
    public String toString() {
        return "ReflectionController{" +
                "bookTitle='" + bookTitle + '\'' +
                ", chapters=" + chapters +
                ", goal='" + goal + '\'' +
                ", goalStepBook='" + goalStepBook + '\'' +
                ", goalStepChapter='" + goalStepChapterList + '\'' +
                ", known='" + known + '\'' +
                ", unknown='" + unknown + '\'' +
                ", chapterEssence='" + chapterEssence + '\'' +
                ", justification='" + justification + '\'' +
                ", observations='" + observations + '\'' +
                ", readerQuestions='" + readerQuestions + '\'' +
                '}';
    }
}