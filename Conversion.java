package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Conversion {

    HashMap<String, Character> hashMap = new HashMap<>();
    {
        hashMap.put(".-", 'a');
        hashMap.put("-...", 'b');
        hashMap.put("-.-.", 'c');
        hashMap.put("-..", 'd');
        hashMap.put(".", 'e');
        hashMap.put("..-.", 'f');
        hashMap.put("--.", 'g');
        hashMap.put("....", 'h');
        hashMap.put("..", 'i');
        hashMap.put(".---", 'h');
        hashMap.put("-.-", 'k');
        hashMap.put(".-..", 'l');
        hashMap.put("--", 'm');
        hashMap.put("-.", 'n');
        hashMap.put("---", 'o');
        hashMap.put(".--.", 'p');
        hashMap.put("--.-", 'q');
        hashMap.put(".-.", 'r');
        hashMap.put("...", 's');
        hashMap.put("-", 't');
        hashMap.put("..-", 'u');
        hashMap.put("...-", 'v');
        hashMap.put(".--", 'w');
        hashMap.put("-..-", 'x');
        hashMap.put("-.--", 'y');
        hashMap.put("--..", 'z');
        hashMap.put(".-.-.-", ',');
        hashMap.put("......", '.');
        hashMap.put("..--..", '?');
        hashMap.put("-....-", '-');
        hashMap.put("...---", ':');
        hashMap.put("-.-.-", ';');
        hashMap.put("-------", ' ');
    }
    Text text = new Text();
    public void morseToText() {
        String[] morseArray = text.getTextFromFile().split(" ");
        char[] textArray = new char[morseArray.length];

        for (int i = 0; i < morseArray.length; i++) {
            Set<Map.Entry<String, Character>> set = hashMap.entrySet();
            for (Map.Entry<String, Character> entry : set) {
                if (morseArray[i].equals(entry.getKey())) {
                    textArray[i] = entry.getValue();
                }
            }
            text.setTextToFile(new String(textArray));
        }
    }

    public void textToMorse() {
        char[] textArray = text.getTextFromFile().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < textArray.length; i++) {
            Set<Map.Entry<String, Character>> set = hashMap.entrySet();
            for (Map.Entry<String, Character> entry : set) {
                if (textArray[i] == (entry.getValue())) {
                    stringBuilder.append(entry.getKey()).append(" ");
                }
            }
            text.setTextToFile(new String(stringBuilder));
        }
    }
}
