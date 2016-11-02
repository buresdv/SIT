package insertsort;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.lang.reflect.Field;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by david on 3.11.16.
 */
public class controller implements Initializable {

    @FXML
    public Button exitButton;
    public Button insertButton;
    public Button bubbleButton;
    public Field fieldMax;
    public Field fieldTop;

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

}
