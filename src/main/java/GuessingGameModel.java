import java.util.Observable;

public class GuessingGameModel extends Observable {

    public enum LastGuessStatus {
        NO_GUESS, CORRECT, WRONG
    }

    public class State {
        private int score;
        private int lastGuess;
        private int numberToGuess;

        private LastGuessStatus lastGuessStatus = LastGuessStatus.NO_GUESS;

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getLastGuess() {
            return lastGuess;
        }

        public void setLastGuess(int lastGuess) {
            this.lastGuess = lastGuess;
        }

        public int getNumberToGuess() {
            return numberToGuess;
        }

        public void setNumberToGuess(int numberToGuess) {
            this.numberToGuess = numberToGuess;
        }

        public void setLastGuessStatus(LastGuessStatus lastGuessStatus) {
            this.lastGuessStatus = lastGuessStatus;
        }

        public LastGuessStatus getLastGuessStatus() {
            return lastGuessStatus;
        }
    }

    private State state;
    public void startNewGame() {
        this.state.setNumberToGuess((int) (Math.random() * 100));
    }

    public GuessingGameModel() {
        this.state = new State();
        this.state.setLastGuess(-1);
        this.state.setScore(0);
        this.startNewGame();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        setChanged();
        notifyObservers(this.state);
    }
}
