package readWrite;

import java.util.Scanner;
import java.io.*;

public class Main {

	private static final int SIZE = 10;
	private static Record[] records = new Record[SIZE];
	private static FixedRecord[] fixedRecords = new FixedRecord[SIZE];
	private static File file = new File("files.txt");
	private static int count = -1; // This counts how many records have been written. This is to prevent null
									// pointers.

	public static void main(String[] args) throws IOException {
		int choice;
		Scanner input = new Scanner(System.in);

		readRecord();
		fillFixedRecords();

		System.out.println(fixedRecords[0].getFirstname());
		System.out.println(fixedRecords[1].getFirstname());
		System.out.println(fixedRecords[2].getFirstname());
		System.out.println(fixedRecords[3].getFirstname());
		System.out.println(fixedRecords[4].getFirstname());

		System.out.println("Enter a record number(0-4) you would like to view. Enter a number less than 0 to exit.");

		while ((choice = input.nextInt()) > -1) {
			System.out.println(records[choice]);

			System.out.println("Enter a record number(0-4) you would like to view. Enter a number less than 0 to exit.");
		}
		System.out.println("Bye bye");

	}

	public static void readRecord() throws IOException {

		BufferedReader buffer = new BufferedReader(new FileReader(file)); // wrappnig the filereader in a smarter file
																			// reader so I can read a whole line at a
																			// time

		Record r; // initialize variables needed inside loop
		String s; // This will start as the whole line and will be chopped up from the front,
					// seperated by commas
		String m; // This will be the word that is chopped out.
		int i = 0; // index for storing the record data to Record[] records field.

		while ((s = buffer.readLine()) != null) {
			count++; // If no records are read, count will remain -1.
			r = new Record(); // Point to new Record object for each new record made.

			r.setFirstname(s.substring(0, s.indexOf(',')));
			s = s.substring(s.indexOf(',') + 2, s.length());
			r.setLastname(s.substring(0, s.indexOf(',')));
			s = s.substring(s.indexOf(',') + 2, s.length());
			r.setEmail(s.substring(0, s.indexOf(',')));
			s = s.substring(s.indexOf(',') + 2, s.length());
			r.setIdnumber(Integer.parseInt(s.substring(0, s.indexOf(','))));
			s = s.substring(s.indexOf(',') + 2, s.length());
			r.setColor(s.substring(0, s.indexOf(',')));
			s = s.substring(s.indexOf(',') + 2, s.length());
			r.setBalance(Double.parseDouble(s.substring(0, s.length())));

			records[i++] = r;
		}

		buffer.close(); // closing buffer stream and releasing resources

	}

	public static void fillFixedRecords() {

		for (int i = 0; i < count + 1; i++) {// count is +1 to offset its initial state of -1.

			fixedRecords[i] = new FixedRecord();

			fixedRecords[i].setFirstname(fillSpaces(records[i].getFirstname(), 10));
			fixedRecords[i].setLastname(fillSpaces(records[i].getLastname(), 15));
			fixedRecords[i].setEmail(fillSpaces(records[i].getEmail(), 25));
			fixedRecords[i].setIdnumber(fillSpaces(records[i].getIdnumber() + "", 10));
			fixedRecords[i].setColor(fillSpaces(records[i].getColor(), 10));
			fixedRecords[i].setBalance(fillSpaces(records[i].getBalance() + "", 10));
			// fixedRecords[i].setFill(fill);
		}

	}

	public static char[] fillSpaces(String s, int max) {
		char[] spaces = "***************************".toCharArray();
		char[] temp = s.toCharArray();
		char[] c = new char[max];
		System.arraycopy(temp, 0, c, 0, s.length());
		if (s.length() < max) {
			System.arraycopy(spaces, 0, c, s.length(), max - s.length());
		}
		return c;

	}

}
