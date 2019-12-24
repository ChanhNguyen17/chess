package com.whitehatgaming;

import java.util.*;

public class Board {
    private Map<Position, Piece> pieceMap;

    public Board(){
        this.pieceMap = new HashMap<>();

        Position a1 = new Position(COLUMN.A, ROW.ONE); this.pieceMap.put(a1, new Piece(TYPE.ROCK, TEAM.WHITE, a1));
        Position b1 = new Position(COLUMN.B, ROW.ONE); this.pieceMap.put(b1, new Piece(TYPE.KNIGHT, TEAM.WHITE, b1));
        Position c1 = new Position(COLUMN.C, ROW.ONE); this.pieceMap.put(c1, new Piece(TYPE.BISHOP, TEAM.WHITE, c1));
        Position d1 = new Position(COLUMN.D, ROW.ONE); this.pieceMap.put(d1, new Piece(TYPE.QUEEN, TEAM.WHITE, d1));
        Position e1 = new Position(COLUMN.E, ROW.ONE); this.pieceMap.put(e1, new Piece(TYPE.KING, TEAM.WHITE, e1));
        Position f1 = new Position(COLUMN.F, ROW.ONE); this.pieceMap.put(f1, new Piece(TYPE.BISHOP, TEAM.WHITE, f1));
        Position g1 = new Position(COLUMN.G, ROW.ONE); this.pieceMap.put(g1, new Piece(TYPE.KNIGHT, TEAM.WHITE, g1));
        Position h1 = new Position(COLUMN.H, ROW.ONE); this.pieceMap.put(h1, new Piece(TYPE.ROCK, TEAM.WHITE, h1));

        Position a2 = new Position(COLUMN.A, ROW.TWO); this.pieceMap.put(a2, new Piece(TYPE.PAWN, TEAM.WHITE, a2));
        Position b2 = new Position(COLUMN.B, ROW.TWO); this.pieceMap.put(b2, new Piece(TYPE.PAWN, TEAM.WHITE, b2));
        Position c2 = new Position(COLUMN.C, ROW.TWO); this.pieceMap.put(c2, new Piece(TYPE.PAWN, TEAM.WHITE, c2));
        Position d2 = new Position(COLUMN.D, ROW.TWO); this.pieceMap.put(d2, new Piece(TYPE.PAWN, TEAM.WHITE, d2));
        Position e2 = new Position(COLUMN.E, ROW.TWO); this.pieceMap.put(e2, new Piece(TYPE.PAWN, TEAM.WHITE, e2));
        Position f2 = new Position(COLUMN.F, ROW.TWO); this.pieceMap.put(f2, new Piece(TYPE.PAWN, TEAM.WHITE, f2));
        Position g2 = new Position(COLUMN.G, ROW.TWO); this.pieceMap.put(g2, new Piece(TYPE.PAWN, TEAM.WHITE, g2));
        Position h2 = new Position(COLUMN.H, ROW.TWO); this.pieceMap.put(h2, new Piece(TYPE.PAWN, TEAM.WHITE, h2));

        Position a7 = new Position(COLUMN.A, ROW.SEVEN); this.pieceMap.put(a7, new Piece(TYPE.PAWN, TEAM.BLACK, a7));
        Position b7 = new Position(COLUMN.B, ROW.SEVEN); this.pieceMap.put(b7, new Piece(TYPE.PAWN, TEAM.BLACK, b7));
        Position c7 = new Position(COLUMN.C, ROW.SEVEN); this.pieceMap.put(c7, new Piece(TYPE.PAWN, TEAM.BLACK, c7));
        Position d7 = new Position(COLUMN.D, ROW.SEVEN); this.pieceMap.put(d7, new Piece(TYPE.PAWN, TEAM.BLACK, d7));
        Position e7 = new Position(COLUMN.E, ROW.SEVEN); this.pieceMap.put(e7, new Piece(TYPE.PAWN, TEAM.BLACK, e7));
        Position f7 = new Position(COLUMN.F, ROW.SEVEN); this.pieceMap.put(f7, new Piece(TYPE.PAWN, TEAM.BLACK, f7));
        Position g7 = new Position(COLUMN.G, ROW.SEVEN); this.pieceMap.put(g7, new Piece(TYPE.PAWN, TEAM.BLACK, g7));
        Position h7 = new Position(COLUMN.H, ROW.SEVEN); this.pieceMap.put(h7, new Piece(TYPE.PAWN, TEAM.BLACK, h7));

        Position a8 = new Position(COLUMN.A, ROW.EIGHT); this.pieceMap.put(a8, new Piece(TYPE.ROCK, TEAM.BLACK, a8));
        Position b8 = new Position(COLUMN.B, ROW.EIGHT); this.pieceMap.put(b8, new Piece(TYPE.KNIGHT, TEAM.BLACK, b8));
        Position c8 = new Position(COLUMN.C, ROW.EIGHT); this.pieceMap.put(c8, new Piece(TYPE.BISHOP, TEAM.BLACK, c8));
        Position d8 = new Position(COLUMN.D, ROW.EIGHT); this.pieceMap.put(d8, new Piece(TYPE.QUEEN, TEAM.BLACK, d8));
        Position e8 = new Position(COLUMN.E, ROW.EIGHT); this.pieceMap.put(e8, new Piece(TYPE.KING, TEAM.BLACK, e8));
        Position f8 = new Position(COLUMN.F, ROW.EIGHT); this.pieceMap.put(f8, new Piece(TYPE.BISHOP, TEAM.BLACK, f8));
        Position g8 = new Position(COLUMN.G, ROW.EIGHT); this.pieceMap.put(g8, new Piece(TYPE.KNIGHT, TEAM.BLACK, g8));
        Position h8 = new Position(COLUMN.H, ROW.EIGHT); this.pieceMap.put(h8, new Piece(TYPE.ROCK, TEAM.BLACK, h8));
    }

    public boolean move(Position currentPosition, Position nextPosition){
        Piece currentPiece = this.pieceMap.get(currentPosition);
        Piece capturedPiece = this.pieceMap.get(nextPosition);

        if(!currentPiece.isOpponent(capturedPiece)){ return false; }

        currentPiece.move(nextPosition);
        this.pieceMap.put(nextPosition, currentPiece);
        return true;
    }
}
