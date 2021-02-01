package tests;

import static org.junit.Assert.*;

import org.junit.*;

import Snakes.game.Die;

public class DieTest {
	
	Die die; 
	
	@Before
	public void setup() {
		
		die = new Die(); 
		
	}
	
	
	
	@Test
	public void DieTest(){
	
		int result = die.rollD6(); 
		assertTrue(result > 0 && result < 7);
		
	}

}
