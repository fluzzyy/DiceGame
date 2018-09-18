package com.Labb2;

import java.util.ArrayList;

public class Player
{
    private String playerName;
    private int playerScore;
    private  ArrayList<Die>diceList = new ArrayList<>();



    public Player(String playerName, int playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public void rollDice()  // should be used for the player to roll all his dices in list
    {
        for (Die d:diceList) {
            d.roll();
        }
    }

        public int getDieValue()
        {                                    // sum and return value of all the players dices
            int sum=0;
            for (Die d:diceList) {

                sum += d.getCurrentValue();
            }
            return sum;

        }
        public void increaseScore(){  // increases player score with one

        playerScore++;

        }
        public void addDie(Die di)
        {                            // creates a new dice with sides and adds it to the player?
           diceList.add(di);

        }


}
