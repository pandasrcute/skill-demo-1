import static org.junit.Assert.*;
import org.junit.*;
public class AgeTest {
   @Test
   public void testAgeCalculator() {
   assertEquals(0, Age.ageCalculator(2003,2022)); //should pass
   }
}