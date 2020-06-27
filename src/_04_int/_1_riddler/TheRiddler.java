package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog(null, "Who makes it, has no need of it.\r\n" + 
				"Who buys it, has no use for it.\r\n" + 
				"Who uses it can neither see nor feel it.\r\n" + 
				"What is it? ");
		if (answer.equals("a coffin")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
			
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Incorrect, the answer is a coffin");
		}
		
		answer = JOptionPane.showInputDialog(null,"What is greater than God,\r\n" + 
				"more evil than the devil,\r\n" + 
				"the poor have it,\r\n" + 
				"the rich need it,\r\n" + 
				"and if you eat it, you'll die?");
		if (answer.equals("nothing")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Incorrect, the answere is nothing");
		}
		
		JOptionPane.showMessageDialog(null, "You scored " + score + " out of 2");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

