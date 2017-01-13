/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainproject;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author test
 */
public class MakingGame {
    private boolean closeScreen = false;
    public void makeNewScreen(Event event){
        try {
            Stage primaryStage = (Stage)((Node)event.)
            Parent root = FXMLLoader.load(getClass().getResource("gameScreen"));
            Scene scene = new Scene(root);
            primaryStage.setResizable(false);
            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(MakingGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

