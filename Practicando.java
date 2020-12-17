/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Ally
 */
public class Practicando extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox v=new VBox(10);
        TextField nombre=new TextField();
        Button saludar=new Button("Ir a la segunda ventana");
        saludar.maxWidth(50);
        v.getChildren().addAll(nombre,saludar);
        Scene sc=new Scene(v,200,200);
        stage.setScene(sc);
        stage.show();
        saludar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                llamarStage2();
            }
        });
    }
    
    public void llamarStage2() {
            Stage stage2=new Stage();
            VBox v=new VBox(10);
            Label hola=new Label("Hola esta es la segunda ventana");
            Scene sc=new Scene(v,200,200);
            v.getChildren().addAll(hola);
            stage2.setScene(sc);
            stage2.show();
        }
    }
    

