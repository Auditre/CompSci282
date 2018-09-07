package readWrite;

public class Record {

	String firstname, lastname, email, color;
	int idnumber;
	double balance;
	
	// CONSTRUCTOR DEFAULT
	public Record(){
		firstname = "";
		lastname = "";
		email = "";
		idnumber = 0;
		color = "";
		balance = 0.0;
		
	}
	
	//CONSTRUCTOR WITH PARAM
	public Record(String first, String last, String e, int id, String c, double bal){
		this.firstname = first;
		this.lastname = last;
		this.email = e;
		this.idnumber = id;
		this.color = c;
		this.balance = bal;
	}
	
	//GETTERS AND SETTERS

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(int idnumber) {
		this.idnumber = idnumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//PRINT
	public String toString(){
		return "The data contained in this record reads: "
				+ "\nFirstname: "+ firstname
				+ "\nLastname: "+ lastname
				+ "\nEmail: " + email
				+ "\nID: "+ idnumber
				+ "\nColor: "+ color
				+ "\nBalance: "+ balance
				+"\n";
	}
	
	
}
