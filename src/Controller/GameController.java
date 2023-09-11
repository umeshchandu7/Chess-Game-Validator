package Controller;

import Models.Board;
import Models.Game;
import Models.GameStatus;
import Models.Player;
import Services.BoardIntializeService;

import java.util.List;

public class GameController {
   private BoardIntializeService boardIntializeService;
   public GameController()
   {
       this.boardIntializeService = new BoardIntializeService();
   }
   public Board initaliseBoard(int n)
   {
       return boardIntializeService.initializeBoard(n);
   }
   public Game getGame(List<Player> player, Board board)
   {
       Game game = new Game();
       game.setPlayers(player);
       game.setBoard(board);
       game.setGameStatus(GameStatus.GAME_IN_PROGRESS);
       return game;
   }
   public void makeMove(Player player,Board board)
   {
       player.makeMove(board);
   }
}
