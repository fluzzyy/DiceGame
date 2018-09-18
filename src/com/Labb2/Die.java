package com.Labb2;

import java.util.Random;

public class Die
{
  private int sidesAmount; // Antalet sidor
    private int currentValue; // Nuvarande värde
    private static Random rollRandom = new Random();



    public void roll()
    {

        currentValue = rollRandom.nextInt(sidesAmount)+1;

    }


    public Die(int sidesAmount)
    {
        this.sidesAmount = sidesAmount;
       roll();
    }




    public int getSidesAmount() {
        return sidesAmount;
    }


    public int getCurrentValue() {
        return currentValue;
    }



}
