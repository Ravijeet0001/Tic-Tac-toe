package winningStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Player;

public interface WinningStrategy {

    public boolean checkWinner(Player P , Board b);
}
