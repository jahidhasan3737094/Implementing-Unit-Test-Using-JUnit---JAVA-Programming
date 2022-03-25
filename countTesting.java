package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class countTesting {

	@Test
	public void test() {
		JunitTesting junit=new JunitTesting();
		int result=junit.count("java");
		assertEquals(2,result);
	}

}
