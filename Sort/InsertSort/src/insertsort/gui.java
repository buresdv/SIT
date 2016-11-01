package insertsort;/**
 * Created by david on 14.10.16.
 */

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


public class gui extends Application implements Initializable {

    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    private Button exitButton;
    private Button insertButton;
    private Button bubbleButton;
    private Field fieldMax;
    private Field fieldTop;

    @Override
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert exitButton != null : "fx:id=\"exitButton\" nebylo vlozeno, zkontroluj FXML soubor 'gui.fxml'.";

        //Tady pokračovat, všechno odtud dolů bylo z XML vloženo

        exitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });

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
