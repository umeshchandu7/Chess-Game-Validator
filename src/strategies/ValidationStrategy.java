package strategies;

import Models.Board;
import Models.Piece;

public interface ValidationStrategy {
    public boolean checkIfStepIsValidOrNot(String curr, String pres, Piece piece, Board board);
}
