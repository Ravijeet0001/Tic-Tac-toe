package strategy.winningStrategy;

import models.Board;
import models.Move;
import models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColWinningStrategy implements WinningStrategy{

    Map<Integer, HashMap<Symbol,Integer>> counts = new HashMap<>();
    @Override
    public boolean checkWinner(Move m, Board b) {
        int col = m.getCell().getCol();
        Symbol s = m.getPlayer().getSymbol();

        if(!counts.containsKey(col)) {
            counts.put(col, new HashMap<>());
        }
        HashMap<Symbol,Integer> hs = counts.get(col);
        if(!hs.containsKey(s)) {
            hs.put(s, 0);
        }
        hs.put(s, hs.get(s) + 1);

        return hs.get(s) == b.getSize();
    }

    @Override
    public void handleUndo(Move m, Board b) {
        int col = m.getCell().getCol();
        Symbol s = m.getPlayer().getSymbol();
        Map<Symbol,Integer> colMap = counts.get(col);
        colMap.put(s, colMap.get(s) - 1);
    }
}
