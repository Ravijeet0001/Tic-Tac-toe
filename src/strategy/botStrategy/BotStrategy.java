package strategy.botStrategy;

import models.Board;
import models.Move;

public interface BotStrategy {

    public Move makeMove(Board b);
}
