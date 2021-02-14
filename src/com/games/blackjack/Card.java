package com.games.blackjack;

enum Card {
    ACE_SPADES   (Rank.ACE,   Suit.SPADES),
    TWO_SPADES   (Rank.TWO,   Suit.SPADES),
    THREE_SPADES (Rank.THREE, Suit.SPADES);

    // fields
    private Rank rank;
    private Suit suit;

    // constructor
    Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // accessors - read-only
    public Rank rank() {
        return rank;
    }

    public Suit suit() {
        return suit;
    }

    public int value() {
        return rank.value();
    }
}