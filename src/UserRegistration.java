import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner scanner=new Scanner(System.in);
	String firstName;
	String secondName;
	String email;
	String phoneNumber;
	public UserRegistration() {
		this.firstName=null;
		this.secondName=null;
		this.email=null;
		this.phoneNumber=null;
	}
	public void checkFirstName()
	{
		System.out.println("Enter the first name:");
		firstName=scanner.next();
		System.out.println(Pattern.matches("[A-Z][a-z]{3,}", firstName));
	}
	public void checkSecondName()
	{
		System.out.println("Enter the second name:");
		secondName=scanner.next();
		System.out.println(Pattern.matches("[A-Z][a-z]{3,}", secondName));
	}
	public void checkEmail()
	{
		System.out.println("Enter a valid email id");
		email=scanner.next();
		System.out.println(Pattern.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", email));
	}
	public void checkPhoneNumber()
	{
		System.out.println("Enter the phone number:");
		phoneNumber=scanner.next();
		//System.out.println(Pattern.matches("^[91]{2}[\s][6-9][0-9]{9}", phoneNumber));
		System.out.println(Pattern.matches("^[91]{2}[6-9][0-9]{9}", phoneNumber));
	}
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Program");
		UserRegistration object=new UserRegistration();
		object.checkFirstName();
		object.checkSecondName();
		object.checkEmail();
		object.checkPhoneNumber();
	}	

}
