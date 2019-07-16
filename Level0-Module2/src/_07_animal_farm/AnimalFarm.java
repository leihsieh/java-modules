//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _07_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
   	 /*
   	  * 1. Ask the user which animal they want, then play the sound of that animal.
   	  */

   	 /* 2. Make it so that the user can keep entering new animals. */
   	 for (int i = 0; i < 10; i++) {
   		 String animal = JOptionPane.showInputDialog("What animal sound do you want to hear? Cow, Duck or Dog?");

   		 if (animal.equals("Cow")) {
   			 playMoo();
   		 } else if (animal.equals("Duck")) {
   			 playQuack();
   		 } else if (animal.equals("Dog")) {
   			 playWoof();
   		 } else {
   			 JOptionPane.showMessageDialog(null, "Have the right animal?");
   		 }
   	 }
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
