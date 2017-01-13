/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainproject;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class MainScreenController implements Initializable {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private ImageView mainBackground;
    @FXML
    private ImageView secondImage;
    @FXML
    private ImageView mainTitle;
    @FXML
    private MediaView mv;
    private MediaPlayer mp;
    private Media me;
    @FXML private javafx.scene.control.Button closeButton;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
             
              String path = new File("C:/Users/test/Downloads/song.mp3").getAbsolutePath();
              me = new Media(new File(path).toURI().toString());
              mp = new MediaPlayer(me);
              mv.setMediaPlayer(mp);
              mp.setAutoPlay(true); 
    }
public void startButton(ActionEvent event){
       Stage stage = (Stage) closeButton.getScene().getWindow();
       stage.close();
       mp.dispose();
       MakingGame newGame = new MakingGame();
       newGame.makeNewScreen();
    }

    
}
