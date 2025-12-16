package strategy.botStrategy;

import models.Board;
import models.Cell;
import models.CellState;
import models.Move;

import java.util.List;

public class EasyBotStrategy implements BotStrategy{

    @Override
    public Move makeMove(Board b) {
        for(List<Cell> row: b.getBoard()){
            for(Cell cell: row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(cell,null);
                }
            }

        }
        return null;
    }
}
