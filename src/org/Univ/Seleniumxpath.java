package org.Univ;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class Seleniumxpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Apple\\eclipse-workspace\\UniversityInformation\\drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String url = ("https://www.flipkart.com/");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.xpath("//button[text()='✕']"));
		findElement.click();
	   driver.findElement(By.name("q")).sendKeys("mi mobile");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'rR')])[1]")).click();
		String windowHandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String g : handles) {
			if (!windowHandle.equals(g)) {
				driver.switchTo().window(g);
			}
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
	}

}
