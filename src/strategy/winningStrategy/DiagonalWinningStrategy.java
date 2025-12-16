package winningStrategy;

import models.Board;
import models.Move;
import models.Player;

public class DiagonalWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Move m, Board b) {
        return false;
    }
}
