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
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author USER
 */
public class MakeTextFile extends MakeFile implements InputInterface {
     private StringBuilder out;
     private BufferedReader buffRead;
     private InputStream fis;
    public MakeTextFile(String fileName) {
        super(fileName);
    }
    @Override
    public void createNewFile(){
        textFile = new File(fileName);
    }
    
     @Override
    public void createInputStream() throws FileNotFoundException{
         
        fis = new FileInputStream(textFile);
        buffRead = new BufferedReader(new InputStreamReader(fis));
        out = new StringBuilder();
    
    }
    
     @Override
    public String OutPutReadLine() throws IOException{
        String nextLine;
         if ( (nextLine =buffRead.readLine()) != null) 
               return nextLine;
         else
             return null;
             
         
    }
    
}
