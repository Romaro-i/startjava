package com.startjava.lesson2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Приветствую Вас в игре - \"Угадай число от 0 до 100!\"");

        Player p1 = new Player();
        p1.enterName();

        Player p2 = new Player();
        p2.enterName();

        System.out.println("Mortal Kombat is begin!!! FIGHT!!!");
        System.out.println("У каждого из игроков всего 10 попыток, чтобы угадать загаданное число!!!");

        String playerAnswer = "yes";
        while("yes".equals(playerAnswer)) {
            GuessNumber game = new GuessNumber(p1, p2);
            game.play();

            do {
                System.out.print("Хотите продолжить игру 'Угадай число'? [yes/no]: ");
                playerAnswer = scan.next();
            } while (!"yes".equalsIgnoreCase(playerAnswer) && !"no".equalsIgnoreCase(playerAnswer));
        }
    }
}