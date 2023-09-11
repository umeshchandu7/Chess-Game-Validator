package strategies;

import Models.Board;
import Models.Piece;

public class RookValidationCheck implements ValidationStrategy{
    @Override
    public boolean checkIfStepIsValidOrNot(String currentStep, String presentStep, Piece piece, Board board) {
        int curRow = (int) (currentStep.charAt(1) - 48);
        int curCol = (int) (currentStep.charAt(0) - 97);
        int preRow = (int) (presentStep.charAt(1) - 48);
        int preCol = (int) (presentStep.charAt(0) - 97);
        if(curCol==preCol)
        {
            int min = Math.min(preRow,curRow);
            int max = Math.max(preRow,curRow);
            for(int i=min;i<=max;i++)
            {
                if(board.getCell().get(i).get(curCol).getPiece().getPieceColor().equals(piece.getPieceColor()))
                {
                    return false;
                }
            }
        }
        else if(preRow==curRow)
        {
            int min = Math.min(preCol,curCol);
            int max = Math.max(preCol,curCol);
            for(int i=min;i<=max;i++)
            {
                if(board.getCell().get(i).get(curCol).getPiece().getPieceColor().equals(piece.getPieceColor()))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
