package oop;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("Fabio", "07078004975");
		stu.setCity("Vancouver");
		stu.setPhone("993847384");
		stu.setState("British Columbia");
		stu.enroll("Java");
		stu.pay(500);
		stu.generateUserID();
		System.out.println(stu.toString());
	}

}

class Student {
	private static int ID = 1001;
	private String userID;
	private String emailID;
	private String name;
	private String SSN;
	private String phone;
	private String city;
	private String state;
	private String course;
	private double balance = 1000;

	//GETTERS AND SETTERS
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	//CONSTRUCTORS
	public Student (String name,String SSN) {
		this.name = name;
		this.SSN = SSN;
		ID++;
		setEmailID();
	}
	
	//
	public void setEmailID() {
		emailID = name.toLowerCase() + "@";
	}
	public void generateUserID() {
		int random = (int) (Math.random()*9000) + 1000;
		userID = ID + "" + random + SSN.substring(SSN.length() - 4);
		System.out.println("Your user ID: " + userID);
	}
	
	public void enroll(String course) {
		this.course = course;
	}
	public void pay(double amount) {
		balance -= amount;
	}
	public double checkBalance() {
		return balance;
	}
	public void showCourse() {
		System.out.println("Enrolled course: " + course);
	}
	public String toString() {
		return "[NAME: " + name + " ]\n[USER ID: " + userID + " ]\n[EMAIL ID: " + emailID + " ]\n[SSN: " + SSN + " ]\n[PHONE: " + phone + 
				" ]\n[COURSE ENROLLED: " + course + " ]\n[CITY: " + city + " ]\n[STATE: " + state + " ]";
	}

}
