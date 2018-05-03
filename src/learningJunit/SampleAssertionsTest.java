package learningJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.*;

class SampleAssertionsTest {

	@Test
	public void testAssertTrue() {
		assertTrue(true, "failure - should be true");
	}
	
	@Test
	public void testAssertEquals() {
		assertEquals("failure - strings are not equal", "Peggy", "Fisher");
	}

}
