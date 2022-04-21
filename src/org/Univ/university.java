package org.Univ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public  class university {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Apple\\eclipse-workspace\\UniversityInformation\\drive\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(); 
	String url = "https://demo.guru99.com/test/drag_drop.html";
    driver.get(url);
    driver.manage().window().maximize();
    
    WebElement source = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
    WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
    WebElement source1 = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[4]"));
    WebElement target1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
    WebElement source2 = driver.findElement(By.xpath("(//a[contains(text(),' SALES ')])"));
    WebElement target2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
    WebElement source3 = driver.findElement(By.xpath("(//a[contains(text(),' 5000 ')])"));
    WebElement target3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
    Actions user = new Actions(driver);
    user.dragAndDrop(source, target).perform();
    Actions user1 = new Actions(driver);
    user1.dragAndDrop(source1, target1).perform();
    Actions user2 = new Actions(driver);
    user2.dragAndDrop(source2, target2).perform();
    Actions user3 = new Actions(driver);
    user3.dragAndDrop(source3, target3).perform();
    
	}
	
} 

