package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class divideTesting {

	@Test
	public void test() {
		JunitTesting junit=new JunitTesting();
		double result=junit.divide(10,2);
		assertEquals(5,result);
	}

}
