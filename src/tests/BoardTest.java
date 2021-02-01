package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Snakes.game.Board;
import Snakes.game.Player;


public class BoardTest {
	
	Board board1;
	Board board2; 
	List<Player> players; 
	
	@Before 
	public void setup() {
		
		players = new ArrayList<Player>(); 
		board1 = new Board(players); 
		board2 = new Board(players); 
	}
	
	@Test
	public void SnakesTest(){
	
		assertArrayEquals(board1.getSnakes(), board2.getSnakes());
	}
	
	@Test 
	public void LaddersTest(){
		
		assertArrayEquals(board1.getLadders(), board2.getLadders());
	}


}
