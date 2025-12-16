package controller;



import exception.InvalidBotCount;
import models.Game;
import models.GameState;
import models.Player;
import strategy.winningStrategy.WinningStrategy;

import java.util.List;

public class GameController {


    public Game StartGame(int dimension, List<Player> p, List<WinningStrategy> winningStrategies) throws InvalidBotCount {

        Game game = Game.getInstanceBuilder()
                .setDimension(dimension)
                .setPlayers(p)
                .setWinningStrategies(winningStrategies)
                .build();

        return game;

        //validate
        //create game object
        //set status

    }
    public void displayBoard(Game game){
        game.getBoard().printBoard();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public GameState checkState(Game g){
        return g.getGameState();
    }

    public Player getWinner(Game g){
        return g.getWinner();
    }

    public void undo(Game g){
        g.undo();
    }



}
