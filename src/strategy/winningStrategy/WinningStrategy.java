package winningStrategy;


import models.Board;
import models.Move;
import models.Player;

public interface WinningStrategy {

    public boolean checkWinner(Move m, Board b);
}
