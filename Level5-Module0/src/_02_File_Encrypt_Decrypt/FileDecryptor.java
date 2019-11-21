package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.

    public static void main(String[] args) {
        // Uncomment to decrypt the message!
        String encryptedMessage = readFile( FileEncryptor.filename );
        System.out.println( decrypt( encryptedMessage ) );
    }
    
    public static String decrypt( String encryptedMessage ) {
        String decryptedMessage = encryptedMessage;
        
        for( int step = 1; step < 3; step++ ) {
            decryptedMessage = Encryption.encryptMessage( decryptedMessage, step );
        }
        
        return decryptedMessage;
    }
    
    public static String readFile( String filename ) {
        String message = "";
        
        try {
            String fileLocation = "src/_02_File_Encrypt_Decrypt/" + filename;
            BufferedReader br = new BufferedReader(new FileReader(fileLocation));
            
            System.out.println( "Opening file: " + fileLocation );
            
            String line = br.readLine();
            while(line != null){
                message += line;
                line = br.readLine();
            }
            
            br.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return message;
    }
}