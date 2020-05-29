package com.sapientpjp.tutorial;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class TimeoutDaemon extends Thread {

    public void run(){
        try {
            Thread.sleep(5000);
            System.out.println("");
            this.interrupt();
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}

class AnswerPrompt extends Thread {

    private String answer;
    Scanner scanner = new Scanner(System.in);

    AnswerPrompt(String ans) {
        answer = ans;
    }

    public void run() {
        try {
            String choice = scanner.nextLine();
            if (choice.toUpperCase().equals(answer)) {
                QuizMaster.score += 1;
            }
            Thread.sleep(0);
            this.interrupt();
        }
        catch (InterruptedException e) {
            scanner.close();
            Thread.currentThread().interrupt();
        }
    }
}

public class QuizMaster {

    private static HashMap<String, HashSet<String>> questions = new HashMap<String, HashSet<String>>(Map.ofEntries(
            Map.entry("Q1", new HashSet<String>(Set.of("A", "B", "C", "D"))),
            Map.entry("Q2", new HashSet<String>(Set.of("A", "B", "C", "D")))
    ));

    private static HashMap<String, String> answers = new HashMap<String, String>(Map.ofEntries(
            Map.entry("Q1", "C"),
            Map.entry("Q2", "A")
    ));

    static int score = 0;

    public void begin(){
        System.out.println("Let's begin the quiz\n---------------------\n");
        for (Map.Entry<String, HashSet<String>> q : questions.entrySet()){
            // Load question and correct answer
            String question = q.getKey();
            HashSet<String> options = q.getValue();
            String answer = answers.get(question);

            // Display question
            System.out.println(question + "?");
            options.forEach(System.out::println);
            System.out.print("Your answer ? : ");

            TimeoutDaemon timer = new TimeoutDaemon();
            AnswerPrompt prompt = new AnswerPrompt(answer);

            prompt.start();
            timer.start();

            while (true) {
                if (timer.isInterrupted()) {
                    prompt.interrupt();
                    break;
                }
                else if (prompt.isInterrupted()) {
                    timer.interrupt();
                    break;
                }
            }

        }

        System.out.printf("Final Score = %d", score).println();
    }
}
