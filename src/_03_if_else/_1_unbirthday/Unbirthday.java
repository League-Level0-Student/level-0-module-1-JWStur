package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		
//		String input = JOptionPane.showInputDialog("Write a message");
//		JOptionPane.showMessageDialog(null, "This is a message");
		
		String birthday = JOptionPane.showInputDialog("When is your birthday?");
		
		
		if(birthday.equals("6/20/2020")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		
		}
		else {
			JOptionPane.showMessageDialog(null, "Merry Unbirthday!");
			
		}
		

		
		
		
		
	}
	
}
