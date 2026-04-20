
public class Game {
	//private field
	private String name;//private variable for name
	
	public Game(String name) {//constructor for Game that has String name as parameter
		this.name = name;//uses this.name to connect it back to the field
	}
	
	// Getters - read only access to the data
	public String getName() {//getter for name
		return name;
	}//end of name getter
	
	//methods
	public void start() {//method for start function, just prints a loading game message
		System.out.println("Loading Game...");
		System.out.println();
		
	}
	public void play() {//method for play function just prints a message
		System.out.println("Its time to play!");
		System.out.println();
		
	}
	
	public void end() {//method for end that exits program using System.exit
		System.exit(0);
	}


}
