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
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class ReadMyLetter2 {
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
          
          System.out.println("Before user input. Content in text file only.");
          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            System.out.println(line);
          }
          //Close the buffer reader
          bufferReader.close();
          
          Scanner input = new Scanner(System.in);
          
           System.out.println("\n\nEnter your second part of the letter :\n");
           String strInput = input.nextLine();
           
           //PrintWriter output = new PrintWriter(fileName); // this one overwrites exisiting content
           //output.println(strInput); //write new string input on file
           
           FileWriter outputFile = new FileWriter(fileName, true);
           
           BufferedWriter output = new BufferedWriter(outputFile);
           output.write(strInput);     
           output.close(); 
           

           System.out.println("\n\nAfter user input. String and content in text file.");
           
           FileReader inputFileAfterAppend = new FileReader(fileName);
           BufferedReader bufferReaderAfterAppend = new BufferedReader(inputFileAfterAppend);

           String line2;
           
          // Read file line by line and print on the console
          while ((line2 = bufferReaderAfterAppend.readLine()) != null)   {
            System.out.println(line2);
          }
          
            //Close the buffer reader
          bufferReaderAfterAppend.close();   
          
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }
     }
}

