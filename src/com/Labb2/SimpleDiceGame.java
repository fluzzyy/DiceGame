package com.Labb2;
import java.util.*;
public class SimpleDiceGame {

public static int dices;
public static int sides;
public static int guessInput;
public static int numberOfRounds;

    public static ArrayList<Player>initialize()
    {
        ArrayList<Player>playerList = new ArrayList<>();
        Scanner sc = new Scanner ( System.in);


        System.out.println("Välkommen till tärningsspelet!");



        System.out.println("Hur många tärningar ska användas: ");
        dices = sc.nextInt();

        System.out.println("Och hur många sidor ska tärningarna ha: ");
         sides = sc.nextInt();

            sc.nextLine();
        System.out.println("Vill du skapa spelare? J / N + Enter");
        String answer = sc.nextLine();

        while(answer.equalsIgnoreCase("j"))
        {
            System.out.println("Ange spelarens namn: ");
            String playerName = sc.nextLine();
            Player player = new Player(playerName,0);

            for (int i = 0; i < dices ; i++) {
                Die di = new Die(sides);
                player.addDie(di);
            }
            playerList.add(player);

            System.out.println("Skapa en till spelare? J / N + Enter");
            answer = sc.nextLine();
        }
           takeTurn(playerList);

        return playerList;

    }
    private static void takeTurn(ArrayList<Player>players)
    {
        Scanner scanner = new Scanner(System.in);
        while (numberOfRounds < 2)
        {
            for (Player p : players)
            {

                System.out.println(p.getPlayerName() + " " + "Det är din tur att gissa totala summan på dina tärningar: ");
                guessInput = scanner.nextInt();
                System.out.println("Du gissar på: " + guessInput);
                System.out.println("Tryck ENTER för att rulla tärning!");
                scanner.nextLine();
                p.rollDice();
                scanner.nextLine();

                System.out.println("Rullade: " + p.getDieValue());

                if (guessInput == p.getDieValue()) {
                    System.out.println("Du gissade rätt! 1 Poäng tilldelas!");
                    p.increaseScore();
                    System.out.println(p.getPlayerName() + " " + "Dina poäng: " + p.getPlayerScore());
                } else {
                    System.out.println("Tyvärr, du gissade fel..");
                }
                scanner.nextLine();

            }
            numberOfRounds++;
        }
        getWinners(players);
    }

    private static ArrayList<Player> getWinners(ArrayList<Player> players)
    {







        return players;
    }
















}
