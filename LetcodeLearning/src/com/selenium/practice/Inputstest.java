package com.selenium.practice;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputstest {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a")).click();
		
		WebElement fullname = driver.findElement(By.id("fullName"));
		fullname.sendKeys("K.Azeem");
				
		WebElement append = driver.findElement(By.id("join"));
		append.sendKeys("person"+Keys.TAB);
		
		WebElement textbox = driver.findElement(By.id("getMe"));
		String insidebox = textbox.getAttribute("Value");
		System.out.println("What is inside the text box"+ "-" + insidebox);
		
		WebElement clearme = driver.findElement(By.id("clearMe"));
		String text = clearme.getAttribute("Value");
		System.out.println("Clear the text"+ "-" + text);
		clearme.clear();
		
		WebElement disable = driver.findElement(By.id("noEdit"));
		boolean display = disable.isEnabled();
		System.out.println(display);
		
		WebElement Readonly = driver.findElement(By.id("dontwrite"));
		String status = Readonly.getAttribute("Value");
		System.out.println(status);
		
		File Inputs = driver.getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(Inputs, new File ("./images/Inputsscreenshot.png"));
		
		driver.close();
		
		

		
		

	}

}
