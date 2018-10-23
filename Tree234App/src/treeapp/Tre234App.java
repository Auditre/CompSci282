
/*
 * Paul Gotcher 10/26/18
 * CS 282 Advanced Data Structures 
 * Manipulation of 234 Tree and B-Tree
 * 
 * This is the main method class that displays the menu in console and interacts with user input. 
 */





package treeapp;

import java.io.*;

public class Tre234App {
	public static void main(String[] args) throws IOException {
		long value;
		Tree234 theTree = new Tree234();
		theTree.insert(50);
		theTree.insert(40);
		theTree.insert(60);
		theTree.insert(30);
		theTree.insert(70);
		while (true) {
			System.out.print("Enter first letter of show, insert, find, or quit: ");
			char choice = getChar();
			switch (choice) {
			case 's':
				theTree.displayTree();
				break;
			case 'i':
				System.out.print("Enter value to insert: ");
				value = getInt();
				theTree.insert(value);
				break;
			case 'f':
				System.out.print("Enter value to find: ");
				value = getInt();
				int found = theTree.find(value);
				if (found != -1)
					System.out.println("Found "+value);
				else
					System.out.println("Could not find "+value);
				break;
			case 'q':
				System.out.println("Exiting. . .");
				System.exit(0);
				break;
			default:
				System.out.print("Invalid entry\n");
			} // end switch
		} // end while
	} // end main()
		// --------------------------------------------------------------

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	// --------------------------------------------------------------
	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

	// -------------------------------------------------------------
	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
	// -------------------------------------------------------------

}
