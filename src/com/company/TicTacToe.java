package com.company;
import java.util.*;

public class TicTacToe {

    Scanner scanner = new Scanner(System.in);

    //create board
    char[][] ticTacToeBoard = new char[3][3];

    // give board cells index value 1-9
    public TicTacToe() {
        System.out.println(ticTacToeBoard[0].length);
        for (int i = 0; i < ticTacToeBoard.length; i++){

            for(int j = 0; j < ticTacToeBoard[i].length; j++){
                System.out.println("row "+i+ " col: " + j);
                //give value to array elements
                ticTacToeBoard[i][j] = (""+ (i * ticTacToeBoard.length + j + 1) + "|" ).charAt(0);

            }
        }
        //create a visual board in terminal:
        System.out.println("-------------");
        for(var row: ticTacToeBoard){
            System.out.print("|");
            for(var cell: row){
                System.out.print(" " + cell + " |");
            }
            System.out.println("\n-------------");
        }

        //main();
    }

    public void print(String x){
        if(!x.equals("")){
            System.out.println(x);
        }
    }
/*
    public void main(){
        print("\n".repeat(50));
        print("write the number of the cell you choose:");
        try {
            char charInput = scanner.nextLine().charAt(0);

            //create a visual board in terminal:
            System.out.println("-------------");
            for(var row: ticTacToeBoard){
                System.out.print("|");
                for(var cell: row){
                    if(cell == charInput) {
                        cell = 'X';
                    }
                    System.out.print(" " + cell + " |");
                }
                System.out.println("\n-------------");
            }
        }
        catch(Exception error){
            System.out.println("char out of bounds");
        }
        main();
    }

 */


}
