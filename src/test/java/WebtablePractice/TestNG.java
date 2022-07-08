package WebtablePractice;

import org.testng.annotations.Test;

public class TestNG {
	
	@Test (groups={"sanity", "smoke"})
	public void b_method() {
		System.out.println("This is B method");
	}
		
	@Test (groups= {"sanity"})
	public void a_method() {
		System.out.println("This is A method");
	}
		
	@Test(groups={"sanity", "smoke"})
	public void d_method() {
		System.out.println("This is D Method");
	}
		
	@Test(groups= {"smoke"})
	public void c_method() {
		System.out.println("This is C Method");
	}


}
