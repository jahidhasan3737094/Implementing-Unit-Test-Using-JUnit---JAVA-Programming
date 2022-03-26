package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class DivideNegative {

	@Test
	public void test() {
		JunitTesting junit=new JunitTesting();
		assertThrows(ArithmeticException.class,() -> junit.divide(10,0),"can not divide by 0" );
		
		
	}

}
