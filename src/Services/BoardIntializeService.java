package Services;

import Models.*;

import java.util.ArrayList;
import java.util.List;

public class BoardIntializeService {
    public Board initializeBoard( int n)
    {
        Board board = new Board();
      List<List<Cell>> cells = new ArrayList<>(8);
       for(int i=0;i<n;i++)
       {
           List<Cell> cellRow = new ArrayList<>(8);
           for(int j=0;j<n;j++)
           {
               Cell cell = new Cell();
               cellRow.add(cell);
           }
           cells.add(cellRow);

       }
       board.setCell(cells);
        for(int i=0;i<n;i++)
        {

            for(int j=0;j<n;j++)
            {

                if(i==0||i==1||i==6||i==7)
                {
                    Piece piece = new Piece();
                    String s = "";s+=(char)(j+97);int k = i;
                    s+=k;
                    if(i==1||i==6)
                    {
                        piece.setPieceType(PieceType.PAWN);
                        if(i%2==0)
                        {
                            piece.setSymbol("WP");
                            piece.setPieceColor(PieceColor.WHITE);
                            board.getCell().get(i).get(j).setPiece(piece);
                            board.getMap().put(s,piece);
                        }
                        else
                        {
                            piece.setSymbol("BP");
                            piece.setPieceColor(PieceColor.BLACK);
                            board.getCell().get(i).get(j).setPiece(piece);
                            board.getMap().put(s,piece);
                        }
                    }
                    else if((i==0&&j==0)||(i==0&&j==7)||(i==7&&j==0)||(i==7&&j==7))
                    {

                        piece.setPieceType(PieceType.ROOK);
                        if(i%2==0)
                        {
                            piece.setSymbol("BR");
                            piece.setPieceColor(PieceColor.BLACK);
                            board.getCell().get(i).get(j).setPiece(piece);
                            board.getMap().put(s,piece);
                        }
                        else
                        {
                            piece.setSymbol("WR");
                            piece.setPieceColor(PieceColor.WHITE);
                            board.getCell().get(i).get(j).setPiece(piece);
                            board.getMap().put(s,piece);
                        }
                    }
                    else if((i==0||i==7)&&(j==1||j==6))
                    {

                        piece.setPieceType(PieceType.KNIGHT);
                        if(i%2==0)
                        {
                            piece.setSymbol("BN");
                            piece.setPieceColor(PieceColor.BLACK);
                            board.getCell().get(i).get(j).setPiece(piece);
                            board.getMap().put(s,piece);
                        }
                        else
                        {
                            piece.setSymbol("WN");
                            piece.setPieceColor(PieceColor.WHITE);
                            board.getCell().get(i).get(j).setPiece(piece);
                            board.getMap().put(s,piece);
                        }
                    }
                    else if((i==0||i==7)&&(j==2||j==5))
                    {

                        piece.setPieceType(PieceType.BISHP);
                        if(i%2==0)
                        {
                            piece.setSymbol("BB");
                            piece.setPieceColor(PieceColor.BLACK);
                            board.getCell().get(i).get(j).setPiece(piece);
                            board.getMap().put(s,piece);
                        }
                        else
                        {
                            piece.setSymbol("WB");
                            piece.setPieceColor(PieceColor.WHITE);
                            board.getCell().get(i).get(j).setPiece(piece);
                            board.getMap().put(s,piece);
                        }
                    }
                    else if((i==0||i==7)&&(j==3))
                    {

                        piece.setPieceType(PieceType.QUEEN);
                        if(i%2==0)
                        {
                            piece.setSymbol("BQ");
                            piece.setPieceColor(PieceColor.BLACK);
                            board.getCell().get(i).get(j).setPiece(piece);
                            board.getMap().put(s,piece);
                        }
                        else
                        {
                            piece.setSymbol("WQ");
                            piece.setPieceColor(PieceColor.WHITE);
                            board.getCell().get(i).get(j).setPiece(piece);
                            board.getMap().put(s,piece);
                        }
                    }
                    else if((i==0||i==7)&&(j==4))
                    {

                        piece.setPieceType(PieceType.KING);
                        if(i%2==0)
                        {
                            piece.setSymbol("BK");
//                            System.out.println(i+" "+j);
                            piece.setPieceColor(PieceColor.BLACK);
                            board.getCell().get(i).get(j).setPiece(piece);
                            board.getMap().put(s,piece);
                        }
                        else
                        {
                            piece.setSymbol("WK");
                            piece.setPieceColor(PieceColor.WHITE);
                            board.getCell().get(i).get(j).setPiece(piece);
                            board.getMap().put(s,piece);
                        }
                    }


                }

            }

        }

        return board;
    }
}
