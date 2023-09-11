package strategies;

import Models.PieceType;

public class ValidationFactory {
    public static ValidationStrategy checkValidity(PieceType pieceType)
    {
        return switch(pieceType)
        {
               case KING -> new KingValidationCheck();
               case PAWN -> new PawnValidationCheck();
            case ROOK -> new RookValidationCheck();
            case BISHP -> new BishopValidationCheck();
            case QUEEN -> new QueenValidationCheck();
            case KNIGHT -> new KnightValidationCheck();
        };
    }
}
