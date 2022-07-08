package WebtablePractice;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SampleHashmap extends Baseclass1 {
	@Test
	public void hashmap() {
		launchBrowser();
		driver.get("https://chercher.tech/practice/table");
		HashMap<String,String>map=new HashMap<>();
		ArrayList<String>headernamelist=new ArrayList<>();
		for(int i=0;i<=3;i++) {
			
		List<WebElement> header=driver.findElements(By.xpath("//table[@id='webtable']//tbody//tr//th["+(i+1)+"]"));
		List<WebElement> columns=driver.findElements(By.xpath("//table[@id='webtable']//tbody//tr//td["+(i+1)+"]"));
		for(int j=0;j<=3;j++) {
		
		map.put(header.get(i).getText(), columns.get(j).getText());
		System.out.println(map);
	}
		}
		System.out.println("map:"+map);
		
	}
	//@Test
	public void hashmap1() {
		launchBrowser();
		driver.get("https://chercher.tech/practice/table");
		List<WebElement> headers=driver.findElements(By.xpath("//table[@id='webtable']//tbody//tr//th"));
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='webtable']//tbody//tr"));
		System.out.println(rows.size());
		Dictionary<Integer,HashMap<String,String>>datatable=new Hashtable<Integer,HashMap<String,String>>();
		//HashMap<String,String>map=new HashMap<>();
		for(int i=2;i<=rows.size();i++) {
			List<WebElement> rowcolumns=driver.findElements(By.xpath("//table[@id='webtable']//tbody//tr["+i+"]//td"));
			HashMap<String,String>map=new HashMap<>();
			for(int j=0;j<headers.size();j++) {
				map.put(headers.get(j).getText().trim(), rowcolumns.get(j).getText().trim());
				//System.out.println("map:"+map);
				//datatable.put(i, map);
			}
			System.out.println("map:"+map);
			datatable.put(i, map);
		}
		
		
		System.out.println(datatable);
			}
	//@Test
	public void hashmap2() {
		
		HashMap<String,String>map=new HashMap<>();
		map.put("name", "sabitha");
		map.put("surname", "Annaram");
		map.put("age", "30");
		//System.out.println(map);
		
		/*System.out.println(map.get("surname"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());*/
		
	    for (Entry<String, String> entry : map.entrySet()) {
	        System.out.print(entry+",");
	      
		
	}
	
	
	
	
	
	
	}}
