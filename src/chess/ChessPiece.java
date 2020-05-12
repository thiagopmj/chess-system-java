/**
 * 
 */
package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

	private Color clor;

	public ChessPiece(Board board, Color clor) {
		super(board);
		this.clor = clor;
	}

	public Color getClor() {
		return clor;
	}

}
