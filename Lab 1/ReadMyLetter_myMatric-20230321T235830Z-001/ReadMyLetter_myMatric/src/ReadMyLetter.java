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


public class ReadMyLetter {
    public static void main(String[] args) 
    {
       System.out.println("Reading File from Java code");
       //Name of the file
      // String fileName="C:\\Users\\Unaizah\\Documents\\NetBeansProjects\MyLetter\\src\\Unaizah_WXX12345.txt"; //give full url, but only work on windows platform  
       String fileName="C:\\Programming\\WIA1002 DS\\Lab 1\\ReadMyLetter_myMatric-20230321T235830Z-001\\ReadMyLetter_myMatric\\src\\Unaizah_WXX12345.txt"; //file stored at the same level as src folder
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          String line;

          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            System.out.println(line);
          }
          //Close the buffer reader
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }
     }
}

