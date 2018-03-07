import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Map<String, Double> phonebook = new HashMap<String, Double>();
		System.out.print("Number of phone numbers: ");
		int num = scnr.nextInt();	
		System.out.println("");
		for (int i = 0; i < num; i ++) {
			System.out.print("Name " + (i + 1) + ": ");
			String name = scnr.next();
			System.out.print("Phone Number " + (i + 1) + ": ");
			Double number = scnr.nextDouble();
			phonebook.put(name, number);
			System.out.println("");
		}
		System.out.print("Type name to search for number: ");
		String contact = scnr.next();
		
		for (String key : phonebook.keySet()) {
			if (key.equals(contact)) {
				System.out.println("Corresponding number: " + phonebook.get(key).intValue());
			}
		}
		System.out.println("");
		System.out.println("Phone Book:");
		phonebook.forEach( (name, phNum) -> System.out.println(name + "'s phone number is " + phNum.intValue()) );
		
	}

}
