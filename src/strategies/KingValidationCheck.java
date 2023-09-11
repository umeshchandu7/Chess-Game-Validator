package strategies;

import Models.Board;
import Models.Piece;

public class KingValidationCheck implements ValidationStrategy{
    @Override
    public boolean checkIfStepIsValidOrNot(String currentStep, String presentStep, Piece piece, Board board) {
        int curRow = (int) (currentStep.charAt(1) - 48);
        int curCol = (int) (currentStep.charAt(0) - 97);
        int preRow = (int) (presentStep.charAt(1) - 48);
        int preCol = (int) (presentStep.charAt(0) - 97);
        for(int i=-1;i<=1;i++)
        {
            for(int j=-1;j<=1;j++)
            {
                int a = curRow+i;
                int b = curCol+j;
                Piece piece1 = board.getCell().get(a).get(b).getPiece();
                if((a==preRow&&b==preCol))
                {
                    if((piece1!=null)&&(piece.getPieceColor().equals(piece1.getPieceColor())))
                    {
                        return false;
                    }
                    else if((piece1!=null)&&(!piece.getPieceColor().equals(piece1.getPieceColor())))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
