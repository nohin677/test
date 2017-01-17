/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class GameScreenController implements Initializable {

    @FXML
    public Label characterLabel, description;
    @FXML
    public TextArea textBox;
    @FXML
    public TextField characterNameTextField;
    
    public BufferedReader buffRead;
    private FileReader in;
    private File textFile;
    private String nextLine;
    private  Timeline timeline;
    private FileInputStream fis;
    private StringBuilder out;
    private String characterName;
 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        MakeFile newFile = new MakeFile("C:/Users/USER/Documents/limo.txt");
        textFile = new File("C:/Users/USER/Documents/limo.txt");
     
        
        try {
            fis = new FileInputStream(textFile);
            buffRead = new BufferedReader(new InputStreamReader(fis));
            out = new StringBuilder();
        } catch (FileNotFoundException e) {

        }
        
        
        textBox.setEditable(false);
        
       
       
        textBox.setText("Welcome Player!" + "\n");
      
         setTimer();
        //setTimer();
    }

    public void setTimer()  {
         
          Timeline timeline = new Timeline(new KeyFrame(
        Duration.millis(2000),
        ae ->displayGuide()));
       timeline.setCycleCount(6);
        timeline.play();
         

     
    }
    
    public void displayGuide(){
        try {
            if((nextLine = buffRead.readLine()) != null){
            textBox.appendText(nextLine+"\n");
            
            } else{
          
            }
            
        } catch (IOException ex) {
           System.err.print("Error Found");        }
    }
    
    public void EnteredCharacterName(ActionEvent event){
        if(characterNameTextField.getText() != null){
             characterLabel.setText("Your Character Name Can't Be Nothing");
        }else{
        characterName = characterNameTextField.getText();
        characterLabel.setText("Your Character Name is: "+characterName);
        }  
    }
    
    public void warriorDescription(Event eve){
        description.setText("NOOOO");
    }
    
    public void exit(Event l){
        description.setText("e");
    }
    
}
       
     
               
        

    



