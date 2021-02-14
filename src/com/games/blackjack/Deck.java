package com.games.blackjack;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Deck {
    private Set<Card> cards = Arrays.stream(Card.values()).collect(Collectors.toSet());
}