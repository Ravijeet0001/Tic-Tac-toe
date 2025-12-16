package strategy.botStrategy;

import models.BotDifficulty;

public class BotStrategyFactory {

    public static BotStrategy getStrategyBasedOnLevel(BotDifficulty b) {
        if(b.equals(BotDifficulty.EASY)){
            return new EasyBotStrategy();
        }
        return null;
    }

}
