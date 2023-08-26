package projects;
import java.util.Random;
import java.util.Scanner;

class GuessTheNumberGame {
    private static final int MAX_GUESSES = 10;
    private static final int MAX_NUMBER = 100;

    private int secretNumber;
    private int numOfGuesses;

    public GuessTheNumberGame() {
        Random random = new Random();
        secretNumber = random.nextInt(MAX_NUMBER) + 1;
        numOfGuesses = 0;
    }

    public int takeUserInput() {
        if (numOfGuesses < MAX_GUESSES) {
            System.out.print("Guess the number (1-" + MAX_NUMBER + "): ");
            int userInput = readIntegerInput(1, MAX_NUMBER);
            numOfGuesses++;
            return userInput;
        } else {
            System.out.println("Number of attempts finished...Better luck next time\n");
            return -1;
        }
    }

    public boolean isCorrectGuess(int userInput) {
        if (secretNumber == userInput) {
            System.out.println("Congratulations, you guessed the number " + secretNumber +
                    " in " + numOfGuesses + " guesses");
            int score = calculateScore(numOfGuesses);
            System.out.println("Your score is " + score);
            return true;
        } else if (numOfGuesses < MAX_GUESSES) {
            if (userInput > secretNumber) {
                System.out.println("Too " + (userInput - secretNumber > 10 ? "High" : "Low"));
            } else {
                System.out.println("Little " + (secretNumber - userInput > 10 ? "Low" : "High"));
            }
        }
        return false;
    }

    private int readIntegerInput(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input;

        while (true) {
            try {
                input = sc.nextInt();
                if (input < min || input > max) {
                    System.out.println("Choose the number between " + min + " and " + max);
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Enter only integer value");
                sc.nextLine(); // Consume the invalid input
            }
        }
        return input;
    }

    private int calculateScore(int numOfGuesses) {
        int maxScore = 100;
        int decrement = 10;
        return maxScore - (numOfGuesses - 1) * decrement;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("1. Start the Game \n2. Exit");
        System.out.print("Enter your choice: ");
        int choice = readIntegerInput(1, 2);

        if (choice == 1) {
            int nextRound = 1;
            int noOfRound = 0;

            while (nextRound == 1) {
                GuessTheNumberGame game = new GuessTheNumberGame();
                boolean isMatched = false;
                System.out.println("\nRound " + ++noOfRound + " starts...");

                while (!isMatched) {
                    int userInput = game.takeUserInput();
                    if (userInput == -1) {
                        break;
                    }
                    isMatched = game.isCorrectGuess(userInput);
                }

                System.out.println("1. Next Round \n2. Exit");
                System.out.print("Enter your choice: ");
                nextRound = readIntegerInput(1, 2);
                if (nextRound != 1) {
                    System.exit(0);
                }
            }
        } else {
            System.exit(0);
        }
    }

    private static int readIntegerInput(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input;

        while (true) {
            try {
                input = sc.nextInt();
                if (input < min || input > max) {
                    System.out.println("Invalid choice. Enter " + min + " or " + max + ".");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Enter only integer value");
                sc.nextLine(); // Consume the invalid input
            }
        }
        return input;
    }
}
