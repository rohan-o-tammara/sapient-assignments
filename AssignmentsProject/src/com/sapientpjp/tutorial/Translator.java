package com.sapientpjp.tutorial;

import java.util.*;

public class Translator {

    private static HashMap<String, HashSet<String>> phraseMap = new HashMap<String, HashSet<String>>(Map.ofEntries(
        Map.entry("GoodMorning", new HashSet<String>(Set.of("Good Morning", "Shubhodaya", "Shubhoday", "Bonjour"))),
        Map.entry("GoodEvening", new HashSet<String>(Set.of("Good Evening", "Shubha Sange", "Susandhya", "Bonsoir")))
    ));

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phrase : ");
        String inputKey = scanner.next();
        HashSet<String> translations = phraseMap.get(inputKey);
        if (translations != null) {
            System.out.println("Translations: ");
            System.out.println(translations);
        }
        else {
            System.out.print("Translations not available for this phrase.\nWould you like to input a set ? (Y/N) : ");
            String option = scanner.next();
            if (option.equalsIgnoreCase("y")) {
                HashSet<String> newTranslations = new HashSet<String>();
                System.out.println("Keep giving phrases. Once done, hit enter on empty input.");
                String inputPhrase = scanner.nextLine();
                do {
                    System.out.println(inputPhrase);
                    newTranslations.add(inputPhrase);
                    inputPhrase = scanner.nextLine();
                } while (!inputPhrase.isEmpty());
                phraseMap.put(inputKey, newTranslations);
            }
            else {
                System.out.println("Goodbye!");
            }
        }
    }
}
