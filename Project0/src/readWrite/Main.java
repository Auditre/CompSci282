package readWrite;

import java.util.Scanner;
import java.io.*;


public class Main {

	private static Record[] records = new Record[10];
	private static File file = new File("files.txt");
	
	
	public static void main(String[] args) throws IOException{
		int choice;
		Scanner input = new Scanner(System.in);
		
		readRecord();
		System.out.println("Enter a record number(0-4) you would like to view. Enter -1 to exit.");
//		choice = input.nextInt();
		
		while((choice = input.nextInt()) != -1){
			System.out.println(records[choice]);
			
			System.out.println("Enter a record number(0-4) you would like to view. Enter -1 to exit.");
		}
		System.out.println("Bye bye");

	}
	
	
	public static void readRecord() throws IOException{

		BufferedReader buffer = new BufferedReader(new FileReader(file)); //wrappnig the filereader in a smarter file reader

		Record r; // initialize variables needed inside loop
		String s; 
		int i = 0; //index for storing the record data to Record[] records field.

		while( (s = buffer.readLine()) != null){
			r = new Record(); // Point to new Record object for each new record made.

			r.setFirstname(s.substring(0, s.indexOf(',')));
			s = s.substring(s.indexOf(',')+2, s.length());
			r.setLastname(s.substring(0, s.indexOf(',')));
			s = s.substring(s.indexOf(',')+2, s.length());
			r.setEmail(s.substring(0, s.indexOf(',')));
			s = s.substring(s.indexOf(',')+2, s.length());
			r.setIdnumber(Integer.parseInt(s.substring(0, s.indexOf(','))));
			s = s.substring(s.indexOf(',')+2, s.length());
			r.setColor(s.substring(0, s.indexOf(',')));
			s = s.substring(s.indexOf(',')+2, s.length());
			r.setBalance(Double.parseDouble(s.substring(0, s.length())));


			records[i++] = r;
		}
		
		buffer.close(); //closing buffer stream and releasing resources
		
	}
	
	
}
