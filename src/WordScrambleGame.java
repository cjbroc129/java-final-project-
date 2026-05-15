import java.util.*;

public class WordScrambleGame extends Game{
	
	
	
	public WordScrambleGame(String name) {//constructor for WordScrambleGame
		super(name);//uses super to pass name to parent class
	}


	//methods
	@Override//overrides start from Game
	public void start() {
		super.start();//calls start from Game
	
	
	}
	@Override//Overrides play from Game
	public void play() {
		super.play();// calls play from Game
		Scanner input = new Scanner(System.in);
		String [] wordList = {"apples","oranges","unicycle","bike","computer","height","software"};//array for word list
		Random rand = new Random();//random initialization 
		String secretWord = wordList[rand.nextInt(wordList.length)];//uses random to select a word based on the length of the array storing it in the String secretWord
		char [] splitWord = secretWord.toCharArray();//creates a char array  called splitWord and converts the previously selected word into a char Array using .toCharArray() 
		for(int i=splitWord.length-1;i>0;i--) {//for loop to scramble word, decrements i
			int j = rand.nextInt(i + 1);//creates j as a random number between 0 and i to use later 
			char letter = splitWord[i];//stores index i value inside letter
			splitWord[i] = splitWord [j];//swaps the value from index j to index i
			splitWord[j]= letter;//overwrites position j with variable stored in letter
		}//end of for loop
		
		String scrambledWord = new String(splitWord);// takes newly shuffled array and converts it back into a string
		
		while(true) {//while loop for game
			System.out.println("Here is the word: "+ scrambledWord);//shows user scrambled word and prompts for guess
			System.out.println("What is your guess?: ");
			String wordGuess = input.nextLine().trim();//stores user input and trims to remove whitespace
			if(wordGuess.equalsIgnoreCase(secretWord)){//if statement checking if guess is equal to the unscrambled word
				System.out.println("Congradulations your guess is correct!");
				System.out.println("Returning to game hub...");
				System.out.println();
				break;
			}
			else if(wordGuess.isEmpty()) {//checks for emptiness with .isEmpty() conditional on wordguess,tells user to enter a word
				System.out.println("Error empty input:  Please enter a word");
			}
			else {//else statement for all other incorrect input
				System.out.println("The is not the correct word!");
				System.out.println("Would you like to try again(Y/N)");
				String quit = input.nextLine();//nested if statement that asks user if they would like to continue guessing
				if(quit.equalsIgnoreCase("N")){//if they enter N the game will end
					break;
				}
				else {//gives good luck message as user continues game
					System.out.println("Good luck!");
				}
			}
		}//end of while
	}//end of play

	

}//end of class

