package insertsort;/**
 * Created by david on 14.10.16.
 */

import insertsort.controller;
import insertsort.InsertSort;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.lang.reflect.Field;
import java.net.URL;
import java.util.ResourceBundle;


public class gui extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.initStyle(StageStyle.UNDECORATED);

        BorderPane mainPane = (BorderPane) FXMLLoader.load(gui.class.getResource("gui.fxml"));

        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("Sorting");
        primaryStage.show();



    }


}
