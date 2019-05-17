import static org.junit.Assert.*;

import org.junit.Test;

public class BeforeAndAfterTEst {

	@Test
	public void test1() {
		System.out.println("test1 called");
	}
	@Test
	public void test2() {
		System.out.println("test2 called");
	}
	
	@Test
	public void test3() {
		System.out.println("test3 called");
	}
	
	@Test
	public void before() {
		System.out.println("before called");
	}
	@Test
	public void after() {
		System.out.println("after called");
	}
	@Test
	public void beforeClass() {
		System.out.println("beforeClass called");
	}
	
	@Test
	public void afterClass() {
		System.out.println("afterClass called");
	}
		
}
	
