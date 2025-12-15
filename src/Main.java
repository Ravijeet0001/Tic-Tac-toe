import controller.GameController;
import exception.InvalidBotCount;
import models.Game;
import models.GameState;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InvalidBotCount {
        GameController gc = new GameController();

        Game g= gc.StartGame(2,new ArrayList<>(), new ArrayList<>());

        gc.displayBoard(g);

        while(g.getGameState().equals(GameState.INPROGRESS)){
            gc.makeMove(g);
            gc.displayBoard(g);
        }

        if(g.getGameState().equals(GameState.DRAW)){
            System.out.println("Game is Draw!!!!");
        }else if(g.getGameState().equals(GameState.SUCCESS)){
            System.out.println("Game Winner" + g.getWinner().getName());
        }
    }
}
