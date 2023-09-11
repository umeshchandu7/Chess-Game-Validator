import Controller.GameController;
import Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameController gameController = new GameController();
       Board board =  gameController.initaliseBoard(8);

        System.out.println("Enter the player1 name");
        String p1 = sc.next();
        System.out.println("Enter the colour of player1");
        String color = sc.next();
        Player player1 = new Player(p1,color);
        System.out.println("Enter the player2 name");
        String p2 = sc.next();
        System.out.println("Enter the colour of player2");
        String color1 = sc.next();
        Player player2 = new Player(p2,color1);
        List<Player> players = List.of(player1,player2);
        Game game = gameController.getGame(players,board);
        int cnt=0;
        while(game.getGameStatus().equals(GameStatus.GAME_IN_PROGRESS))
        {
            board.diplayBoard(board.getCell());
            gameController.makeMove(players.get(cnt),board);
            cnt++;
            cnt = cnt%2;
        }

    }
}
