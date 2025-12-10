package winningStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Player;

public class RowWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Player P, Board b) {
        return false;
    }
}
