package com.rs.tools.dropEditor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NPCDropsEditor extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Npc Drops Editor V1.0");
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("./Editor.fxml"));
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        DropEditorController controller = fxmlLoader.getController();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.getScene().getWindow().setOnCloseRequest((e) -> controller.doClose());
        controller.init();
        primaryStage.show();
    }
}
