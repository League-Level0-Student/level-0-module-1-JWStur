package _05_for_loops._2_badgers;

import javax.swing.JOptionPane;

public class badgers {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 12; j++) {
				JOptionPane.showMessageDialog(null, "badgers");
				
			}
			for (int k = 1; k <= 2; k++) {
				JOptionPane.showMessageDialog(null, "mushroom");
			}
		}
		JOptionPane.showMessageDialog(null, "a snake");
	}	
}
