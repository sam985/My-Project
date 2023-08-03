package java_project2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculator_test {

	@Test
	public void calctestadd( ) {
		assertEquals(30, Calculator.add(20, 10));
	}
	
	@Test
	public void calctestsub( ) {
		assertEquals(30, Calculator.sub(40, 10));
	}
	
	@Test
	public void calctestmult( ) {
		assertEquals(30, Calculator.mult(5, 6));
	}
	
	@Test
	public void calctestdiv( ) {
		assertEquals(2, Calculator.div(20, 10));
	}
	
}
