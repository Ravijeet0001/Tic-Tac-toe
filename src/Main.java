import controller.GameController;
import exception.InvalidBotCount;
import models.*;
import strategy.winningStrategy.ColWinningStrategy;
import strategy.winningStrategy.DiagonalWinningStrategy;
import strategy.winningStrategy.RowWinningStrategy;
import strategy.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidBotCount {

        Scanner sc=new Scanner(System.in);
        GameController gc = new GameController();

        try{
            int dimension=3;

            List<Player> p= new ArrayList<>();
            p.add(new Player(1,"Ravi", PlayerType.Human,new Symbol('X')));
            p.add(new Bot(1,"Bot",new Symbol('O'),BotDifficulty.EASY));

            List<WinningStrategy> ws= List.of(
                    new ColWinningStrategy(),
                    new RowWinningStrategy(),
                    new DiagonalWinningStrategy()
            );

            Game g= gc.StartGame(dimension,p,ws);
            gc.displayBoard(g);

            while(g.getGameState().equals(GameState.INPROGRESS)){
                gc.makeMove(g);
                System.out.println("want to undo press 1");
                int undoAnswer=sc.nextInt();
                if(undoAnswer == 1){
                    System.out.println("undoing....");
                    gc.undo(g);
                }


                gc.displayBoard(g);
            }

            if(g.getGameState().equals(GameState.DRAW)){
                System.out.println("Game is Draw!!!!");
            }else if(g.getGameState().equals(GameState.SUCCESS)){
                System.out.println("Game Winner " + g.getWinner().getName());
            }

        }catch(Exception e){
            throw e;
        }

    }
}
