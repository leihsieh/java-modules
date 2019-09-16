package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
    public static String filename = "SecretMessage.txt";
    
    public static void main(String[] args) {
        String message = JOptionPane.showInputDialog( "Enter a nice message..." );

        String encryptedMessage = encrypt( message );
        writeFile( filename, encryptedMessage );
    }
    
    public static String encrypt( String message ) {
        String encryptedMessage = message;
        
        for( int step = 0; step < 2; step++ ) {
            encryptedMessage = Encryption.encryptMessage( encryptedMessage, step );
        }
        
        return encryptedMessage;
    }
    
    public static boolean writeFile( String filename, String message ) {
        boolean writeSuccess = true;
        
        try {
            String fileLocation = "src/_02_File_Encrypt_Decrypt/" + filename;
            FileWriter fw = new FileWriter( fileLocation );
            
            System.out.println( message );
            System.out.println( "Writing your encrypted message to: " + fileLocation );
            fw.write( message );
            
            fw.close();
        } catch( IOException e ) {
            e.printStackTrace();
            writeSuccess = false;
        }
        
        return writeSuccess;
    }
    
}
