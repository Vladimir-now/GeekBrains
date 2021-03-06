package client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("net chat");
        Scene scene = new Scene(root, 350, 375);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest((javafx.event.EventHandler<WindowEvent>) e -> System.exit(0));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
