package com.whitehatgaming;

public class Piece {
    private TYPE type;
    private final TEAM team;
    private Position position;
    private Boolean isAlive;

    public Piece(TYPE type, TEAM team, Position position, Boolean isAlive){
        this.type = type;
        this.team = team;
        this.position = position;
        this.isAlive = isAlive;
    }

    public Piece(TYPE type, TEAM team, Position position){
        this(type, team, position, true);
    }

    public void move(Position nextPosition){
        this.position = nextPosition;
    }

    public void captured(){
        this.isAlive = false;
    }

    public boolean isOpponent(Piece otherPiece){
        return this.team != otherPiece.team;
    }

    public void promote(TYPE nextType){
        this.type = nextType;
    }
}
