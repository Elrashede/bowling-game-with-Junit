package com.example.bowling.dto;

public class Player  {
    private String name;
    private int score;
    private boolean isPerfectGame;

    public Player(String name, int score, boolean isPerfectGame) {
        this.name = name;
        this.score = score;
        this.isPerfectGame = isPerfectGame;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public boolean isPerfectGame() {
        return isPerfectGame;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setPerfectGame(boolean perfectGame) {
        isPerfectGame = perfectGame;
    }

    public Player() {}

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", isPerfectGame=" + isPerfectGame +
                '}';
    }


};
