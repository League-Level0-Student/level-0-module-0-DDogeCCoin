package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below

	public static void main(String[] args) {
		Random ran = new Random();    //This will be used below to make a random number. 

		// 2. Make a variable that will hold a random whole number
		int thing1 = 0;
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		thing1=ran.nextInt(4);
		// 3. Print your variable to the console
		System.out.println(thing1);
		// 4. Get the user to enter something that they think is awesome
		JOptionPane.showInputDialog(null,"Type something Awesome!!");
		// 5. If your variable is  0
		 if(thing1 == 0) { JOptionPane.showMessageDialog(null,"Thats Awesome!");
		// -- tell the user whatever they entered is awesome!
		 }
		// 6. If your variable is  1
		
			 if(thing1 == 1) { JOptionPane.showMessageDialog(null,"Thats okay...");
		// -- tell the user whatever they entered is ok.
			 }
		// 7. If your variable is  2
			 if(thing1 == 2) { JOptionPane.showMessageDialog(null,"That is boring :yawn:");
		// -- tell the user whatever they entered is boring.
			 }
		// 8. If your variable is  3

		// -- invent your own message to give to the user (be nice).
			 { if(thing1 == 3) { JOptionPane.showMessageDialog(null,"You'll become that one crazy cat neighbor");
			 }
			 }
}
}
			 
	
