package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color clor) {
		super(board, clor);
		
	}
	@Override
	public String toString() {
		return "R";
	}
}
