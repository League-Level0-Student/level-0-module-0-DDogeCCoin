package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER

		// 2.  Ask the user a question 
		String input10 = JOptionPane.showInputDialog(null,"What is the Yo form of The spanish verb, estar?");
		// 3.  Use an if statement to check if their answer is correct
		if (input10.equals ("estoy")) 
		{ JOptionPane.showMessageDialog(null,"Correct. +50 points");
		score +=50;
		}
		else { JOptionPane.showMessageDialog(null,"No the answer is estoy.");
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
		// Option: Subtract a point from their score for a wrong answer
		String input11 = JOptionPane.showInputDialog(null,"what are the first 6 digits of Pi? (add the decimal)");
		if (input11.equals (3.14159))
		{ JOptionPane.showMessageDialog(null,"Correct. +50 points");
		score +=50;
		}
		else { JOptionPane.showMessageDialog(null,"No the answer is 3.14159.");
		}
		
		// After all the questions have been asked, tell the user their final score 
	
	JOptionPane.showMessageDialog(null,"You have won "+score+" points!");
		
	}
}
