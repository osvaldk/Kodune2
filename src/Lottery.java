import java.util.Random;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args)  {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int numberToGuess = rand.nextInt(100001);
        double money = 0;
        boolean isWon = false;



        System.out.println("Want to win a million dollars?\n" +
                "If so, guess the winning number (a number between 0 and 100000).");

        while (!isWon) {
            System.out.println("Insert $1.00 and enter your number or 'q' to quit:");
            String option = input.nextLine();
            if (option.equals("q")) {
                if (money < 0) {
                    System.out.println("You lost $" + Math.abs(money) + ". Thanks for playing. Come again!");
                } else {
                    System.out.println("Thanks for your interest! Come again!");
                }
                break;
            } else {
                int guess = Integer.parseInt(option);
                if (guess == numberToGuess) {
                    System.out.println("YOU WIN!");
                    isWon = true;
                } else {
                    money--;
                    System.out.println("Sorry, good guess, but not quite right. Do you want me to give you a hint (y|n)?");
                    option = input.nextLine();
                    if (option.equals("y")) {
                        money = money - 2;
                        System.out.println("Insert $2.00 for the hint!");
                        if (guess > numberToGuess) {
                            System.out.println("Your number was too high!");
                        } else {
                            System.out.println("Your number was too low!");
                        }
                    }
                }
            }
        }
    }



















}

