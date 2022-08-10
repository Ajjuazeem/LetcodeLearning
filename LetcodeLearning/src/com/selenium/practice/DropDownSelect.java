package com.selenium.practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/test");
		
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[3]/app-menu/div/footer/a")).click();
		
		WebElement Apple = driver.findElement(By.id("fruits"));
		Select Dropdown = new Select(Apple);
		Dropdown.selectByVisibleText("Apple");
		String Txtent = driver.findElement(By.className("subtitle")).getText();
		System.out.println("Selected Item=>"+ " " +Txtent);
		
		WebElement Superheros = driver.findElement(By.id("superheros"));
		Select sprhr = new Select(Superheros);
		sprhr.selectByValue("am");
		sprhr.selectByIndex(1);
		sprhr.selectByVisibleText("The Avengers");
		
		
		
		
		WebElement India = driver.findElement(By.id("country"));
		Select country = new Select(India);
		country.selectByValue("India");
		String print = country.getFirstSelectedOption().getText();
		System.out.println(print);
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File ("./images/dropdown.png"));
		
		driver.quit();
		 
		
		
		
	}
}
