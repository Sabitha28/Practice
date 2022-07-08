package WebtablePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SampleWebtable extends Baseclass1 {
	
	@Test
	public void webtable() {
		launchBrowser();
		driver.get("https://chercher.tech/practice/table");
		ArrayList<String>tablecolumns=new ArrayList<>();
		int index = 0;
		//List<WebElement> header=driver.findElements(By.xpath("//table[@id='webtable']//tbody//tr//th"));
		List<WebElement> header=driver.findElements(By.xpath("//table[@id='webtable']//tbody//tr//td"));
		for(WebElement headers:header) {
			String headersnames=headers.getText();
			tablecolumns.add(headersnames);
			if(tablecolumns.contains("Selenium Webdriver")){
		 index=tablecolumns.indexOf("Selenium Webdriver");
			//System.out.println("index:"+index);
			break;
			}
					}
		System.out.println("index:"+(index+1));
		//System.out.println(tablecolumns);
	}
	//@Test
	public void webtable1() {
		
		launchBrowser();
		driver.get("https://chercher.tech/practice/table");
		HashMap<ArrayList<String>,ArrayList<String>>map=new HashMap<>();
		ArrayList<String>headernamelist=new ArrayList<>();
		List<WebElement> header=driver.findElements(By.xpath("//table[@id='webtable']//tbody//tr//th"));
		for(WebElement headers:header) {
			String headersnames=headers.getText();
			headernamelist.add(headersnames);
		}
		System.out.println("headersnames:"+headernamelist.toString());
		
		ArrayList<String>columnamelist=new ArrayList<>();
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='webtable']//tbody//tr"));
		//System.out.println(rows.size());
		for(int i=2;i<rows.size();i++) {
		List<WebElement> columns=driver.findElements(By.xpath("//table[@id='webtable']//tbody//tr["+i+"]//td"));
		//System.out.println(columns.size());
		for(int j=0;j<columns.size();j++) {
		String colnames=columns.get(j).getText();
		columnamelist.add(colnames);
		//map.put(headernamelist, columnamelist);
	}
		

}
		System.out.println("columnamelist:"+columnamelist);
	
	
	//HashMap<ArrayList<String>,ArrayList<String>>map=new HashMap<>();
	//map.put(headernamelist, columnamelist);
	System.out.println(map);
	
	}
	
	
	//@Test
	public void webtable2() {
		launchBrowser();
		driver.get("https://chercher.tech/practice/table");
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='webtable']//tbody//tr"));
	System.out.println(rows.size());
	//List<WebElement> colmns=driver.findElements(By.xpath("//table[@id='webtable']//tbody//tr//th"));
	//System.out.println(colmns.size());
	
	//for(WebElement li:rows) {
		List<WebElement> collist=driver.findElements(By.tagName("td"));
		System.out.println(collist.size());
		
	//}
}
}