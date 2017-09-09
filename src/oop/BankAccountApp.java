package oop;

public class BankAccountApp {

	public static void main(String[] args) {
	
		BankAccount acc1 = new BankAccount("07078004981", 1000.50);
		BankAccount acc2 = new BankAccount("12345345454", 2000);
		BankAccount acc3 = new BankAccount("54235673358", 3000);
		
		acc1.setName("Fabio");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(250);
		acc1.payBill(225);
		acc1.accrue();
		System.out.println(acc1.toString());
		

	}

}

class BankAccount implements IInterest{
	//Properties 
	private static int ID = 1001;	//Internal ID
	private String accountNumber; 	//ID + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0, 2);
		System.out.println("Your account number: " + accountNumber);
	}
	
	//GETTERS AND SETTERS
	public void setName (String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//METHODS
	
	public void payBill(double amount) {
		balance -= amount;
		showBalance();
	}
	public void makeDeposit(double amount) {
		balance += amount;
		showBalance();
	}
	public void showBalance() {
		System.out.println("Your new balance: " + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + " ]\n[ACCOUNT NUMBER: " + accountNumber + " ]\n[ROUTING NUMBER: " + routingNumber + " ]\n[BALANCE: " + balance + " ]";
	}
}