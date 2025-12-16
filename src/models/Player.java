package models;

import java.util.Scanner;

public class Player {
    private int id;

    private String name;

    private PlayerType playertype;

    private Symbol symbol;

    Scanner scanner;

    public Player(int id, String name, PlayerType p, Symbol s) {
        this.id = id;
        this.name = name;
        this.playertype = p;
        this.symbol = s;
        this.scanner=new Scanner(System.in);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playertype;
    }

    public void setType(PlayerType type) {
        this.playertype = type;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Move makeMove(Board b){
        System.out.println("please mention row");
        int row=scanner.nextInt();
        System.out.println("please mention col");
        int col=scanner.nextInt();

        return new Move(new Cell(row,col),this);

    }

}
