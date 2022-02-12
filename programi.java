import java.util.Scanner;

public class programi {
	/*
	 * Addition ==> +
	 * Subtraction ==> -
	 * Multiplication ==> *
	 * Division ==> /
	 */
		public static void main(String[] args)  { 
      
			//Main menu
			Scanner in = new Scanner(System.in);
			String mainMenu =("\nMain menu:\n"+"1. Addition\n"+"2. Subtraction\n"+"3. Multiplication\n"+"4. Division\n"+"5. EXIT\n"+"Choose an option (1-5):\n");
			System.out.println(mainMenu);
			
			int menu = in.nextInt();
			
			while(menu<1 || menu >5) {
				System.out.print("\nInvalid entry, enter any valid option");
				System.out.println(mainMenu);
				menu = in.nextInt();
			}
			
			switch(menu) {//addition section
			case 1:
				System.out.print("Addition\n");
				System.out.print("Level 1 (Single digit)\n");
				System.out.print("Level 2 (Two digits numbers)\n");
				System.out.print("Do you wish to practice level 1 or 2?:");
				Scanner level = new Scanner(System.in);
				int chosen = level.nextInt();
				
				if(chosen == 1) {//Level 1 that generate random int value from 0 to 9
					int y = 0; //initial correct answer=0
					int n = 0; // initial wrong answer=0
					int ar [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
					for (int i=1;i<11;i++) { //loop to generate 10 questions
					int min = 0;
					int max = 9;
					int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
					int min1 = 0;
					int max1 = 9;
					int random_int1 = (int)Math.floor(Math.random()*(max1-min1+1)+min1);
					System.out.printf("Question %d: What is %d + %d ? =", i, random_int, random_int1);
					Scanner ans = new Scanner(System.in);
					int answer = ans.nextInt();
					int Correct = random_int + random_int1;
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
				
				else if(chosen == 2) {//Level 2 that generate random int value from 10 to 99
					int y = 0; //initial correct answer=0
					int n = 0; // initial wrong answer=0
					for (int i=1;i<11;i++) { //loop to generate 10 questions
					int min = 10;
					int max = 99;
					int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
					int min1 = 10;
					int max1 = 99;
					int random_int1 = (int)Math.floor(Math.random()*(max1-min1+1)+min1);
					System.out.printf("Question %d: What is %d + %d ? =", i, random_int, random_int1);
					Scanner ans = new Scanner(System.in);
					int answer = ans.nextInt();
					int Correct = random_int + random_int1;
					if (answer == Correct) {
						y++;
					}
					else {
						n++;
					}
					}
					System.out.println("Total correct answer(s):"+ y);
					System.out.println("Total incorrect answer(s):"+ n);
					System.out.println("Questions that are answered correctly");
					System.out.println("Questions that are answered incorrectly");
					return;
					}
				
			case 2: {//subtraction section
				System.out.print("Subtraction\n");
				System.out.print("Level 1 (Single digit)\n");
				System.out.print("Level 2 (Two digits numbers)\n");
				System.out.print("Do you wish to practice level 1 or 2?:");
				Scanner level1 = new Scanner(System.in);
				int chosen1 = level1.nextInt();
				
				if(chosen1 == 1) {//Level 1 that generate random int value from 0 to 9
					int y = 0; //initial correct answer=0
					int n = 0; // initial wrong answer=0
					for (int i=1;i<11;i++) { //loop to generate 10 questions
					int min = 0;
					int max = 9;
					int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
					int min1 = 0;
					int max1 = 9;
					int random_int1 = (int)Math.floor(Math.random()*(max1-min1+1)+min1);
					System.out.printf("Question %d: What is %d - %d ? =", i, random_int, random_int1);
					Scanner ans = new Scanner(System.in);
					int answer = ans.nextInt();
					int Correct = random_int - random_int1;
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
				
				else if(chosen1 == 2) {//Level 2 that generate random int value from 10 to 99
					int y = 0; //initial correct answer=0
					int n = 0; // initial wrong answer=0
					for (int i=1;i<11;i++) { //loop to generate 10 questions
					int min = 10;
					int max = 99;
					int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
					int min1 = 10;
					int max1 = 99;
					int random_int1 = (int)Math.floor(Math.random()*(max1-min1+1)+min1);
					System.out.printf("Question %d: What is %d - %d ? =", i, random_int, random_int1);
					Scanner ans = new Scanner(System.in);
					int answer = ans.nextInt();
					int Correct = random_int - random_int1;
					if (answer == Correct) {
						y++;
					}
					else {
						n++;
					}
					}
					System.out.println("Total correct answer(s):"+ y);
					System.out.println("Total incorrect answer(s):"+ n);
					System.out.println("Questions that are answered correctly");
					System.out.println("Questions that are answered incorrectly");
					return;
					}
			}
			
			case 3: {//Multiplication section
				System.out.print("Multiplication\n");
				System.out.print("Level 1 (Single digit)\n");
				System.out.print("Level 2 (Two digits numbers)\n");
				System.out.print("Do you wish to practice level 1 or 2?:");
				Scanner level2 = new Scanner(System.in);
				int chosen2 = level2.nextInt();
				
				if(chosen2 == 1) {//Level 1 that generate random int value from 0 to 9
					int y = 0; //initial correct answer=0
					int n = 0; // initial wrong answer=0
					for (int i=1;i<11;i++) { //loop to generate 10 questions
					int min = 0;
					int max = 9;
					int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
					int min1 = 0;
					int max1 = 9;
					int random_int1 = (int)Math.floor(Math.random()*(max1-min1+1)+min1);
					System.out.printf("Question %d: What is %d * %d ? =", i, random_int, random_int1);
					Scanner ans = new Scanner(System.in);
					int answer = ans.nextInt();
					int Correct = random_int * random_int1;
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
				
				else if(chosen2 == 2) {//Level 2 that generate random int value from 10 to 99
					int y = 0; //initial correct answer=0
					int n = 0; // initial wrong answer=0
					for (int i=1;i<11;i++) { //loop to generate 10 questions
					int min = 10;
					int max = 99;
					int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
					int min1 = 10;
					int max1 = 99;
					int random_int1 = (int)Math.floor(Math.random()*(max1-min1+1)+min1);
					System.out.printf("Question %d: What is %d * %d ? =", i, random_int, random_int1);
					Scanner ans = new Scanner(System.in);
					int answer = ans.nextInt();
					int Correct = random_int * random_int1;
					if (answer == Correct) {
						y++;
					}
					else {
						n++;
					}
					}
					System.out.println("Total correct answer(s):"+ y);
					System.out.println("Total incorrect answer(s):"+ n);
					System.out.println("Questions that are answered correctly"+ y++);
					System.out.println("Questions that are answered incorrectly"+ n++);
					return;
					}
			}
			
			case 4: {//Division section
				System.out.print("Division\n");
				System.out.print("Level 1 (Single digit)\n");
				System.out.print("Level 2 (Two digits numbers)\n");
				System.out.print("Do you wish to practice level 1 or 2?:");
				Scanner level3 = new Scanner(System.in);
				int chosen3 = level3.nextInt();
				
				if(chosen3 == 1) {//Level 1 that generate random int value from 0 to 9
					int y = 0; //initial correct answer=0
					int n = 0; // initial wrong answer=0
					for (int i=1;i<11;i++) { //loop to generate 10 questions
					float min = 0;
					float max = 9;
					float random_int = (float)Math.floor(Math.random()*(max-min+1)+min);
					float min1 = 1;
					float max1 = 9;
					float random_int1 = (float)Math.floor(Math.random()*(max1-min1+1)+min1);
					System.out.printf("Question %d: What is %.1f / %.1f ? =", i, random_int, random_int1);
					Scanner ans = new Scanner(System.in);
					float answer = ans.nextFloat();
					float Correct = random_int / random_int1;
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
				
				else if(chosen3 == 2) {//Level 2 that generate random int value from 10 to 99
					int y = 0; //initial correct answer=0
					int n = 0; // initial wrong answer=0
					for (int i=1;i<11;i++) { //loop to generate 10 questions
					float min = 10;
					float max = 99;
					float random_int = (float)Math.floor(Math.random()*(max-min+1)+min);
					float min1 = 10;
					float max1 = 99;
					float random_int1 = (float)Math.floor(Math.random()*(max1-min1+1)+min1);
					System.out.printf("Question %d: What is %.1f / %.1f ? =", i, random_int, random_int1);
					Scanner ans = new Scanner(System.in);
					float answer = ans.nextFloat();
					float Correct = random_int / random_int1;
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

			case 5: {//EXIT
				System.out.println("EXIT");
				System.exit(5); 
				return;
				}	
	}
	}
}

