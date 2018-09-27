package readWrite;

public class FixedRecord {

	
	public char[] firstname = new char[10];
	private char[] lastname = new char[15];
	private char[] email = new char[25];
	private char[] idnumber = new char[10];
	private char[] color = new char[10];
	private char[] balance = new char[10];
	private char[] fill;
	
	
	public char[] getFirstname() {
		return firstname;
	}
	public void setFirstname(char[] firstname) {
		this.firstname = firstname;
	}
	public char[] getLastname() {
		return lastname;
	}
	public void setLastname(char[] lastname) {
		this.lastname = lastname;
	}
	public char[] getEmail() {
		return email;
	}
	public void setEmail(char[] email) {
		this.email = email;
	}
	public char[] getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(char[] idnumber) {
		this.idnumber = idnumber;
	}
	public char[] getColor() {
		return color;
	}
	public void setColor(char[] color) {
		this.color = color;
	}
	public char[] getBalance() {
		return balance;
	}
	public void setBalance(char[] balance) {
		this.balance = balance;
	}
	public char[] getFill() {
		return fill;
	}
	public void setFill(char[] fill) {
		this.fill = fill;
	}
	
	
	
	
}


