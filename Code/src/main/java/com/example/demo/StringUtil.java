package com.example.demo;

import java.util.List;

public class StringUtil {
    public static String toString(List<String> wordList) {
        String result = "";
        if (wordList != null) {
            StringBuilder sb = new StringBuilder();
            for (String word : wordList) {
                sb.append(word);
                sb.append(" ");
            }
            result = sb.toString().trim();
        }
        return result;
    }

    public static boolean isEmpty(String value) {
        return value == null || value.trim().length() < 1;
    }

}