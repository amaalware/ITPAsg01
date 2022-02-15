import java.util.Scanner;

public class BasicMathsMenu {

	public static void main(String[] args) {

		int menuChoice = 0;

		
		System.out.println("Welcome to Basic Maths Practice for Year 1! \r \n"
				+ "1. Addition (+) \r\n" 
				+ "2. Subtraction (-) \r\n"
				+ "3. Multiplication (*) \r\n"
				+ "4. Division (/) \r\n"
				+ "5. EXIT \r\n");
		System.out.println("What is your choice (1-4)?");
		
		Scanner in = new Scanner(System.in);
		menuChoice = errorCheck();
		
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
				System.exit(0);
				
			} 
		}
		 
		
		
	// ADDITION - NAJIBAH'S PART
		public static void getAddition()  {  
			System.out.println("addition");
	}
	
	// SUBTRACTION - AMAAL'S PART
		public static void getSubtraction()  {  
			
			int subChoice = 0;
			
			
			System.out.println("\n---------------------------- ");
			System.out.println(" \n Subtraction Practice"
								+ "\r \n You can practice LEVEL 1 or LEVEL 2"
								+ "\n   Input 1 for LEVEL 1"
								+ "\n   Input 2 for LEVEL 2");
			System.out.println("\n---------------------------- \r \n");
			
		
			subChoice = errorCheck();
			
						}
	
		
	// MULTIPLICATION - AMAAL'S PART
				public static void getMultiplication()  {  
					System.out.println("MULTIPLICATION");
			}
			
	// DIVISION - NADYAH'S PART
				public static void getDivision()  {  
					System.out.println("DIVISION");
			}



				public static int errorCheck(){

					String strInput;
					boolean valid = false;
					int choice = 0;

					Scanner in = new Scanner(System.in);

					do {
						strInput = in.nextLine();
						valid = false;

						try {
							choice = Integer.parseInt(strInput);

							if (choice < 1 || choice > 5) {
								System.out.println("Error - please only input 1-5 only.");
								valid = true;
							}

						}
						catch (NumberFormatException e) {
							System.out.println("Error - please only input a whole number.");
							valid = true;
						} 
					} while(valid==true);
					return choice;
				}
			}
