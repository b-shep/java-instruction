import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {

	@Test
	public void createPirateTest() {
		Pirate p1 = new Pirate("Patchy");
		assertEquals("Patchy", p1.getName());
		assertEquals(4, p1.getLimbsRemaining());

	}
	@Test
	public void createOctoPirateTest() {
		Pirate p1 = new Pirate("OctoPete", 8);
		assertEquals("OctoPete", p1.getName());
		assertEquals(8, p1.getLimbsRemaining());
		assertEquals(0, Pirate.getTotalLimbsLost());
	}
	
	@Test
	public void isDeadTest() {
		Pirate p1 = new Pirate("Pirate Steve");
		assertFalse(p1.isDead());
		
	}
	
	@Test (timeout = 30)
	public void timeoutTest() {
		for(int i = 0; i < 1000; i++) {
			Pirate p = new Pirate("DreadPirate" + i);
			System.out.println(p);
		}
	}
	
	
}
