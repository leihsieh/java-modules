package _09_sound_effects_machine;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SoundEffectsMachine implements ActionListener{
	JButton button1;
	JButton button2;
	JButton button3;
	public void create() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(150, 120);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("sound effect 1");
		panel.add(button1);
		button2 = new JButton("sound effect 2");
		panel.add(button2);
		button3 = new JButton("sound effect 3");
		panel.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//students would use different sound effects for each button
		if(e.getSource()==button1) {
			playSound("sawing-wood-daniel_simon.wav");
		}	
		if(e.getSource()==button2) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		if(e.getSource()==button3) {
			playSound("sawing-wood-daniel_simon.wav");
		}
	}
	private void playSound(String fileName) {
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	    sound.play();
	}
}
