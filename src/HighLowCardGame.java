import java.util.*;
public class HighLowCardGame extends Game {
	
	
	public HighLowCardGame(String name) {//constructor for HighLowCardGame
		super(name);//uses super to pass name to parent class
	}


	//methods
	@Override
	public void start() {//overrides start from Game
		super.start();//calls start from Game
	
	}
	@Override
	public void play() {//overrides play from Game
		super.play();//calls play from Game
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int currentCardNum = rand.nextInt(13)+1;//uses rand to allow currentCardNum be any number between 1 and 13
		
		while(true) {//while loop
			System.out.println("The current cards value is "+currentCardNum);//shows user current card value and prompts for guess
			System.out.println("Will the next card be higher or lower?(H/L): ");
			String userGuess = input.nextLine().trim();
			int nextCardNum = rand.nextInt(13)+1;//creates the 1-13 value of the next card
			if(userGuess.equalsIgnoreCase("H") || userGuess.equalsIgnoreCase("L")) {//if statement block checking if user entered a valid input
				if(currentCardNum < nextCardNum) {//nested if to check user guess against current and next card values
					if(userGuess.equalsIgnoreCase("H")){
						System.out.println("The next cards value is..."+nextCardNum+"!"+" You got it correct!");
					}
					else if(userGuess.equalsIgnoreCase("L")) {
						System.out.println("The next cards value is..."+nextCardNum+"!"+" You are incorrect!");
					}
					
					currentCardNum = nextCardNum;//sets the newcard value to current value
				}
				
				else if(currentCardNum > nextCardNum) {//else if current card is greater
					if(userGuess.equalsIgnoreCase("L")){
						System.out.println("The next cards value is..."+nextCardNum+"!"+" You got it correct!");
					}
					else if(userGuess.equalsIgnoreCase("H")) {
						System.out.println("The next cards value is..."+nextCardNum+"!"+" You are incorrect!");
					}
					
					currentCardNum = nextCardNum;//sets the newcard value to current value
				}
				
				else {
					System.out.println("It was a draw!");
				}
				
				System.out.println("Do you want to keep playing?(Y/N)");//if statement that prompts user if they want to continue playing
				String quit = input.nextLine();
				if(quit.equalsIgnoreCase("N")) {//if N then ends game
					System.out.println();
					break;
				}
			}
			else{//displays message to user to enter valid input if they did not
				System.out.println("Please enter a valid input");
			}
				
		}//end of while
			
	}//end of play
}//end of class
		




