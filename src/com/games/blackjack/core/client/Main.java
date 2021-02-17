package com.games.blackjack.core.client;

import com.apps.util.Prompter;
import com.games.blackjack.core.controller.BlackJack;
import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        BlackJack game = new BlackJack(new Prompter(new Scanner(System.in)));
        try {
            game.start();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}