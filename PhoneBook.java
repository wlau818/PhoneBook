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
		System.out.print("Search for number: ");
		double number = scnr.nextDouble();
		for (int i = 0; i < phonebook.size(); i ++) {
			//if (phonebook.get(i).intValue() == number) {
				//System.out.println("Person: " + phonebook.get(i));
			//}
		}
		for (String key : phonebook.keySet()) {
			if (phonebook.get(key) == number) {
				System.out.println("Corresponding name: " + key);
			}
		}
		if (phonebook.containsValue(number)) {
			
		}
		System.out.println("");
		System.out.println("Phone Book:");
		phonebook.forEach( (name, phNum) -> System.out.println(name + "'s phone number is " + phNum.intValue()) );
		
	}

}
