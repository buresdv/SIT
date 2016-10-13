package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        public static void main(String a[]) {
            int[] array1 = {50,37,2,157,875,964,804,214};
            int[] array2 = InsertSort(array1);
            for(int i:array2) {
                System.out.print(i);
                System.out.print(", ");
                System.out.println("  //DEBUG: Nacten array");
            }
        }
        public static int[] InsertSort(int[] input) {
            int temp;
            System.out.println("//DEBUG: Zacatek trideni");
            for(int i = 1; i < input.length; i++) {
                for(int j = i ; j > 0 ; j--) {
                    if(input[j] < input[j-1]) {
                        temp = input[j];
                        input[j] = input[j-1];
                        input[j-1] = temp;
                    }
                }
            }
            return input;
        }
    }
    }

}
