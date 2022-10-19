package chess;

import boardgame.Board;
import chess.pieces.Rook;
import chess.pieces.King;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        this.board = new Board(8,8);
        initialSetup();
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

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup(){
        placeNewPiece('b', 6 ,new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.BLACK));
        placeNewPiece('e', 1, new King(board, Color.WHITE));
    }
}
