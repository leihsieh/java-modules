package _01_IntroToArrayLists;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	JFrame frame = new JFrame("GuestBook");
	JPanel panel = new JPanel();
	JButton addGuest = new JButton("Add Guest");
	JButton viewGuests = new JButton("View Guests");
	ArrayList<String> guests = new ArrayList<>();
	public static void main(String[] args) {
		_02_GuestBook guestBook = new _02_GuestBook();
		guestBook.run();
	}
	
	public void run() {
		addGuest.addActionListener(this);
		viewGuests.addActionListener(this);
		panel.add(addGuest);
		panel.add(viewGuests);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(addGuest)) {
			guests.add(JOptionPane.showInputDialog("Enter a name: "));
		} else if(arg0.getSource().equals(viewGuests)) {
			String message = "";
			for (int i = 0; i < guests.size(); i++) {
				message += "Guest #" + (i+1) + ": " + guests.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, message);
		}
		
	}
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
