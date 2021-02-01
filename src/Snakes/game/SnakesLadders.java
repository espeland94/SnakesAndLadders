package Snakes.game;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SnakesLadders {

	public static void main(String[] args) {
		//Print Welcome message 
		System.out.println("Welcome to Snakes and Ladders");
		System.out.println("Created by B.Espeland");
		
		//Initialize scanner. 
		Scanner scan = new Scanner(System.in);
		
		
		//Prompt for number players. 
		int numPlayers = 0; 
		while(numPlayers < 1 || numPlayers > 4) {
			System.out.println("Enter number of players (2-4): ");
			numPlayers = scan.nextInt();
		}
		
		// Initialize the players 
		List<Player> players = new ArrayList<Player>();
		for (int idx = 0; idx < numPlayers; idx++) {
			Player player = new Player("P" + idx); 
			players.add(player); 
			
			
		}
			
		//Initialize the board.
		Board board = new Board(players);
		
		//Loop until player reaches the final spot. 
		//Players take turns to roll the die and move on the board 
		boolean done = false; 
		int playerIdx = 0; 
		while (!done) {
			//Players take turn 
			Player currPlayer = players.get(playerIdx);
			int roll = currPlayer.takeTurn(); 
			
			//Update the board 
			done = board.movePlayer(currPlayer, roll);
			
			//Print the board 
			System.out.println(board);
			System.out.println("-------------------------\n");
			
			//If we're done, print message. 
			if(done) {
				System.out.println(currPlayer + " wins");
				
			}

			//Set up for next player
			playerIdx++; 
			if (playerIdx == numPlayers) {
				playerIdx = 0; 
			}
		}

	}

}
