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
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author USER
 */
class MakeFile {
     private String fileName;
     private File textFile;
     private StringBuilder out;
     private BufferedReader buffRead;
     private InputStream fis;
    public MakeFile(String fileName){
        this.fileName = fileName;
        
    }
    public void createNewFile() throws FileNotFoundException{
          textFile = new File(fileName);
           fis = new FileInputStream(textFile);
           buffRead = new BufferedReader(new InputStreamReader(fis));
           out = new StringBuilder();
    }
    
    public void readFile(){
        
    }
}
