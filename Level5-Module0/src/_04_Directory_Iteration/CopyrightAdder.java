package _04_Directory_Iteration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CopyrightAdder {
    public static void main(String[] args) {
        File src = new File("src");
        File[] files = src.listFiles();
        if (files != null) {
            for (File f : files) {
                File[] subFile = f.listFiles();
                if (subFile != null) {
                    for (File f2 : subFile) {
                        String fileName = f2.getAbsolutePath();
                        if (fileName.substring(fileName.length() - 5, fileName.length()).equals(".java")) {
                            try {
                                FileWriter fw = new FileWriter(fileName, true);
                                fw.write("\n\n//Copyright © 2019 FirstName LastName");
                                fw.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
        
        // Alternate solution using recursion
        //new DirectoryIterator().addCopyright( "" );
    }
    
    public void addCopyright( String path ) {

        if( path.isEmpty() ) {
            path = "src";
        }
        
        File directory = new File( path );
        File[] files = directory.listFiles();
        
        if( files != null ) {
            for( File eachFile : files ) {
                if( eachFile.isDirectory() ) {
                    addCopyright( eachFile.getAbsolutePath() );
                } else {
                    if( eachFile.getName().endsWith( ".java" ) ) {
                        writeCopyright( eachFile );
                    }
                }
            }
        }
    }
    
    public void writeCopyright( File file ) {
        try {
            FileWriter fWriter = new FileWriter( file, true );
            fWriter.write( "\n// Copyright © 2020 The League of Amazing Programmers" );
            fWriter.close();
        } catch( IOException e ) {
            e.printStackTrace();
        }
    }
}
