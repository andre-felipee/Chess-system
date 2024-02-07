package application;

import chesslayer.ChessMatch;

public class App {
    public static void main(String[] args) throws Exception {

        ChessMatch chessMatch = new ChessMatch();
        UserInterface.printBoard(chessMatch.getPieces()); 
    }
}
