import java.util.*;//util import


public class GuessNumber extends Game{//GuessNumber child class that extends the parent class Game
	
	
	public GuessNumber(String name){//constructor for GuessNumber
		super(name);//uses super to connect back to parent class passing the name from this back to Game
	
	}//end of constructor
	
	@Override	
	public void start() {//GuessNumber's start function,overriding Game's
		super.start();//calls start from parent class
		
		
			
	}//end of start
	@Override
	public void play() {// GuessNumber's play function,overriding Game's
		int attempts = 0;//variable to keep count of attempts
		int max=10,min=1;//max and min range
		Random rand = new Random();//initialization for Random
		int secretNum = rand.nextInt(max - min + 1) + min;//variable for secretNum that the user guesses, uses random and the previous set max and min for the range of numbers to guess from
		Scanner input = new Scanner(System.in);//scanner initialization
		
		while (true) {//start of while loop for game itself
			try{
				System.out.println("Guess a number 1-10");//prompts user to enter a number to guess
			
				int numGuess = input.nextInt();
				attempts++;//increments attempts after each user guess
			
				if (numGuess == secretNum) {//start of if statement for user input, 
				
					System.out.println("Congrats you win!");//if guessed correctly will give user a celebratory message, tell them their attempts then break the loop.
					System.out.println("Attempts Taken: "+ attempts);
					System.out.println("Returning to Java Game Hub...");
					System.out.println();
					break;
				}//end of correct guess if 
				else if(numGuess < secretNum) {//else if statement if users guess is lower than secretNum, gives them a hint that they its a low guess
					System.out.println("Too low! Try again.");
				
				
				}//end of low guess else if
				else if(numGuess > secretNum) {//else if statement if users guess is higher than secretNum, gives them a hint that they its a high guess
					System.out.println("Too high! Try again");
				
				}//end of high guess else if
			}//end of try
			catch(InputMismatchException e) {//catch for InputMismatchException, tells user they did not enter a num.
				System.out.println("Error: Not a number. Please try again!");
				input.nextLine();
			}//end of catch
		}//end of while loop
			
	}//end of play
	
		
		
	

}
