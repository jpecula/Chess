package com.company;

import java.util.Scanner;

public class Chess {
    private Piece[][] board;

    // set up the board for the start of the game
    public Chess() {
        board = new Piece[8][8];
        //create pieces
        for(int c =0; c<8; c++){
            board[1][c] = new Piece(1,c,false);
            board[6][c] = new Piece(6,c,false);
        }

    }
    //current pawn layout
    public void display(){
        for(int r = 0; r<8; r++){
            for(int c = 0; c<8; c++){
                if(board[r][c] != null){
                    System.out.print(board[r][c].getSymbol() + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public Piece getPlaceAt(String position){
        int row = ChessUtils.getRowFromPosition(position);
        int column = ChessUtils.getColumnFromPosition(position);
        return board[row][column];
    }

    public void move(){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the place to move: ");
        String startPosition = input.nextLine();
        System.out.println("Enter the square to move to: ");
        String endPosition = input.nextLine();
        Piece toMove = getPlaceAt(startPosition);
        boolean  validMove = false;
        if(toMove != null){
            validMove = toMove.isValidMove(endPosition);
        }
         if(validMove){
             System.out.print(toMove.getSymbol() + " moves to " + endPosition);
         }else{
             System.out.print("You cant do that");
        }
    }
}
