import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import logic.Calculator;

class CalculatorProjectTest {

	@Test
	public void createCalculatorAddTest() {
		List<String> numList = new ArrayList<String>(Arrays.asList("3", "+", "5"));
		Calculator calculator = new Calculator();
		assertEquals("8", calculator.calculate(numList));
	}
	
//	@Test
//	public void 

}
