import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner scanner=new Scanner(System.in);
	String firstName;
	public UserRegistration() {
		this.firstName=null;
	}
	public void checkFirstName()
	{
		System.out.println("Enter the first name:");
		firstName=scanner.next();
		System.out.println(Pattern.matches("[A-Z][a-z]{3,}", firstName));
	}
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Program");
		UserRegistration object=new UserRegistration();
		object.checkFirstName();

	}

}
