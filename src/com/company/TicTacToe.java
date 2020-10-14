package com.company;

public class TicTacToe {

    //create board
    char[][] ticTacToeBoard = new char[3][3];

    // give board cells index value 1-9
    public TicTacToe() {
        for (int i = 0; i < ticTacToeBoard.length; i++){

            for(int j = 0; j < ticTacToeBoard.length; j++){
                //give value to array elements
                ticTacToeBoard[i][j] = ("|"+ ((i+1) * (j+1)) + "|" ).charAt(1);
                //System.out.println((i+1) * (j+1));
            }
        }

        for(int i = 0; i < ticTacToeBoard.length; i++){
            for(int j = 0; j < ticTacToeBoard.length; j++) {
                System.out.println("|     " + ticTacToeBoard[i][j] + "     |");
            }
            System.out.println("-----------------------------------------------");
        }
        System.out.println(ticTacToeBoard[0][0]);
    }

    //create a visual board in terminal
}
