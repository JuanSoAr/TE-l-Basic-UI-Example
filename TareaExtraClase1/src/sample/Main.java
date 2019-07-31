package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        VBox parent = new VBox();

        Lector lector = new Lector();
        // de aqui se toma la ruta
        String ruta = "C:/Users/Juan Solis/Desktop/ejemplo.csv";

        Scene scene = new Scene(parent, 700, 500);
        primaryStage.setScene(scene);
        //se manda al metodo para leer
        ArrayList<String> list = lector.leer(ruta);
        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
            Label label1 = new Label(list.get(i));
            parent.getChildren().add(label1);
            //se debe hacer un split para acceder a cada dato
        }

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}

