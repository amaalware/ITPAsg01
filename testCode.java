import java.util.Scanner;

public class testCode {
	public static void main(String[] args) {

		int menuChoice = 0;

		//The Menu i use Amaal's Menu
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
			
			int subChoice = 0;
			
			
			System.out.println("\n---------------------------- ");
			System.out.println(" \n Addition Practice"
								+ "\r \n You can practice LEVEL 1 or LEVEL 2"
								+ "\n   Input 1 for LEVEL 1"
								+ "\n   Input 2 for LEVEL 2");
			System.out.print("\n---------------------------- \r \n");

			subChoice = errorChecklevel(); // error Check for level
			
			if (subChoice == 1) {
				int RandNo1= 0;
				int RandNo2= 0;
				int y = 0; //initial correct answer = 0
				int n = 0; // initial wrong answer = 0
				for (int i=1;i<11;i++) { //loop to generate 10 questions
				RandNo1 = randomNo1digit();
				RandNo2 = randomNo1digit();
				System.out.printf("Question %d: What is %d + %d ? = ", i, RandNo1,RandNo2);
				Scanner ans = new Scanner(System.in);
				int answer = ans.nextInt();
				int Correct = RandNo1 + RandNo2;
				if (answer == Correct) {
					y++;
				}
				else {
					n++;
				}
				}
				System.out.println("Total correct answer(s):"+ y);
				System.out.println("Total incorrect answer(s):"+ n);
				System.out.println("Questions that are answered correctly:");
				System.out.println("Questions that are answered incorrectly:");
				return;
				}
			
			else if (subChoice == 2) {
				int RandNo1= 0;
				int RandNo2= 0;
				int y = 0; //initial correct answer = 0
				int n = 0; // initial wrong answer = 0
				for (int i=1;i<11;i++) { //loop to generate 10 questions
					RandNo1 = randomNo2digit();
					RandNo2 = randomNo2digit();
					System.out.printf("Question %d: What is %d + %d ? = ", i, RandNo1,RandNo2);
					Scanner ans = new Scanner(System.in);
					int answer = ans.nextInt();
					int Correct = RandNo1 + RandNo2;
					if (answer == Correct) {
						y++;
					}
					else {
						n++;
					}
					}
					System.out.println("Total correct answer(s):"+ y);
					System.out.println("Total incorrect answer(s):"+ n);
					System.out.println("Questions that are answered correctly:");
					System.out.println("Questions that are answered incorrectly:");
					return;
					}
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


	public static int randomNo1digit() { // Random numbers for Level 1
			int min = 0;
			int max = 9;
			int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
			return random_int;
		}
	
	public static int randomNo2digit() { // Random numbers for Level 2
			int min = 10;
			int max = 99;
			int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
			return random_int;
		}
	
	
	public static int errorCheck(){ //error Check for Main Menu
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
	
	public static int errorChecklevel(){ // I add the error Check for Level
		String strInput;
		boolean valid = false;
		int choice = 0;
		Scanner in = new Scanner(System.in);
		do {
			strInput = in.nextLine();
			valid = false;

			try {
				choice = Integer.parseInt(strInput);

			if (choice < 1 || choice > 2) {
			System.out.println("Error - please only input 1-2 only.");
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