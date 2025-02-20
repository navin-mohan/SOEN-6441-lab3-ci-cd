public class Main {
    public static void main(String[] args) {
        GuessingGameModel model = new GuessingGameModel();
        GuessingGameController controller = new GuessingGameController(model);
        GuessingGameView view = new GuessingGameView(controller);
        model.addObserver(view);
        view.render(model.getState());
        while (true) {
            view.readInput();
        }
    }
}
