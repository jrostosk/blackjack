package com.games.blackjack;

public enum Card {
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

    public static enum Rank {
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

    public static enum Suit {
        HEARTS,
        DIAMONDS,
        CLUBS,
        SPADES
    }
}