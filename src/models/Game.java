package models;

import TicTacToe.winningStrategy.WinningStrategy;

import java.util.List;

public class Game {

    private Board board;

    private List<Player> players;

    private List<Move> moves;

    private Player winner;

    private int nextPlayerTurn;

    private GameState gameState;

    private List<WinningStrategy> winningStrategies;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
}
