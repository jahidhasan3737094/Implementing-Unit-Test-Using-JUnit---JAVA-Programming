package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ countTesting.class, DivideNegative.class, divideTesting.class, squareTesting.class })
public class AllTests {

}
