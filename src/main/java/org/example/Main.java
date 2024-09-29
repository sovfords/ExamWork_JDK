package org.example;

import java.math.BigDecimal;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int countWin = 0;
        int countFall = 0;

        MontyGameDoors gameDoors = new MontyGameDoors();
        HashMap<Integer,String> gameStat = new HashMap<>();

        for (int i = 1; i <= 1000; i++)
        {
            gameDoors.setPrices();
            if(gameDoors.game())
            {
                gameStat.put(i,"Победа");
                countWin++;
            }
            else
            {
                gameStat.put(i,"Проигрыш");
                countFall++;
            }
        }


        System.out.printf("Число побед: %d \nЧисло поражений: %d",countWin,countFall);


    }
}