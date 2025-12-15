package models;

import java.util.List;

public class Board {
    private int size;

    List<List<Cell>> board;

    public Board(int d){
        this.size=d;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public void printBoard(){
        //todo;
    }
}
