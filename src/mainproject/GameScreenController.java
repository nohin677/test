/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainproject;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class GameScreenController implements Initializable {
    @FXML
    private TextArea textBox;
    
    private int secondsPassed = 0;
    private Timer timer = new Timer();
    private TimerTask task;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Date date = new Date();
        date.setSeconds(0);
        textBox.setEditable(false);
        textBox.setWrapText(true);
        textBox.setText("Welcome Player!"+"\n");
     
       task = new TimerTask() {

            @Override
            public void run() {
               secondsPassed++;
               System.out.println(secondsPassed);
            }
        };
          //setTimer();
        
        if(date.getSeconds()==2){
            textBox.setText("This is a game where player's pick their own journey");
        }
        
         
    } 
    public void setTimer(){
        //timer.scheduleAtFixedRate(task,1000,1000);
    }
    
}
