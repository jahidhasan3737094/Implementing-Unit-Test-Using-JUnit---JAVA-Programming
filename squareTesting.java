package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class squareTesting {

	@Test
	public void test() {
		JunitTesting junit=new JunitTesting();
		double result=junit.square(5);
		assertEquals(25,result);
	}

}
