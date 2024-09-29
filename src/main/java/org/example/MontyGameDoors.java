package org.example;

import java.util.ArrayList;
import java.util.Random;

public class MontyGameDoors
{

    private String[] doors;
    private Random random;
    private int[] choices;


    MontyGameDoors()
    {
        random = new Random();
        doors = new String[3];
        choices = new int[3];
    }

    public void setPrices()
    {
        switch (random.nextInt(1,4))
        {
            case 1:
                doors = new String[]{"Машина","Козёл","Козёл"};
                break;
            case 2:
                doors = new String[]{"Козёл","Машина","Козёл"};
                break;
            case 3:
                doors = new String[]{"Козёл","Козёл","Машина"};
                break;
        }
    }

    public boolean game()
    {


        choices[0] = random.nextInt(3);

        do
        {
            choices[1] = random.nextInt(3);
        }while (choices[1] == choices[0] || doors[choices[1]] != "Козёл");

        switch (random.nextInt(2))
        {
            case 0:
                choices[2] = choices[0];
                break;
            case 1:
                for (int i = 1;i <3; i ++)
                {
                    if(i != choices[0] && i != choices[1])
                    {
                        choices[2] = i;
                        break;
                    }
                }

        }


        return doors[choices[2]] == "Машина";

    }

}
