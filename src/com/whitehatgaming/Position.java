package com.whitehatgaming;

import java.util.*;

public class Position {
    private COLUMN column;
    private ROW row;

    public Position(COLUMN column, ROW row){
        this.column = column;
        this.row = row;
    }

    public List<DIRECTION> getPosition(){
        return Arrays.asList(column, row);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return column == position.column &&
                row == position.row;
    }

    @Override
    public int hashCode() {
        return Objects.hash(column, row);
    }
}
