package com.company;

public class Player {
    String name;
   private int RoundScore;
   private int totalScore;
   private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore() {
        this.totalScore = this.totalScore + this.RoundScore ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoundScore() {
        return RoundScore;
    }

    public void setRoundScore(int roundScore) {
        RoundScore = roundScore;
    }
}
