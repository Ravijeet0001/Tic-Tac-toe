package winningStrategy;


import models.Board;
import models.Player;

public interface WinningStrategy {

    public boolean checkWinner(Player P , Board b);
}
