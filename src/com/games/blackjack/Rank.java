package com.games.blackjack;

enum Rank {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    // fields
    private int value;

    // constructor
    Rank(int value) {
        this.value = value;
    }

    // accessors
    public int value() {
        return value;
    }
}