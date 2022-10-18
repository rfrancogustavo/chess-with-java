package chess;

import boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        this.board = new Board(8,8);
    }

    public ChessPiece[][] getPieces(){
        //instantiate with 8*8 because only exists this chess format
        ChessPiece[][] mat = new ChessPiece[8][8];
        for(int i = 0; i < 8; i ++){
            for(int j = 0; j < 8; j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }

        return mat;
    }
}
