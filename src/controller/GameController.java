package controller;



import models.Game;
import models.Player;
import winningStrategy.WinningStrategy;

import java.util.List;

public class GameController {

    private Game game;

    public void StartGame(int dimension, List<Player> p, List<WinningStrategy> winningStrategies){
        //validate
        //create game object
        //set status

    }
    void displayBoard(){
        game.getBoard().printBoard();
    }

}
