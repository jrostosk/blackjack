package com.games.blackjack.controller;

import com.apps.util.Prompter;
import com.games.blackjack.domain.Dealer;
import com.games.blackjack.domain.Player;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BlackJack {
    private Prompter prompter;
    private Dealer dealer;
    private List<Player> players;
    private String username;

    public BlackJack(Prompter prompter) {
        this.prompter = prompter;
    }

    public void start() throws IOException {
        initialize();
        welcome();
        promptForUsername();
        gameOver();
    }

    private void gameOver() {
        prompter.info("Thanks for playing, " + username + "!");
    }

    private void promptForUsername() {
        String username = prompter.prompt("Please enter your name: ");
        this.username = username;
    }

    private void initialize() {
        dealer = new Dealer();
        players = new ArrayList<>();
    }

    private void welcome() throws IOException {
        String banner = Files.readString(Path.of("resources/banner.txt"));
        prompter.info(banner + "\n\n");
    }
}