package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	
	// james, alexis, kyle, emma
		
		// 1. Save something remarkable about each person in a variable.
		
		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. In a pop-up, tell the user what is remarkable about that person. 
		
		String James = "I like your name, it starts with a j like mine!";
		String Alexis = "You have a cool and unique name.";
		String Kyle = "Your name starts with a K, thats unique.";
		String Emma = "Great name, I had an amazing math teacher called Emma";
		
		String name = JOptionPane.showInputDialog(null, "What is your name?");
		
		if (name.equals("James")) {
			JOptionPane.showMessageDialog(null, James);
		}
	
		else if (name.equals("Alexis")) {
			JOptionPane.showMessageDialog(null, Alexis);
	
		}
		
		else if (name.equals("Kyle")) {
			JOptionPane.showMessageDialog(null, Kyle);
		}
		
		else {
			JOptionPane.showMessageDialog(null, Emma);
		}
	}
}

