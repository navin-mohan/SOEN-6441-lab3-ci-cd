import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class GuessingGameView implements Observer {

    private GuessingGameController controller;

    public GuessingGameView(GuessingGameController controller) {
        this.controller = controller;
    }

    @Override
    public void update(Observable o, Object arg) {
        GuessingGameModel.State state = (GuessingGameModel.State) arg;
        this.render(state);
    }

    public void render(GuessingGameModel.State state) {
        System.out.println("Welcome to Guessing Game!");
        System.out.println("--------------------------");
        System.out.println("Your Score: " + state.getScore());
        System.out.println("Your Last guess: " + state.getLastGuess());

        if (state.getLastGuessStatus() == GuessingGameModel.LastGuessStatus.CORRECT) {
            System.out.println("Congratulations! You guessed the number correctly.");
        } else if (state.getLastGuessStatus() == GuessingGameModel.LastGuessStatus.WRONG) {
            System.out.println("Sorry, your guess was wrong.");
        } else {
            System.out.println("Make your first guess!");
        }
    }

    public void readInput() {
        System.out.print("\n\nPlease enter your guess: ");
        Scanner reader = new Scanner(System.in);
        final int guess = reader.nextInt();
        controller.makeAGuess(guess);
    }
}
