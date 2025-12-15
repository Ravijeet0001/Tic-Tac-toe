package models;



import exception.InvalidBotCount;
import winningStrategy.WinningStrategy;


import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;

    private List<Player> players;

    private List<Move> moves;

    private Player winner;

    private int nextPlayerTurn;

    private GameState gameState;

    private List<WinningStrategy> winningStrategies;

    private Game(int dimension, List<Player> players, List<WinningStrategy> ws){
        this.board=new Board(dimension);
        this.players=players;
        this.nextPlayerTurn=0;
        this.winningStrategies =ws;
        this.gameState=GameState.INPROGRESS;
        this.winner=null;
        this.moves=new ArrayList<>();
    }

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

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public static Builder getInstanceBuilder(){
        return new Builder();
    }

    public static class Builder{

        private List<Player> players;

        private int dimension;

        private List<WinningStrategy> winningStrategies;

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public int getDimension() {
            return dimension;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public List<WinningStrategy> getWinningStrategies() {
            return winningStrategies;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
        public void validate() throws InvalidBotCount {
            int botCount=0;
            for(Player p : players){
                if(p.getPlayerType().equals(PlayerType.BOT)){
                    botCount+=1;
                }
            }
            if(botCount>1){
                throw new InvalidBotCount();
            }
            if(players.size()!=dimension-1){
                throw new IllegalArgumentException();
            }
            //TODO: SYMBOL VALIDATION
        }

        public Game build() throws InvalidBotCount{
            validate();
            return new Game(this.dimension,this.players,this.winningStrategies);
        }
    }
}
