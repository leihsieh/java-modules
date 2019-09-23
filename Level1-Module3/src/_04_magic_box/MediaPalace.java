package _04_magic_box;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;

import javazoom.jl.player.advanced.AdvancedPlayer;

public class MediaPalace {

    // This method loads an image onto a JLabel and checks for the image in the following order:
    // 1) within the package, 2) on the hard drive, 3) on the Internet (URL).
    // The input parameter is either a URL, location on the hard drive, or a location in the package
    //   Example of a URL: https://www.oracle.com/a/ocom/img/hp11-intl-java-logo.jpg
    //   Example of a location in the package: "hp11-intl-java-logo.jpg"
    //   Example of a location in the hard drive: "/Users/leaguestudent/Desktop/hp11-intl-java-logo.jpg"
	public JLabel loadImage(String imageLocationOrURL) {
        URL url = null;
        Icon icon = null;
        JLabel labelWithImage = null;

        // 1. Try to load image from within the project
        url = getClass().getResource(imageLocationOrURL);
        
        if(url != null) {
            icon = new ImageIcon(url);
            labelWithImage = new JLabel(icon);
        } else {
            
            // 2. Try and load image from the hard drive
            icon = new ImageIcon(imageLocationOrURL);
            
            if(icon.getIconHeight() != -1 && icon.getIconWidth() != -1) {
                labelWithImage = new JLabel(icon);
            } else { 
                
                // 3. Try and load image from the Internet
                try {
                    url = new URL(imageLocationOrURL);
                    icon = new ImageIcon(url);
                    labelWithImage = new JLabel(icon);
                } catch( MalformedURLException e ) {
                    e.printStackTrace();
                }
            }
        }
        
        return labelWithImage;
	}

    void speak(String words) {
        try {
            Runtime.getRuntime().exec("say " + words).waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	// Use this method to play sound files with ".wav" at the end of the file name.
	// Download .wav sound files at freesound.org
	// freesound.org username: leagueofamazing password: code4life
	public AudioClip playWavSoundFile(String fileName) {
	    URL url = getClass().getResource(fileName);
		AudioClip audio = JApplet.newAudioClip(url);
		
		audio.play();
		
		return audio;
	}
	
	// Use this class to play sound files with a ".mp3" at the end of the file name.
	public void playMp3SoundFile(String fileName, int durationSeconds) {
	    Song song = new Song(fileName);
	    song.setDuration( durationSeconds );
	    song.play();
	}

	class Song {
	    private int duration;
	    private String songAddress;
	    private AdvancedPlayer mp3Player;
	    private InputStream songStream;

	    /**
	     * Songs can be constructed from files on your computer or Internet
	     * addresses.
	     * 
	     * Examples: <code> 
	     *      new Song("everywhere.mp3");     //from default package 
	     *      new Song("/Users/joonspoon/music/Vampire Weekend - Modern Vampires of the City/03 Step.mp3"); 
	     *      new Song("http://freedownloads.last.fm/download/569264057/Get%2BGot.mp3"); 
	     * </code>
	     */
	    public Song(String songAddress) {
	        this.songAddress = songAddress;
	    }

	    public void play() {
	        loadFile();
	        if (songStream != null) {
	            loadPlayer();
	            startSong();
	        } else
	            System.err.println("Unable to load file: " + songAddress);
	    }

	    public void setDuration(int seconds) {
	        this.duration = seconds * 100;
	    }

	    public void stop() {
	        if (mp3Player != null)
	            mp3Player.close();
	    }

	    private void startSong() {
	        Thread t = new Thread() {
	            public void run() {
	                try {
	                    if (duration > 0)
	                        mp3Player.play(duration);
	                    else
	                        mp3Player.play();
	                } catch (Exception e) {
	                }
	            }
	        };
	        t.start();
	    }

	    private void loadPlayer() {
	        try {
	            this.mp3Player = new AdvancedPlayer(songStream);
	        } catch (Exception e) {
	        }
	    }

	    private void loadFile() {
	        if (songAddress.contains("http"))
	            this.songStream = loadStreamFromInternet();
	        else
	            this.songStream = loadStreamFromComputer();
	    }

	    private InputStream loadStreamFromInternet() {
	        try {
	            return new URL(songAddress).openStream();
	        } catch (Exception e) {
	            return null;
	        }
	    }

	    private InputStream loadStreamFromComputer() {
	        try {
	            return new FileInputStream(songAddress);
	        } catch (FileNotFoundException e) {
	            return this.getClass().getResourceAsStream(songAddress);
	        }
	    }
	}
}