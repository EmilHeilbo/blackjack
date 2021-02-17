package server.presentation;

import javafx.application.Application;
import javafx.stage.Stage;

public class Server extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Server");
        stage.show();
    }
}
