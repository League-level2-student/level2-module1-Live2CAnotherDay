package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	ArrayList<String> gNames = new ArrayList<String>();
	JButton addName = new JButton();
	JButton viewNames = new JButton(); 
	public static void main(String[] args) {
		GuestBook gBook = new GuestBook();
		gBook.setup();
		
		
		
		
	}
	public void setup() {
		
		// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		
		panel.add(addName);
		panel.add(viewNames);
		frame.pack();
		addName.setText("Add your Name");
		
		viewNames.setText("View GuestBook");
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		
		// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
				
		// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
		// all the names added to the list. Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
	}
	@Override
	
	public void actionPerformed(ActionEvent arg0) {
		JButton pressed = (JButton) arg0.getSource();
		
		// TODO Auto-generated method stub
		if (pressed == addName) {
			String input = JOptionPane.showInputDialog("Please enter in your name");
			gNames.add(input);
		}else{
			String list = "";
			for(int i = 0; i < gNames.size(); i++) {
				list += "Guest #" + (i + 1) + ": " + gNames.get(i)+ "\n";
			}
			JOptionPane.showMessageDialog(null, list);
			
		}
	}
	
}
/// Nothing Else to work in here