package strategies;

import Models.Board;
import Models.Piece;

public class KnightValidationCheck implements ValidationStrategy{
    @Override
    public boolean checkIfStepIsValidOrNot(String currentStep, String presentStep, Piece piece, Board board) {
        int curRow = (int) (currentStep.charAt(1) - 48);
        int curCol = (int) (currentStep.charAt(0) - 97);
        int preRow = (int) (presentStep.charAt(1) - 48);
        int preCol = (int) (presentStep.charAt(0) - 97);
        Piece piece1 = board.getCell().get(preRow).get(preCol).getPiece();
        if((preRow==curRow-2)&&(preCol==curCol+1))
        {
            if((piece1!=null)&&(piece1.getPieceColor().equals(piece.getPieceColor())))
            {
                return false;
            }
        }
        else if((preRow==curRow-2)&&(preCol==curCol-1))
        {
            if((piece1!=null)&&(piece1.getPieceColor().equals(piece.getPieceColor())))
            {
                return false;
            }
        }
        else if((preRow==curRow+2)&&(preCol==curCol-1))
        {
            if((piece1!=null)&&(piece1.getPieceColor().equals(piece.getPieceColor())))
            {
                return false;
            }
        }
        else if((preRow==curRow+2)&&(preCol==curCol+1))
        {
            if((piece1!=null)&&(piece1.getPieceColor().equals(piece.getPieceColor())))
            {
                return false;
            }
        }
        else {
            return false;
        }

       return true;
    }
}
