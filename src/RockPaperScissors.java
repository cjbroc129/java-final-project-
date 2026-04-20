import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors extends Game{//RockPaperScissors child class that extends the parent class Game
	
	
	
	public RockPaperScissors(String name) {//constructor for RockPaperScissors
		super(name);//uses super to connect back to parent class passing the name from this back to Game
	}
	
	@Override
	public void start(){// RockPaperScissor's start function,overriding Game's
		super.start();//calls start from parent class
		
		
	}
	@Override
	public void play() {// RockPaperScissors play function,overriding Game's
		Scanner input = new Scanner(System.in);
	
		int rounds = 0;//variable that keeps track of the rounds played
		
		while(true) {//start of while loop for game itself
			int max=3,min=1;
			Random rand = new Random();
			int computerRpsChoice = rand.nextInt(max - min + 1) + min;//variable for what the computer chooses, uses random and the previous set max and min for the range to randomly select the computers choice
			
			System.out.println("Select your choice.");//main menu for the game
			System.out.println("1. Rock");
			System.out.println("2. Paper");
			System.out.println("3. Scissors");
			System.out.println("4. Quit");
			int rpsChoice = input.nextInt();//variable to store users choice to compare with the computers.
		
			//nested if statement blocks to select winner
			if (rpsChoice == 1) {//compares users choice of 1 to all possible values of computer to decide winner
				if(computerRpsChoice == 1) {
					System.out.println("You opponent also picked Rock. You Draw!");
				}
				else if(computerRpsChoice == 2) {
					System.out.println("Your opponent picked Paper. You lose!");
				}
				else if(computerRpsChoice == 3) {
					System.out.println("Your opponent picked Scissors. You win!");
				}
				
				
			}
			else if (rpsChoice == 2) {//compares users choice of 2 to all possible values of computer to decide winner
				if(computerRpsChoice == 1) {
					System.out.println("You opponent picked Rock. You Win!");
				}
				else if(computerRpsChoice == 2) {
					System.out.println("Your opponent also picked Paper. You Draw!");
				}
				else if(computerRpsChoice == 3) {
					System.out.println("Your opponent picked Scissors. You Lose!");
				}
			}
			else if (rpsChoice == 3) {//compares users choice of 2 to all possible values of computer to decide winner
				if(computerRpsChoice == 1) {
					System.out.println("You opponent picked Rock. You Lose!");
				}
				else if(computerRpsChoice == 2) {
					System.out.println("Your opponent picked Paper. You Win!");
				}
				else if(computerRpsChoice == 3) {
					System.out.println("Your opponent also picked Scissors. You Draw!");
				}
			}
			else if (rpsChoice == 4) {// if user enters 4 ends the game and returns to the main menu
				System.out.println("Returning to main menu...");
				System.out.println();
				break;
			}
			System.out.println();
			rounds ++;//increment rounds played after each game and then displays them for the user
			System.out.println("Current Rounds played: "+rounds);
			System.out.println();
		}

		
		
		
	}

}
