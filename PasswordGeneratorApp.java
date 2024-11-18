import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Random rm = new Random();
		
		System.out.println("Enter the password length: ");
		int length = sc.nextInt();
		
		System.out.println("Include uppercase letters? (y/n): ");
		boolean includeUpperCase = sc.next().equalsIgnoreCase("y");
		
		System.out.println("Include lowercase letters? (y/n): ");
		boolean includeLowerCase = sc.next().equalsIgnoreCase("y");
		
		System.out.println("Include numbers? (y/n): ");
		boolean includeNumbers = sc.next().equalsIgnoreCase("y");
		
		System.out.println("Include special characters? (y/n): ");
		boolean includeSpecialChars = sc.next().equalsIgnoreCase("y");
		
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		
		String numbers = "0123456789";
		
		String specialchars = "!@#$%^&*()_-=+<>?/";
		
		StringBuilder cp = new StringBuilder();
		
		if(includeUpperCase)cp.append(uppercase);
		if(includeLowerCase)cp.append(lowercase);
		if(includeNumbers)cp.append(numbers);
		if(includeSpecialChars)cp.append(specialchars);
		
		if(cp.length() == 0) {
			System.out.println("You must select atleast one character type..");
			return;
		}
		
		StringBuilder password = new StringBuilder();
		
		for(int i = 0; i < length; i++)
		{
	        int randomIndex = rm.nextInt(cp.length());
			
			password.append(cp.charAt(randomIndex));
		}
		
		System.out.println("Generated Password: " + password);
		
	}

	

}