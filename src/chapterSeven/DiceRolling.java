package chapterSeven;

import java.util.Random;

public class DiceRolling {
    public static Random random = new Random();

    public void rollDice(){
        int die1 = 6;
        int die2 = 6;
        int [][] rollDice = new int[die1][die2];
        for (int i = 0; i < die1; i++) {
            for (int j = 0; j < die2; j++) {
                int element = random.nextInt(36);
                if (element == 0) {
                    element++;
                }
                    rollDice[i][j] = element;
            }
        }
    }
}
