package strategies;

import Models.Board;
import Models.Piece;

public class BishopValidationCheck implements ValidationStrategy{
    @Override
    public boolean checkIfStepIsValidOrNot(String currentStep, String presentStep, Piece piece, Board board) {
        int curRow = (int) (currentStep.charAt(1) - 48);
        int curCol = (int) (currentStep.charAt(0) - 97);
        int preRow = (int) (presentStep.charAt(1) - 48);
        int preCol = (int) (presentStep.charAt(0) - 97);

        if(preRow<curRow&&preCol<curCol)
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
