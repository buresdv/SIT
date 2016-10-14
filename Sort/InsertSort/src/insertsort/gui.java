package insertsort;/**
 * Created by david on 14.10.16.
 */

import insertsort.InsertSort;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


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
