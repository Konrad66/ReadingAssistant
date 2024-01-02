package org.example;

import java.util.Scanner;

public class InputReader {

    private Scanner scanner = new Scanner(System.in);

    public int readNumber() {
        int answer = scanner.nextInt();
        scanner.nextLine();
        return answer;
    }

    public String readLine() {
        String answer = scanner.nextLine();
        return answer;
    }
}