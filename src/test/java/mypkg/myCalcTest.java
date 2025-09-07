package mypkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class myCalcTest {
	myCalc calc = new myCalc();

	@Test
	void test() {
		assertEquals(70,calc.sum(50,20));
		assertEquals(30,calc.diff(50,20));
		
	}

}
