package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
String input9 = JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
if (input9.equals ("yes")) 
		{ JOptionPane.showMessageDialog(null,"you will rule the world");
		}
	else { JOptionPane.showMessageDialog(null,"Go sign up for the classes at The Leauge of Amazing Programers");
	}
		// 3. Otherwise, tell them to sign up for classes at The League.
	
	}


}