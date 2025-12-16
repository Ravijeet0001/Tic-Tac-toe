package models;

import strategy.botStrategy.BotStrategy;
import strategy.botStrategy.BotStrategyFactory;

public class Bot extends Player{

    BotDifficulty botDifficulty;
    BotStrategy strategy;

    public Bot(int id, String name, Symbol s, BotDifficulty botDifficulty) {
        super(id , name, PlayerType.BOT,s);
        this.botDifficulty = botDifficulty;
        this.strategy= BotStrategyFactory.getStrategyBasedOnLevel(botDifficulty);
    }

    public BotDifficulty getBotDifficulty() {
        return botDifficulty;
    }

    public void setBotDifficulty(BotDifficulty botDifficulty) {
        this.botDifficulty = botDifficulty;
    }

    public Move makeMove(Board b){
        Move m= strategy.makeMove(b);
        m.setPlayer(this);
        return m;

    }
}
