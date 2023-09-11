package strategies;

import Models.Board;
import Models.Piece;
import Models.PieceColor;
import Models.PieceType;

public class PawnValidationCheck implements ValidationStrategy{
    @Override
    public boolean checkIfStepIsValidOrNot(String currentStep, String presentStep, Piece piece, Board board) {
        int curRow = (int) (currentStep.charAt(1) - 48);
        int curCol = (int) (currentStep.charAt(0) - 97);
        int preRow = (int) (presentStep.charAt(1) - 48);
        int preCol = (int) (presentStep.charAt(0) - 97);
        Piece piece1 = board.getCell().get(preRow).get(preCol).getPiece();
        if (piece.getPieceColor().equals(PieceColor.BLACK) && (curRow + 1 == preRow)) {
            if (curCol == preCol) {
                if (board.getCell().get(preRow).get(preCol).getPiece() != null) {
                    return false;
                } else {
                    return true;
                }
            } else if (((curCol + 1 == preCol) || (curCol - 1 == preCol)) && piece1 != null && piece1.getPieceColor().equals(PieceColor.WHITE)) {
                return true;
            }
        }
        else if(piece.getPieceColor().equals(PieceColor.WHITE) && (curRow - 1 == preRow)) {
            if (curCol == preCol) {
                if (board.getCell().get(preRow).get(preCol).getPiece() != null) {
                    return false;
                } else {
                    return true;
                }
            } else if (((curCol + 1 == preCol) || (curCol - 1 == preCol)) && piece1 != null && piece1.getPieceColor().equals(PieceColor.BLACK)) {
                return true;
            }
        }
        return false;
    }
}
