/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public TextArea textBox;

    private int secondsPassed = 0;
    private Timer timer ;
    private TimerTask task;
    public BufferedReader buffRead;
    private FileReader in;
    private File textFile;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        textFile = new File("C:/Users/test/Downloads/textFile.txt");
        
        
        try {
            in = new FileReader(textFile);
            buffRead = new BufferedReader(in);
        } catch (FileNotFoundException e) {

        }
        
        
        textBox.setEditable(false);
        textBox.setWrapText(true);
       
        setTimer();
        textBox.setText("Welcome Player!" + "\n");
        System.out.println("Mello");
        //setTimer();
    }

    public void setTimer()  {
       
               timer = new Timer();
          timer.schedule( 
        new TimerTask() {
            @Override
            public void run() {
                try {
                  
                  textBox.setText(buffRead.readLine());// Your database code here
                  //System.out.println(buffRead.readLine());
                } catch (IOException ex) {
                   
                }
            }
        }, 
        2000 
);
         

     System.out.println("Jello");
    }
    
}
       
     
               
        

    



