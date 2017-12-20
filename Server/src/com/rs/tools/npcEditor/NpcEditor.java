package com.rs.tools.npcEditor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Peng on 11.2.2017 21:12.
 */
public class NpcEditor extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Npc editor V0.1");
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("./Editor.fxml"));
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        NpcEditorController controller = fxmlLoader.getController();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.getScene().getWindow().setOnCloseRequest((e) -> controller.doClose());
        controller.init();
        primaryStage.show();
    }

}
