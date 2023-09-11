package strategies;

import Models.Board;
import Models.Piece;

public class QueenValidationCheck implements ValidationStrategy{
    public boolean checkIfStepIsValidOrNot(String currentStep, String presentStep, Piece piece, Board board) {
        int curRow = (int) (currentStep.charAt(1) - 48);
        int curCol = (int) (currentStep.charAt(0) - 97);
        int preRow = (int) (presentStep.charAt(1) - 48);
        int preCol = (int) (presentStep.charAt(0) - 97);
        Piece piece1 = board.getCell().get(preRow).get(preCol).getPiece();
        if((piece1!=null)&&(piece1.getPieceColor().equals(piece.getPieceColor())))
            return false;
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
        else if(preRow<curRow&&preCol<curCol)
        {
            int a = curRow;
            int b = curCol;
            while(a>=0&&b>=0)
            {
                if(preRow==a&&preCol==b)
                {
                    return true;
                }
                a--;
                b--;
            }
        }
        else if(preRow<curRow&&preCol>curCol)
        {
            int a = curRow;
            int b = curCol;
            while(a>=0&&b<=7)
            {
                if(preRow==a&&preCol==b)
                {
                    return true;
                }
                a--;
                b++;
            }
        }
        else if(preRow>curRow&&preCol>curCol)
        {
            int a = curRow;
            int b = curCol;
            while(a<=7&&b>=0)
            {
                if(preRow==a&&preCol==b)
                {
                    return true;
                }
                a++;
                b--;
            }
        }
        else if(preRow>curRow&&preCol>curCol)
        {
            int a = curRow;
            int b = curCol;
            while(a<=7&&b<=7)
            {
                if(preRow==a&&preCol==b)
                {
                    return true;
                }
                a++;
                b++;
            }
        }
        return false;

    }
}
