package jp.mzw.topse.lecture.testing_advanced.mutation_testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {

	private Calc calc;

	@Before
	public void setup() {
		this.calc = new Calc();
	}

	@Test
	public void testAdd() {
		assertEquals(2, this.calc.add(1, 1));
	}

	@Test
	public void testSub() {
		assertEquals(0, this.calc.sub(1, 1));
	}

	@Test
	public void testMul() {
		assertEquals(8, this.calc.mul(4, 2));
	}

	@Test
	public void testDiv() {
		assertEquals(2, this.calc.div(4, 2));
	}

}
