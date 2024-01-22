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
    private List<String> chapterEssence = new ArrayList<>();
    private List<String> justification = new ArrayList<>();
    private List<String> observations = new ArrayList<>();
    private List<String> readerQuestions = new ArrayList<>();

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

        System.out.println("Czy chcesz zapisać progres?");
        String answer = inputReader.readLine();
        if(answer.equals("koniec")){
            saveAnswers();
            return;
        }

        for (int i = 0; i < chapters; i++) {
            System.out.println("Jesteś na rozdziale nr: " + (i + 1));
            oneChapter();
        }

        System.out.println("Skończyłeś czytać książkę.");
        summaryBook();
        makeChanges();
        bookRating();
    }

    private void startingQuestions() {
       /* System.out.println("Jaka książkę zaczynasz czytać?");
        bookTitle = inputReader.readLine();

        System.out.println("Jaki problem chcesz rozwiązać czytając ta książa?");
        goal = inputReader.readLine();*/

        System.out.println("Ile ta książka ma rozdziałów?");
        chapters = inputReader.readNumber();
/*
        System.out.println("Co już wiesz o temacie który porusza ta książka?");
        known = inputReader.readLine();

        System.out.println("Czego chciałbyś się dowiedzieć?");
        unknown = inputReader.readLine();

        System.out.println("Czy ta książka nasuwa Ci pomysł na wprowadzenie jakiejś zmiany?");
        //chcemy aby użytkownik rozpisał jak osiągnie swój cel - np zmieni sposób odzywiania co pomoże schudnąć
        //TODO znaleźć nazwę na coś co jest krokiem do celu
        goalStepBook = inputReader.readLine();

 */
    }

    private void oneChapter() {
        System.out.println("Jaka jest główna myśl przeczytanego rozdziału? Co autor chciał przekazać?");
        chapterEssence.add(inputReader.readLine());

        System.out.println("Uzasadnij, dlaczego jest to prawda lub nie.");
        justification.add(inputReader.readLine());

        System.out.println("Wypisz najważniejsze spostrzeżenia z tego rozdziału. Co zwróciło twoją uwagę?");
        observations.add(inputReader.readLine());

        System.out.println("Czy ten rozdział zainspirował Cię do wprowadzenia jakichś zmian?");
        goalStepChapterList.add(inputReader.readLine());

        System.out.println("Jakie pytania nasuwa ten rozdział?");
        readerQuestions.add(inputReader.readLine());
    }


    private void summaryBook() {
        System.out.println("Jaka jest najważniejsza rzecz którą nauczyłeś się z tej książki?");
        importantThing = inputReader.readLine();

        System.out.println("Jak uważasz, jakie jest główne przesłanie przeczytanej książki?");
        mainMessage = inputReader.readLine();

        System.out.println("Czy odpowiedziałeś sobie na pytanie zadane na początku czytania książki? Uzasadnij.");
        goalAnswer = inputReader.readLine();

        System.out.println("Czy jakieś pytanie zostało bez odpowiedzi? Uzasadnij.");
        unanswered = inputReader.readLine();
    }

    private void makeChanges() {
        System.out.println("Czy ta książka zainspirowała Cię do wprowadzenia jakichś zmian?");
        endGoal = inputReader.readLine();

        System.out.println("Czy uważasz że ta książka była wystarczająca do rozwiązania twojego problemu?");
        problemResolved = inputReader.readLine();

        System.out.println("Jak bardzo czujesz się zmotywowany do wprowadzania zmian po przeczytaniu tej książki?");
        motivated = inputReader.readLine();
    }

    private void bookRating() {
        System.out.println("Czy przeczytałbyś kolejną książkę tego autora? Uzasadnij.");
        recommendAuthor = inputReader.readLine();

        System.out.println("Czy polecasz tę książkę?");
        recommendBook = inputReader.readLine();
    }

    //zapis odpowiedzi
    private void saveAnswers(){
        System.out.println("Zapisuje odpowiedzi.");
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