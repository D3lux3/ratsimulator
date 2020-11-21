package game;

import javafx.scene.Scene;
import javafx.stage.Stage;
import menu.Menu;

public class GameLogic {

    private int score;
    private Stage stage;

    public GameLogic(Stage stage) {
        this.score = 0;
        this.stage = stage;
    }

    public void addScore() {
        this.score++;
    }

    public void addScore(int amount) {
        this.score += amount;
    }

    public int getScore() {
        return this.score;
    }

    public void resetScore() {
        this.score = 0;
    }

    public Stage getStage() {
        return this.stage;
    }

    public void changeScene(Scene scene) {
        this.stage.setScene(scene);
    }

}
