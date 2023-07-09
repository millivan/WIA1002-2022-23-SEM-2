/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

//Read text1.txt (character separated by comma)
public class ReadText1File {      
    public static void main(String[] args) {       
       String fileName="C:\\Programming\\WIA1002 DS\\Lab 1\\Lab1_Q2\\text1.txt";
       System.out.println("Reading File from text file : " + fileName + "\n");
       try{
          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          String line;
          int counter=0;
         
          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   { 
            System.out.println("Line " + (counter+1) + " is : " + line);            
           // StringTokenizer st = new StringTokenizer(line);

            //Approach 1
           System.out.println("Split by comma using StringTokenizer:"); 
           StringTokenizer st2 = new StringTokenizer(line, ","); 
           int numOfChar = 0;
           while(st2.hasMoreElements()) {
               System.out.println(st2.nextElement());
               numOfChar++;
           }
           
           System.out.println("Number of characters: "+ numOfChar+"\n");
                      
           //Approach 2
           System.out.println("Split by comma using split method:");
           String[] tokens = line.split(",");
           int tokenCount = tokens.length;
           for (int j = 0; j < tokenCount; j++) {
               System.out.println(tokens[j]);
           }
           
           System.out.println("Number of characters : " + tokenCount+"\n");
                    
           counter++;
          }
          bufferReader.close();//Close the buffer reader
        
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       } 
        
    }    
}

