package com.company;

public class ChessUtils {
    // For a position A8 return row number 7
    public static int getRowFromPosition(String p) {
        char posChar = p.toCharArray()[1]; //A8 -> 8
        int rowNumber = Character.getNumericValue(posChar);
        return rowNumber - 1;
    }

    // For a position A8 return column 0
    public static int getColumnFromPosition(String p) {
        char colChar = p.toCharArray()[0];
        int asciiValue = colChar;
        int colNumber = asciiValue - (int) 'A';
        return colNumber;
    }

    public static String columnToLetter(int c) {
        char letter = (char) ('A' + c);
        return Character.toString(letter);
    }

    public static String rowToNumber(int r) {
        return Integer.toString(r + 1);
    }
}

