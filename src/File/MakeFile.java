/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author USER
 */
public abstract class MakeFile {
     public String fileName;
     public File textFile;
    
    public MakeFile(String fileName){
        this.fileName = fileName;
        
    }
    public void createNewFile() throws FileNotFoundException{
          textFile = new File(fileName);
          
    }
    
  
}
