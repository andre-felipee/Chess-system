package chesslayer;

import boardlayer.Board;
import boardlayer.Piece;

public class ChessPiece extends Piece {
    
    private Color color;
    private Integer moveCount;

    public ChessPiece() {
    }

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }
}
