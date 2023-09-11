package Models;

import exceptions.ExitGameException;
import strategies.ValidationFactory;
import strategies.ValidationStrategy;

import java.util.Scanner;

public class Player {
    private String name;
    private String color;
    Scanner scanner;

    public Player(String name, String color) {
        this.name = name;
        this.color = color;
        this.scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public void makeMove(Board board)
    {
        System.out.println(this.getName()+"enter from position");
            String currentStep = scanner.next();
            if(currentStep.equals("NEXT"))
            {
                throw new ExitGameException("game exit");
            }
            Piece piece = board.getMap().get(currentStep);
        System.out.println(this.getName()+"enter to position");
            String presentStep = scanner.next();
        ValidationStrategy validationStrategy = ValidationFactory.checkValidity(piece.getPieceType());
          while(!validationStrategy.checkIfStepIsValidOrNot(currentStep,presentStep,piece,board))
          {
              System.out.println("INVALID MOVE");
              System.out.println(this.getName()+" "+"ENTER FROM MOVE");
              currentStep = scanner.next();
              System.out.println(this.getName()+" "+"ENTER TO MOVE");
              presentStep = scanner.next();
          }
            int curRow = (int)(currentStep.charAt(1)-48);
            int curCol = (int)(currentStep.charAt(0)-97);
            int preRow = (int)(presentStep.charAt(1)-48);
            int preCol = (int)(presentStep.charAt(0)-97);
            board.getCell().get(curRow).get(curCol).setPiece(null);
            if(board.getCell().get(preRow).get(preCol).getPiece()!=null)
            {
                Piece piece1 = board.getCell().get(preRow).get(preCol).getPiece();
                board.getMap().remove(piece1);
            }
            board.getMap().put(presentStep,piece);
            board.getCell().get(preRow).get(preCol).setPiece(piece);
    }
}
