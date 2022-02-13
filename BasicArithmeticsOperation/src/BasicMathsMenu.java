import java.util.Scanner;

public class BasicMathsMenu {

	public static void main(String[] args) {

		int menuChoice = 0;
		String strInput;
		boolean valid = false;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("1. Addition (+) \r\n" 
				+ "2. Subtraction (-) \r\n"
				+ "3. Multiplication (*) \r\n"
				+ "4. Division (/) \r\n"
				+ "5. EXIT \r\n");
		
		while(valid==false) {
			System.out.print("What is your choice (1-4)?" );
			strInput = in.nextLine();
			
			 try {
				menuChoice = Integer.parseInt(strInput);
				valid = true;
			}
			catch (NumberFormatException e) {
				System.out.println("Error - please enter a number between 1 to 5 & refer to the menu.");
			} 
			 
			
			switch(menuChoice) {
			case 1:
				System.out.println("yuh");
				valid = true;
				break;
				
			case 2:
				System.out.println("suh");
				valid = true;
				break;
				
			case 3:
				System.out.println("muh");
				valid = true;
				break;
				
			case 4:
				System.out.println("duh");
				valid = true;
				break;
				
			case 5:
				System.out.println("EXIT");
				break;
				
			default:
				valid = false;
			}
		
		}
		
		
	}

}
		
