package Models;

public class Cell {
    private Piece piece;


    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }


    public Cell()
    {

    }
    public void displaycell()
    {
              if(this.piece!=null) {
                  System.out.print("|" + piece.getSymbol() + "|");
              }
              else
              {
                  System.out.print("|__|");
              }

    }
}
