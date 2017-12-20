package com.rs.tools.mapEditor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Peng on 16.10.2016.
 */
public class MapEditor extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Map Editor V0.1");
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("./Editor.fxml"));
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        MapEditorController controller = fxmlLoader.getController();
        primaryStage.setScene(new Scene(root, 600.0D, 400.0D));
        primaryStage.show();
        primaryStage.getScene().getWindow().setOnCloseRequest((e) -> controller.doClose());
        controller.init();
        primaryStage.show();
    }
}
