package com.whitehatgaming;

import java.lang.String;
import java.io.*;

public class UserInputFile
        extends Object
        implements UserInput {
    public UserInputFile(String fileName) throws FileNotFoundException{

    }

    @Override
    public int[] nextMove() throws IOException {
        return new int[0];
    }
}
