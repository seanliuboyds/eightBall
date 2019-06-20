package com.company;

import java.util.Scanner;



import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        while (true) {
            String[] responses = {"It is certain.", "it is decidedly so", "Without a doubt", "Yes definitely", "You may a rely on it", "As I see it, yes", "Most likely.", "Outlook good.", "Yes", "Signs point to yes.", "Reply hazy try again.", "Ask again later.", "Ask again later.", "Better not tell you now", "Cannot predict now.", "Concentrate and ask again", "Don't count on it", "My reply is no.", "My sources say no.", "Outlook not so good", "Very doubtful."};
            Scanner keyboard = new Scanner(System.in);
            int random = (int) (Math.random() * 20 + 1);
            String input = keyboard.nextLine();
            System.out.print("YOU ASKED: " + input + " \n \n");
            if (input != "") {
                System.out.println("MAGIC 8-BALL SAYS: " + responses[random] + "\n \n");
            }
            System.out.println("Do you have another question for the magic 8-Ball? (y/n)");
            Scanner cont = new Scanner(System.in);
            String yn = cont.nextLine();
            if (yn.equalsIgnoreCase("n")) {
                System.out.print("Thank you for playing!");
                System.exit(0);
            } else if (yn.equalsIgnoreCase("y")) {
                System.out.print(" ");
            }
        }
    }
}
