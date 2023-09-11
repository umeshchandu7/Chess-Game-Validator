package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Board {
    public List<List<Cell>> getCell() {
        return cell;
    }

    public void setCell(List<List<Cell>> cell) {
        this.cell = cell;
    }

  private   List<List<Cell>> cell;
    private HashMap<String,Piece> map;

    public HashMap<String, Piece> getMap() {
        return map;
    }

    public void setMap(HashMap<String, Piece> map) {
        this.map = map;
    }

    public Board() {
   this.map = new HashMap<>();
    }
    public void diplayBoard(List<List<Cell>> cells)
    {
           for(int i=0;i<8;i++)
           {
               for(int j=0;j<8;j++)
               {
                  cells.get(i).get(j).displaycell();

               }
               System.out.println();
           }

    }
}
