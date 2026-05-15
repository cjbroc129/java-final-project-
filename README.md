# Multi-Game Java System

## Project Description
The Multi-Game Java System is a hub coded in Java that allows the user to play the following games:  
1. Guess the Number
2. Rock,Paper,Scissors
3. Trivia Game
4. Word Scramble
5. High-Low Card Game

## Games Overview:

1. Guess the Number:  
In this game the objective is to guess a number between 1 and 10.  
The program will randomly generate a number and the user will enter their guess.  
If the guess in incorrect the game will give you hints to aid in finding the correct number.

2. Rock,Paper,Scissors:  
In this game the user faces against the computer in rock paper scissors.  
At the start of each round the program will randomly select rock paper or scissors and the user must select their choice.    
Afterwards  the program will display the winner and display the current number of rounds played.    
The rounds will go on until the user decides to end the session.  

3.  Trivia Game:
In this game the user plays a multi-round game of trivia questions.  
The program will display a question each round and 3 possible answers.  
After the user enters their answer the program will display if the user's answer was correct or not and will display the correct answer if the users answer was incorrect.  
At the end of the game the game will display the total number of questions answered correctly and incorrectly.

4.  Word Scramble  
In this game the user must unscramble a word.  
At the start the program will choose from a pre-existing list of words and then randomly shuffle the letters around.  
Afterwards it will display the scrambled word to the user.  
The user must then enter what they think the word is.  
If the user decides they cannot unscramble the word and quit the program will display the word to them.  

5. High-Low Card Game
The objective of this game is to determine whether or not the next card flipped will be a higher or lower value than the current card.
At the start the game will display the first card.
Then the user will guess that the next card will be either Higher(H) or Lower(L) than the current one.
Afterwards, the game will display the next card and if the user guessed correctly.

## Project Structure : 
  
- Game.java  
Houses the main game class that the rest of the games inherit from.  
Contains the two main methods that each class has, being play() and start() and a constructor.  
Both methods just display a message of what is happening when running the game, e.g. start() displays "Loading game..."  
  
   
- GameMain.java  
Houses the code for the main hub.  
Displays a menu that gives the user a selection for the game they want to play or exit the program.  
Asks the user to select through a numbering system e.g. (1. Guess the Number).    
The menu and choices are inside a while loop to keep the user able to play until they decide to exit the hub.  
  
   
- GuessNumber.java  
Houses code for Guess the Number Game.  
Has start() and play() methods that override the Game.java methods and has class constructor.    
start() method calls the start method from Game.java.  
play() method houses the actual game, it generates a random number 1-10, then utilizes a while loop to allow the user to enter guesses as much as they need until they get it correct.  
If the user enters the wrong number the game will display hints telling them if their guess is to high or too low.  
Utilizes if/else if to determine if the guess is correct or too high/low and keeps track of total attempts to display at the end.  
Also utilizes try and catch for handle InputMismatchException.  
  
     
- RockPaperScissors.java  
Houses the code for the Rock,Paper,Scissors game.  
Contains the methods play() and start() and constructor for class.  
start() simply calls start() from Game.java.  
The play() method is where the game code lives.  
Firstly uses random for the computer to select 1 2 or 3 for rock paper or scissors and the addition of 4 to Quit the game.   
Then prompts user to select their choice in the same manner.    
After, it compares the user's selection against the computer in a series of nested if/else if statements, checks for user choice first then nests the comparison of the computers choice inside.    
Additionally, it keeps track of the rounds played and shows the the round count after each game.    
Also uses try catch(InputMismatchException) to handle incorrect scanner input.  

  
- FinalTriviaGame.java  
Houses code for the Trivia Game.  
Contains 6 methods(start() play() displayQuestion() getUserAnswer() checkAnswer() runTriviaGame() and constructor for class.  
start() calls start() from Game.java.  
play() holds 8 arrays (6 for answers 1 for the questions and 1 for the correct key) and call runTriviaGame() passing in all arrays and scanner as arguments.  
displayQuestion() takes in a question and answer array as parameters and displays both for user.  
getUserAnswer() takes scanner as parameter and utilizes a while loop and if/else statement to validate user input as "A" "B" or "C" only.  
checkAnswer() takes in the users answer and the correct answer as parameters and uses an if/else statement to determine if the user entered the correct answer.  
runTriviaGame() takes in all arrays and scanner as parameters.  
Firstly, it has 2 variables that are used to keep track of correct and incorrect answers, and a blank array that is used to hold the current answers.  
Uses a for loop to determine the current answer array and then passes that information to displayQuestion() along with the current question based on the iteration.  
Then calls getUserAnswer() then checkUserAnswer() to allow the user to enter their reponse and check for correctness.  
After checkAnswer() returns true or false, an if/else statement is used to both tell the user if they were correct and increment correct/incorrect answers.  
Once the for loop has run through the questions and the game is over the total correct/incorrect responses are displayed.  

  
- WordScrambleGame.java  
Has start() and play() methods that override the Game.java methods and has class constructor.    
start() method calls the start method from Game.java.  
play() contains the code for the main game.  
Calls play() from Game.java, contains scanner initialization, and a String Array of random words.  
Uses Random to select a word randomly from array and stores it inside the variable "secretWord".  
A char array called splitWord is the constructed uses this word by using .toCharArray().   
This array then has its elements shuffled with a for loop and then converted back into a string using "new String(splitWord)" and stored inside scrambledWord.  
A while is then used to play the game, it displays the scrambled Word then prompts the user to enter their guess.  
Users guess is then checked against the correct word and validated by using .trim and .isEmpty and else in an if/else if block.    
After each incorrect guess the user is prompted if they want to continue or not with an if/else statement.  
  
  
- HighLowCardGame.java  
Houses code for High-Low Card Game.  
Has start() and play() methods that override the Game.java methods and has class constructor.    
start() method calls the start method from Game.java.  
play() contains the code for the main game and calls play() from Game.java.  
Firstly, initializes scanner and then uses Random to generate a number between 1 and 13 stored inside "currentCardNum".  
Then uses a while loop to play the game, displays the currentCardNum then prompts user to guess if the next card will be Higher(H) or Lower(L) and then generates a new random numbers between 1-13 stored in "nextCardNum".  
Users input is then validated using if/else to see if they entered only H or L and if they don't a message is displayed to tell them their input was invalid.  
Then in a nested if statement the program checks which value between the two variables was higher and then a further nested if/else statement checks that outcome against users guess.   
After each round the user is then asked if they would like to continue playing using if statement to check their input.  

  
## How to run program:
1. Place all files into one folder
2. In IDE environment create a new Java Project using the previous folder as location.
3. Inside profile folder in IDE click run.
4. Enter input through console.



 









