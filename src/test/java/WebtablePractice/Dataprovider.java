package WebtablePractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	@DataProvider(name="login")
		public Object[][] data(){
			return new Object[][] { {
				"sabith","name"},{"reddy","lastname"},
				
					
			};
			
		}
	@Test(dataProvider="login")
	public void verifydata(String n1,String n2) {
		System.out.println(n1+ ":"+n2);
		
		
	}

		
	
	

}
