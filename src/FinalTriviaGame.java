import java.util.Scanner;

public class FinalTriviaGame extends Game{
	
	public FinalTriviaGame(String name) {//Constructor for FinalTriviaGame
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
		Scanner input = new Scanner(System.in);//initializes scanner
		//set of arrays to build game around, questions array holds all the questions, answers1,2,3,4,5, and 6 hold answers to their respective questions and correctAnswersArray holds the correct answers for each respective question.
		String [] questions = {"What is the capital city of Virginia?","What is the biggest planet in our solar system?","What is the largest social media platform?","Which ocean is the largest in the world?", "Which continent has the most countries? ","Approximately how old is the Earth?"};
		String [] answers1 = {"A. Washington D.C.","B. Richmond","C. Williamsburg"};
		String [] answers2 = {"A. Venus","B. Neptune","C. Jupiter"};
		String [] answers3 = {"A. X","B. TikTok","C. Facebook"};
		String [] answers4 = {"A. Atlantic Ocean","B. Pacific Ocean", "C. Indian Ocean"};
		String [] answers5 = {"A. Africa","B. Europe","C. South America"};
		String [] answers6 = {"A. 14 billion years old","B. 4.5 billion years old","C. 7 billion years old"};
		String [] correctAnswersArray = {"B","C","C","B","A","B"};
		
		runTriviaGame(questions,answers1,answers2,answers3,answers4,answers5,answers6,correctAnswersArray,input);//calling runTriviaGame passing the above arrays in order and scanner input as arguments
	}//end of play
	
	public static void displayQuestion(String question,String[] answers) {//display question method, uses the question from the array, and corresponding answer array as parameters
		System.out.println(question);//prints question
		System.out.println(answers[0]);//prints the answers in order
		System.out.println(answers[1]);
		System.out.println(answers[2]);
		
	}//end of displayQuestion
	public static String getUserAnswer(Scanner input) {//getUserAnswer method, uses scanner as parameter
		System.out.println("Please enter your answer (A,B or C): ");//prompts user to enter answer
		while(true) {//while loop for answer validation
			String userAnswer = input.nextLine();//stores user input as a String variable
			if(userAnswer.equalsIgnoreCase("A")||userAnswer.equalsIgnoreCase("B")||userAnswer.equalsIgnoreCase("C")){//if statement block for validation, checks if user entered a,b,or c using .equalsIgnoreCase() for error handling
				return userAnswer;//returns userAnswer once validated
			}
			else {//prints error message if user inputs an invalid input
				System.out.println("Invalid Input. Please enter A, B or C only!");
			}//else of if, else statement block
				
		}//end of while
	
	}//end of getUserAnswer
	
	public static boolean checkAnswer(String userAnswer,String correctAnswer) {//method for checking correct answer takes in users answer and the corresponding answer for the question
		if(userAnswer.equalsIgnoreCase(correctAnswer)) {//checks if both userAnswer and correctAnswer are equivalent, using .equalsIgnoreCase() for error handling
			return true;
		}
		else {//if answer do not match returns false
			return false;
		}//end of if statement block
	}//end of check answer
	
	public static void runTriviaGame(String[] questions,String[] answers1,String[] answers2,String[] answers3,String[] answers4,String[] answers5,String[] answers6,String[] correctAnswers,Scanner input) {//runTriviaGame method using all arrays and scanner as parameters
		int correctlyAnswered = 0;//variables for tracking how many questions were answered correctly and incorrectly
		int incorrectlyAnswered = 0;
		String[] currentAnswers = new String[6];//array that references different answer arrays based on i.
		
		for(int i = 0;i<questions.length;i++) {//for loop to run through the questions array
			System.out.print("Question "+(i+1)+": ");//displays question using corresponding index as it increments each loop
			if(i == 0) {//if statement block that changes the answers array used based on the current increment of i
				currentAnswers = answers1;
			}
			else if(i == 1) {
				currentAnswers = answers2;
			}
			else if(i == 2) {
				currentAnswers = answers3;
			}
			else if(i == 3) {
				currentAnswers = answers4; 
			}
			else if(i == 4) {
				currentAnswers = answers5;
			}
			else if(i == 5) {
				currentAnswers = answers6;
			}
			displayQuestion(questions[i],currentAnswers);//displayQuestion being called, taking in the current index of questions and current answers array based on i increment
			
			String userAnswer = getUserAnswer(input);//calling getUserAnswer, passing scanner as argument and storing in variable
			boolean checkingAnswer = checkAnswer(userAnswer,correctAnswers[i]);//calling check answer passing on userAnswer and the current index of the correct answer array as arguments stored inside a boolean variable.
			if(checkingAnswer == true) {//if statement block to display to the user if they answered correctly or not using previous variable
				System.out.println("Correct!");
				System.out.println();
				correctlyAnswered++;//increments correct answer if user is correct
			}
			else {
				System.out.println("Incorrect. The correct answer is "+correctAnswers[i]+".");
				System.out.println();
				incorrectlyAnswered++;//increments incorrect counter if user is incorrect, and displays correct answer based on current i increment
			}//end of checkingAnswer if statement
			
			
		}//end of for loop
		System.out.println();//displays results of game to user after the forloop has finished
		System.out.println("Game Results:");
		System.out.println("You answered "+(correctlyAnswered)+" correctly.");
		System.out.println("You answered "+(incorrectlyAnswered)+" incorrectly.");
	}//end of runtriviaGame
	

}
