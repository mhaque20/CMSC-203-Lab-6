import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	private GradeBook grade1;
	private GradeBook grade2;


	@BeforeEach
	void setUp() throws Exception {
		grade1 = new GradeBook(5);
	    grade1.addScore(50);
	    grade1.addScore(75);

	    grade2 = new GradeBook(5);
	    grade2.addScore(10);
	    grade2.addScore(30);

	}

	@AfterEach
	void tearDown() throws Exception {
		grade1 = null;
	    grade2 = null;

	}

	@Test
	void testAddScore() {
		assertTrue((grade1.toString()).equals("50.0 75.0 "));
	    assertTrue((grade2.toString()).equals("10.0 30.0 "));
	    
	    assertEquals(2, grade1.getScoreSize(), 0.001);
	    assertEquals(2, grade2.getScoreSize(), 0.001);
	    

	}

	@Test
	void testSum() {
		assertEquals(125, grade1.sum(), .0001);
	    assertEquals(40, grade2.sum(), .0001);

	}

	@Test
	void testMinimum() {
		assertEquals(50, grade1.minimum(), .001);
	    assertEquals(10, grade2.minimum(), .001);

	}

	@Test
	void testFinalScore() {
		assertEquals(75, grade1.finalScore(), .0001);
	    assertEquals(30, grade2.finalScore(), .0001);

	}

}
