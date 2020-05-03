package com.sapientpjp.tutorial;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterToHexPrime {

    private static final HashMap<Character, Integer> map = new HashMap<Character, Integer>(Map.ofEntries(
            Map.entry('A', 1),
            Map.entry('B', 2),
            Map.entry('C', 3),
            Map.entry('D', 5),
            Map.entry('E', 7),
            Map.entry('F', 11),
            Map.entry('G', 13),
            Map.entry('H', 17),
            Map.entry('I', 19),
            Map.entry('J', 23),
            Map.entry('K', 29),
            Map.entry('L', 31),
            Map.entry('M', 37),
            Map.entry('N', 41),
            Map.entry('O', 43),
            Map.entry('P', 47),
            Map.entry('Q', 53),
            Map.entry('R', 59),
            Map.entry('S', 61),
            Map.entry('T', 67),
            Map.entry('U', 71),
            Map.entry('V', 73),
            Map.entry('W', 79),
            Map.entry('X', 83),
            Map.entry('Y', 89),
            Map.entry('Z', 97)
    ));

    private void stringToPrime(String str) {

        char[] chars = str.toCharArray();

        for (char c : chars) {
            int primeNo = this.map.get(c);
            String hexStr = Integer.toHexString(primeNo);
            hexStr = hexStr.toUpperCase();
            System.out.print(hexStr + " ");
        }
    }

    public void run() {
        System.out.print("Enter an input string : ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();

        inputString = inputString.toUpperCase();
        System.out.print("Hex representation of mapped prime numbers : ");
        this.stringToPrime(inputString);
    }
}
