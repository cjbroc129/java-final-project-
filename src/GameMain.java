import java.util.*;//scanner import
public class GameMain {

	public static void main(String[] args) {//start of main method
		
		Scanner input = new Scanner(System.in);//initializes scanner
		while(true) {//while loop for user to interact with
			
			System.out.println("Welcome to the Java Game Hub");//main menu and its options for user to select from, returns here after user is done with each game
			System.out.println("=================================");
			System.out.println("Please select a game you would like to play: ");
			System.out.println("1. Guess the Number");
			System.out.println("2. Rock, Paper, Scissors");
			System.out.println("3. Word Scramble");
			System.out.println("4. Higher or Lower?");
			System.out.println("5. Trivia Game");
			System.out.println("6. Quit");
			try {
				int menuChoice = input.nextInt();//variable to store users menu selection
				input.nextLine();
				//if/ else if statements to select user 
				if (menuChoice == 1) {//if the user decided to enter 1 and play Guess the number
					Game g1 = new GuessNumber("john");//creates Game object as a polymorphism of GuessNumber
					g1.start();//calls start method for g1 from GuessNumber
					g1.play();//calls play method for g1 from GuessNumber
				}
				else if (menuChoice == 2) {//else if the user decided to enter 2 and play Rock Paper Scissors
					Game rps1 = new RockPaperScissors("john");//creates Game object as a polymorphism of RockPaperScissors
					rps1.start();//calls start method for rps1 from RockPaperScissors
					rps1.play();//calls play method for rps1 from RockPaperScissors
					
				}
				else if (menuChoice == 3) {//else if the user decided to enter 2 and play Rock Paper Scissors
					Game ws1 = new WordScrambleGame("john");//creates Game object as a polymorphism of RockPaperScissors
					ws1.start();//calls start method for rps1 from RockPaperScissors
					ws1.play();//calls play method for rps1 from RockPaperScissors
					
				}
				else if (menuChoice == 4) {//else if the user decided to enter 2 and play Rock Paper Scissors
					Game hl1 = new HighLowCardGame("john");//creates Game object as a polymorphism of RockPaperScissors
					hl1.start();//calls start method for rps1 from RockPaperScissors
					hl1.play();//calls play method for rps1 from RockPaperScissors
					
				}
				else if (menuChoice == 5) {//else if the user decided to enter 2 and play Rock Paper Scissors
					Game tg1 = new FinalTriviaGame("john");//creates Game object as a polymorphism of RockPaperScissors
					tg1.start();//calls start method for rps1 from RockPaperScissors
					tg1.play();//calls play method for rps1 from RockPaperScissors
					
				}
				else if (menuChoice == 6) {//else if the user enters 3, simply uses System.exit to close the program
					System.exit(0);
				}
				else {
					System.out.println("Please enter a valid menu option (1-6)");
					System.out.println();
				}
				
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter a valid menu option (1-6)");
				input.nextLine();
				System.out.println();
			}
			
		}//end of loop

	}

}

//InputMismatchException
