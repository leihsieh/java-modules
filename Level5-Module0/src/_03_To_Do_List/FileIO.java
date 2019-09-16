package _03_To_Do_List;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    private static String baseFileLocation = "src/_03_To_Do_List/";
    
    public static String readFile( String filename ) {
        String message = "";
        
        try {
            String fileLocation = FileIO.baseFileLocation + filename;
            BufferedReader br = new BufferedReader(new FileReader(fileLocation));
            int cnt = 0;
            
            System.out.println( "Opening file: " + fileLocation );
            
            String line = br.readLine();
            while(line != null){
                if( cnt++ != 0 ) {
                    message += "\n";
                }
                message += line;
                line = br.readLine();
            }
            
            br.close();
        } catch (FileNotFoundException e1) {
            message = null;
        } catch (IOException e) {
            message = null;
        }
        
        return message;
    }
    
    public static boolean writeFile( String filename, String message ) {
        boolean writeSuccess = true;
        
        try {
            String fileLocation = FileIO.baseFileLocation + filename;
            FileWriter fw = new FileWriter( fileLocation );
            
            System.out.println( message );
            System.out.println( "Writing message to: " + fileLocation );
            fw.write( message );
            
            fw.close();
        } catch( IOException e ) {
            e.printStackTrace();
            writeSuccess = false;
        }
        
        return writeSuccess;
    }
}