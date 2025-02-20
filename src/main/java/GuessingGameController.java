public class GuessingGameController {

    private GuessingGameModel model;

    public GuessingGameController(GuessingGameModel model) {
        this.model = model;
    }
    public void makeAGuess(int guess) {
        GuessingGameModel.State state = model.getState();
        state.setLastGuess(guess);
        if (guess == state.getNumberToGuess()) {
            state.setScore(state.getScore() + 1);
            state.setLastGuessStatus(GuessingGameModel.LastGuessStatus.CORRECT);
            model.startNewGame();
        } else {
            state.setLastGuessStatus(GuessingGameModel.LastGuessStatus.WRONG);
        }
        model.setState(state);
    }

}
