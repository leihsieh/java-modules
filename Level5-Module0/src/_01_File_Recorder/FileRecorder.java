package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
    // Create a program that takes a message from the user and saves it to a file.
    public static void main(String[] args) {
        String message = JOptionPane.showInputDialog( "Enter a nice message..." );

        // Write to a file
        try {
            String fileLocation = "src/_01_File_Recorder/YourMessage.txt";
            FileWriter fw = new FileWriter( fileLocation );
            
            System.out.println( "Writing your message to: " + fileLocation );
            fw.write( message );
            
            fw.close();
        } catch( IOException e ) {
            e.printStackTrace();
        }
    }
}