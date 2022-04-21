package org.Univ;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chandru {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Apple\\eclipse-workspace\\UniversityInformation\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.tagName("table"));
		List<WebElement> element2 = element .findElements(By.tagName("tr"));
		
		for (int i = 0; i < element2.size() ; i++) {
			 WebElement row = element2.get(i);
			 List<WebElement> list = row.findElements(By.tagName("td"));
			 for (int j = 0; j < list.size(); j++) {
				 WebElement text = list.get(j);
				 System.out.println(text);
				
			}
			 
			
		}
		
		
	}

}
