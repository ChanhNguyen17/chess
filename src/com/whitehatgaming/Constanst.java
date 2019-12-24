package com.whitehatgaming;

enum TYPE { KING, QUEEN, ROCK, BISHOP, KNIGHT, PAWN }

enum TEAM { WHITE, BLACK }

interface DIRECTION {}

enum COLUMN implements DIRECTION { A, B, C, D, E, F, G, H }

enum ROW implements DIRECTION { ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT }
