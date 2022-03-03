import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class BasicMathsMenu {
	public static void main(String[] args) {

		int menuChoice = 0;

		// MENU (AMAAL)
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
			
			int addChoice = 0;
			
			
			System.out.println("\n---------------------------- ");
			System.out.println(" \n Addition Practice"
								+ "\r \n You can practice LEVEL 1 or LEVEL 2"
								+ "\n   Input 1 for LEVEL 1"
								+ "\n   Input 2 for LEVEL 2");
			System.out.print("\n---------------------------- \r \n");

			addChoice = errorChecklevel(); // error Check for level
			
			if (addChoice == 1) {
				
				int RandNo1= 0;
				int RandNo2= 0;
				int y = 0; //initial correct answer = 0
				int n = 0; // initial wrong answer = 0
				int i = 0;
				int j = 0;
				int wrongQnNumbers[] = new int[11];
				int correctQnNumbers[] = new int[11];
				int wrongQnAns[] = new int[11];
				
				for (i=1;i<11;i++) { //loop to generate 10 questions
				
				RandNo1 = randomNo1digit();
				RandNo2 = randomNo1digit();
				
				System.out.printf("Question %d: What is %d + %d ? = ", i, RandNo1,RandNo2);
				Scanner ans = new Scanner(System.in);
				
				int answer = errorCheckAnswer();
				int Correct = RandNo1 + RandNo2;
				
				if (answer == Correct) {
					y++;
					correctQnNumbers[y] = i;
				}
				else {
					n++;
					wrongQnNumbers[n] = i;
					wrongQnAns[n] = Correct;
				}
			}
				
				System.out.println("\n===========================");
				System.out.println("\n RESULTS");
				System.out.println("\n===========================");
				System.out.println("\n Total correct answer(s):"+ y);
				System.out.println("\n Total incorrect answer(s):"+ n);
				
				System.out.println("\n Below are the questions that are answered correctly:");
				
				for (j= 0; j < y; j++) {
					System.out.print("\n Question " + correctQnNumbers[j+1] + ". " );
				}
				

				System.out.println("\r \n Below are the questions that are answered incorrectly:" );
				
				for (j= 0; j < n; j++) {
					System.out.print("\n Question " + wrongQnNumbers[j+1] + "; The correct answer is " + wrongQnAns[j+1] );
				}
			}
			
			else if (addChoice == 2) {
				
				int RandNo1= 0;
				int RandNo2= 0;
				int y = 0; //initial correct answer = 0
				int n = 0; // initial wrong answer = 0
				int i = 0;
				int j = 0;
				int wrongQnNumbers[] = new int[11];
				int correctQnNumbers[] = new int[11];
				int wrongQnAns[] = new int[11];
				
				for (i=1;i<11;i++) { //loop to generate 10 questions
				
				RandNo1 = randomNo2digit();
				RandNo2 = randomNo2digit();
				
				System.out.printf("Question %d: What is %d + %d ? = ", i, RandNo1,RandNo2);
				Scanner ans = new Scanner(System.in);
				
				int answer = errorCheckAnswer();
				int Correct = RandNo1 + RandNo2;
				
				if (answer == Correct) {
					y++;
					correctQnNumbers[y] = i;
				}
				else {
					n++;
					wrongQnNumbers[n] = i;
					wrongQnAns[n] = Correct;
				}
				}
				System.out.println("\n===========================");
				System.out.println("\n RESULTS");
				System.out.println("\n===========================");
				System.out.println("\n Total correct answer(s):"+ y);
				System.out.println("\n Total incorrect answer(s):"+ n);
				
				System.out.println("\n Below are the questions that are answered correctly:");
				
				for (j= 0; j < y; j++) {
					System.out.print("\n Question " + correctQnNumbers[j+1] + ". " );
				}
				

				System.out.println("\r \n Below are the questions that are answered incorrectly:" );
				
				for (j= 0; j < n; j++) {
					System.out.print("\n Question " + wrongQnNumbers[j+1] + "; The correct answer is " + wrongQnAns[j+1] );
				}	
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
			
			subChoice = errorChecklevel(); 
			
			if (subChoice == 1) {
				
				int RandNo1= 0;
				int RandNo2= 0;
				int y = 0; 
				int n = 0; 
				int i = 0;
				int j = 0;
				int wrongQnNumbers[] = new int[11];
				int correctQnNumbers[] = new int[11];
				int wrongQnAns[] = new int[11];
				
				for (i=1 ; i < 11; i++) { 
				
				RandNo1 = randomNo1digit();
				RandNo2 = randomNo1digit();
				
				System.out.printf("Question %d: What is %d - %d ? = ", i, RandNo1,RandNo2);
				Scanner ans = new Scanner(System.in);
				
				int answer = errorCheckAnswer();
				int Correct = RandNo1 - RandNo2;
				
				
				if (answer == Correct) {
					y++;
					correctQnNumbers[y] = i;
					
				}
				else {
					n++; 
					wrongQnNumbers[n] = i;
					wrongQnAns[n] = Correct;
				}
			}
				
				System.out.println("\n===========================");
				System.out.println("\n RESULTS");
				System.out.println("\n===========================");
				System.out.println("\n Total correct answer(s):"+ y);
				System.out.println("\n Total incorrect answer(s):"+ n);
				
				System.out.println("\n Below are the questions that are answered correctly:");
				
				for (j= 0; j < y; j++) {
					System.out.print("\n Question " + correctQnNumbers[j+1] + ". " );
				}
				

				System.out.println("\r \n Below are the questions that are answered incorrectly:" );
				
				for (j= 0; j < n; j++) {
					System.out.print("\n Question " + wrongQnNumbers[j+1] + "; The correct answer is " + wrongQnAns[j+1] );
				}
			}
			
			else if (subChoice == 2) {
				int RandNo1= 0;
				int RandNo2= 0;
				int y = 0; 
				int n = 0; 
				int i = 0;
				int j = 0;
				int wrongQnNumbers[] = new int[11];
				int correctQnNumbers[] = new int[11];
				int wrongQnAns[] = new int[11];
				
				
				for (i=1 ; i < 11; i++) { 
					
					RandNo1 = randomNo2digit();
					RandNo2 = randomNo2digit();
					
					System.out.printf("Question %d: What is %d - %d ? = ", i, RandNo1,RandNo2);
					
					Scanner ans = new Scanner(System.in);
					int answer = ans.nextInt();
					int Correct = RandNo1 - RandNo2;
					
					if (answer == Correct) {
						y++;
						correctQnNumbers[y] = i;
					}
					
					else {
						n++;
						wrongQnNumbers[n] = i;
						wrongQnAns[n] = Correct;
					}
					}
				
				System.out.println("\n===========================");
				System.out.println("\n RESULTS");
				System.out.println("\n===========================");
				System.out.println("\n Total correct answer(s):"+ y);
				System.out.println("\n Total incorrect answer(s):"+ n);
				
				System.out.println("\n Below are the questions that are answered correctly:");
				
				for (j= 0; j < y; j++) {
					System.out.print("\n Question " + correctQnNumbers[j+1] + ". " );
				}
				

				System.out.println("\r \n Below are the questions that are answered incorrectly:" );
				
				for (j= 0; j < n; j++) {
					System.out.print("\n Question " + wrongQnNumbers[j+1] + "; The correct answer is " + wrongQnAns[j+1] );
				}
					return;
					
					}
			}

		
			
	// MULTIPLICATION - AMAAL'S PART
	public static void getMultiplication()  {  
		
		int mulChoice = 0;
		
		
		System.out.println("\n---------------------------- ");
		System.out.println(" \n Multiplication Practice"
							+ "\r \n You can practice LEVEL 1 or LEVEL 2"
							+ "\n   Input 1 for LEVEL 1"
							+ "\n   Input 2 for LEVEL 2");
		System.out.println("\n---------------------------- \r \n");
		
		mulChoice = errorChecklevel(); 
		
		if (mulChoice == 1) {
			
			int RandNo1= 0;
			int RandNo2= 0;
			int y = 0; 
			int n = 0; 
			int i = 0;
			int j = 0;
			int wrongQnNumbers[] = new int[11];
			int correctQnNumbers[] = new int[11];
			int wrongQnAns[] = new int[11];
			
			
			for (i=1 ; i < 11; i++) { 
				
			RandNo1 = randomNo1digit();
			RandNo2 = randomNo1digit();
			
			System.out.printf("Question %d: What is %d * %d ? = ", i, RandNo1,RandNo2);
			
			Scanner ans = new Scanner(System.in);
			int answer = errorCheckAnswer();
			int Correct = RandNo1 * RandNo2;
			
			if (answer == Correct) {
				y++;
				correctQnNumbers[y] = i;
			}
			else {
				n++;
				wrongQnNumbers[n] = i;
				wrongQnAns[n] = Correct;
			}
			}
			
			System.out.println("\n===========================");
			System.out.println("\n RESULTS");
			System.out.println("\n===========================");
			System.out.println("\n Total correct answer(s):"+ y);
			System.out.println("\n Total incorrect answer(s):"+ n);
			
			System.out.println("\n Below are the questions that are answered correctly:");
			
			for (j= 0; j < y; j++) {
				System.out.print("\n Question " + correctQnNumbers[j+1] + ". " );
			}
			

			System.out.println("\r \n Below are the questions that are answered incorrectly:" );
			
			for (j= 0; j < n; j++) {
				System.out.print("\n Question " + wrongQnNumbers[j+1] + "; The correct answer is " + wrongQnAns[j+1] );
			}
			
			return;
			
			}
		
		else if (mulChoice == 2) {
			int RandNo1= 0;
			int RandNo2= 0;
			int y = 0; 
			int n = 0; 
			int i = 0;
			int j = 0;
			int wrongQnNumbers[] = new int[11];
			int correctQnNumbers[] = new int[11];
			int wrongQnAns[] = new int[11];
			
			for (i=1 ; i < 11; i++) { 
				
				RandNo1 = randomNo2digit();
				RandNo2 = randomNo2digit();
				
				System.out.printf("Question %d: What is %d * %d ? = ", i, RandNo1,RandNo2);
				Scanner ans = new Scanner(System.in);
				
				int answer = ans.nextInt();
				int Correct = RandNo1 * RandNo2;
				
				if (answer == Correct) {
					y++;
					correctQnNumbers[y] = i;
				}
				else {
					n++;
					wrongQnNumbers[n] = i;
					wrongQnAns[n] = Correct;
				}
				}
		
			
			System.out.println("\n===========================");
			System.out.println("\n RESULTS");
			System.out.println("\n===========================");
			System.out.println("\n Total correct answer(s):"+ y);
			System.out.println("\n Total incorrect answer(s):"+ n);
			
			System.out.println("\n Below are the questions that are answered correctly:");
			
			for (j= 0; j < y; j++) {
				System.out.print("\n Question " + correctQnNumbers[j+1] + ". " );
			}
			

			System.out.println("\r \n Below are the questions that are answered incorrectly:" );
			
			for (j= 0; j < n; j++) {
				System.out.print("\n Question " + wrongQnNumbers[j+1] + "; The correct answer is " + wrongQnAns[j+1] );
			}
				
				return;
				}
			}
	
			
	// DIVISION - NADYAH'S PART
	public static void getDivision()  { 
		
		
		int DivChoice = 0;
		
		
		System.out.println("\n---------------------------- ");
		System.out.println(" \n Division Practice"
							+ "\r \n You can practice LEVEL 1 or LEVEL 2"
							+ "\n   Input 1 for LEVEL 1"
							+ "\n   Input 2 for LEVEL 2");
		System.out.println("\n---------------------------- \r \n");
		
		DivChoice = errorChecklevel();
		
		
		if (DivChoice == 1) {
			
			double RandNo3= 0;
			double RandNo4= 0;
			int y = 0;
			int n = 0;
			int i =0;
			int j =0;
			double wrongQnNumbers[] = new double[11];
			double correctQnNumbers[] = new double[11];
			double wrongQnAns[] = new double[11];
				
			System.out.print("(Please enter your answer in 1 decimal place for long answer)\n");
				
			for (i=1 ; i < 11 ; i++) { 
				
			RandNo3 = randomNo3digit();
			RandNo4 = randomNo3digit();
					
			System.out.printf("Question %d: What is %.1f / %.1f ? = ", i, RandNo3,RandNo4);
			
			Scanner ans = new Scanner(System.in);
			double answer = errorCheckAnswer1();
			double Correct = RandNo3 / RandNo4; 
			double roundOff = Math.round(Correct*10)/10.0; //convert into 1 dp

			if (answer == roundOff) { // accept correct answer that are in 1 dp 
				y++;
				correctQnNumbers[y] = i;
				
			}
			else {
				n++;
				wrongQnNumbers[n] = i;
				wrongQnAns[n] = roundOff;
			}
			}
				
			System.out.println("\n===========================");
			System.out.println("\n RESULTS");
			System.out.println("\n===========================");
			System.out.println("\n Total correct answer(s):"+ y);
			System.out.println("\n Total incorrect answer(s):"+ n);
				
			System.out.println("\n Below are the questions that are answered correctly:");
				
			for (j= 0; j < y; j++) {
				System.out.print("\n Question " + correctQnNumbers[j+1] + ". " );
			}
				

			System.out.println("\r \n Below are the questions that are answered incorrectly:" );
				
			for (j= 0; j < n; j++) {
				System.out.print("\n Question " + wrongQnNumbers[j+1] + "; The correct answer is " + wrongQnAns[j+1] );
			}
				
			return;
			}
			
		
		else if (DivChoice == 2) {
			double RandNo3= 0;
			double RandNo4= 0;
				
			int y = 0;
			int n = 0;
			int i =0;
			int j =0;
			double wrongQnNumbers[] = new double[11];
			double correctQnNumbers[] = new double[11];
			double wrongQnAns[] = new double[11];
				
			System.out.print("(Please enter your answer in 1 decimal place for long answer)\n");
				
			for (i=1 ; i < 11 ; i++) { 
					
				RandNo3 = randomNo4digit();
				RandNo4 = randomNo4digit();
					
				System.out.printf("Question %d: What is %.1f / %.1f ? = ", i, RandNo3,RandNo4);
				Scanner ans = new Scanner(System.in);
				double answer = errorCheckAnswer1();
				double Correct = RandNo3 / RandNo4; 
				double roundOff = Math.round(Correct*10)/10.0; //convert into 1 dp
				
				if (answer == roundOff) { // accept correct answer that are in 1 dp 
					y++;
					correctQnNumbers[y] = i;
				}
				else {
					n++;
					wrongQnNumbers[n] = i;
					wrongQnAns[n] = roundOff;
				}
				}
				
			System.out.println("\n===========================");
			System.out.println("\n RESULTS");
			System.out.println("\n===========================");
			System.out.println("\n Total correct answer(s):"+ y);
			System.out.println("\n Total incorrect answer(s):"+ n);
				
			System.out.println("\n Below are the questions that are answered correctly:");
				
			for (j= 0; j < y; j++) {
				System.out.print("\n Question " + correctQnNumbers[j+1] + ". " );
			}
				

			System.out.println("\r \n Below are the questions that are answered incorrectly:" );
				
			for (j= 0; j < n; j++) {
				System.out.print("\n Question " + wrongQnNumbers[j+1] + "; The correct answer is " + wrongQnAns[j+1] );
			}
				
				return;
				}
	}
	
	
	
	// RANDOM NUMBERS GENERATOR (NAJIBAH & NADYAH)
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
	
	public static double randomNo3digit() {// Random numbers for level 1 (division)
		double min = 1;
		double max = 9;
		double random_double = (int)Math.floor(Math.random()*(max-min+1)+min);
		return random_double;
	}

	public static double randomNo4digit() {// Random numbers for level 2 (division)
		double min = 10;
		double max = 99;
		double random_double = (int)Math.floor(Math.random()*(max-min+1)+min);
		return random_double;
	}
	
	
	// VALIDATION FOR MAIN MENU (AMAAL)
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
	
	// VALIDATION FOR LEVEL (NAJIBAH)
	public static int errorChecklevel(){ // error check for Level
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
			System.out.println("Error - please only input the levels available only.");
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
	

// VALIDATION FOR ANSWERS (AMAAL)
public static int errorCheckAnswer(){ 
	
	String strInput;
	boolean valid = false;
	int choice = 0;
	
	Scanner in = new Scanner(System.in);
	
	do {
		strInput = in.nextLine();
		valid = false;

		try {
			choice = Integer.parseInt(strInput);
		}
		catch (NumberFormatException e) {
		System.out.println("Error - please only input a whole number.");
		valid = true;
		} 
		
	} while(valid==true);
	
	return choice;
	
	}
	
// VALIDATION FOR DIVISION ANSWERS (NADYAH)
public static double errorCheckAnswer1(){ 
	String strInput;
	boolean valid = false;
	double choice = 0;
	Scanner in = new Scanner(System.in);
	do {
		strInput = in.nextLine();
		valid = false;

		try {
			choice = Double.parseDouble(strInput);
		}
		catch (NumberFormatException e) {
		System.out.println("Error - please only input number.");
		valid = true;
		} 
	} while(valid==true);
	return choice;
	}
}
