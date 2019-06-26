package _10_cuteness_tv;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.*;
public class CutenessTV implements ActionListener{
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
	button1 = new JButton("video 1");
	panel.add(button1);
	button2 = new JButton("video 2");
	panel.add(button2);
	button3 = new JButton("video 3");
	panel.add(button3);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button1) {
		showDucks();
	}	
	if(e.getSource()==button2) {
		showFrog();
	}
	if(e.getSource()==button3) {
		showFluffyUnicorns();
	}
	
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
}
