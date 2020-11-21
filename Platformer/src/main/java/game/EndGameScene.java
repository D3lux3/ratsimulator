package game;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import menu.Menu;
import menu.ui.PlatformerButton;
import menu.ui.PlatformerLabel;

public class EndGameScene {

    private GameLogic gameLogic;
    private Stage stage;

    public EndGameScene(GameLogic gameLogic, Stage stage) {
        this.gameLogic = gameLogic;
        this.stage = stage;
    }


    public Scene getEndGameScene(int score) {
        BorderPane borderPane = new BorderPane();
        borderPane.setPrefSize(500, 500);
        PlatformerButton button = new PlatformerButton("Submit");
        TextField textField = new TextField();
        textField.setPromptText("Name:");
        PlatformerLabel label = new PlatformerLabel("Enter name" );

        button.setOnMouseClicked((event -> {
            System.out.println(textField.getText() + " Score: " + score);
            backToMain();
        }));

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(label,textField, button);
        borderPane.setCenter(vbox);
        Scene scene = new Scene(borderPane);


        //Reset gamescore after ending game.
        this.gameLogic.resetScore();

        return scene;
    }

    private void backToMain() {
        stage.setScene(new Menu(stage, this.gameLogic).getMenuScene());
    }

}
