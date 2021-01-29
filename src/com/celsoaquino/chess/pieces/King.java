package com.celsoaquino.chess.pieces;

import com.celsoaquino.boardgame.Board;
import com.celsoaquino.chess.ChessPiece;
import com.celsoaquino.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
