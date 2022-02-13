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
			System.out.print("What is your choice (1-4)? \r\n" );
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
				//valid = true;
				getAddition();
				break;
				
			case 2:
				getSubtraction();
				// valid = true;
				break;
				
			case 3:
				getMultiplication();
				// valid = true;
				break;
				
			case 4:
				getDivision();
				// valid = true;
				break;

			case 5:
				System.out.println("EXIT");
				break;
				
			default:
				valid = false;
			}
		}
		
		}
		
	// ADDITION - NAJIBAH'S PART
		public static void getAddition()  {  
			System.out.println("addition");
	}
	
	// SUBTRACTION - AMAAL'S PART
		public static void getSubtraction()  {  
			System.out.println("subtraction");
	}
		
	// MULTIPLICATION - AMAAL'S PART
				public static void getMultiplication()  {  
					System.out.println("MULTIPLICATION");
			}
			
	// DIVISION - NADYAH'S PART
				public static void getDivision()  {  
					System.out.println("DIVISION");
			}

}
		
