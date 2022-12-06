package com.company;

public class Piece {
    private int row;
    private int column;
    private boolean isBlack;
    protected char symbol;

    public Piece(int row, int column, boolean isBlack) {
        this.row = row;
        this.column = column;
        this.isBlack = isBlack;
        symbol = 'x'; //dummy symbol shouldn't be on the board
    }

    public Piece(String position, boolean isBlack){
        this.isBlack = isBlack;
        symbol = 'x';
        row = getRowFromPosition(position);
        column = getColumnFromPosition(position);
    }
    // For a position A8 return row number 7
    private int getRowFromPosition(String p){
        char posChar = p.toCharArray()[1]; //A8 -> 8
        int rowNumber = Character.getNumericValue(posChar);
        return rowNumber -1;
    }
    // For a position A8 return column 0
    private int getColumnFromPosition(String p){
        char colChar = p.toCharArray()[0];
        int asciiValue = colChar;
        int colNumber = asciiValue - (int)'A';
        return colNumber;
    }

    public char getSymbol(){
        if(isBlack){
            return Character.toUpperCase(symbol);
        }
        return Character.toLowerCase(symbol);
    }

    private String columnToLetter(int c){
        char letter = (char)('A' + c);
        return Character.toString(letter);
    }

    private  String rowToNumber(int r){
        return Integer.toString(r+1);
    }


    //convert row and column values to chess notation
    public String getPosition(){
        return columnToLetter(column) + rowToNumber(row);
    }

    public boolean isValidMove(String targetPosition){
        return true;
    }
}
