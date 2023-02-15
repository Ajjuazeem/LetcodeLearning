package com.selenium.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/test");

		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a")).click();
		WebElement simplealert = driver.findElement(By.id("accept"));
		simplealert.click();
		Alert alert = driver.switchTo().alert();
		String alertname = alert.getText();
		System.out.println(alertname);
		alert.accept();
		
		WebElement confirmalert = driver.findElement(By.id("confirm"));
		confirmalert.click();
		String alertname1 = alert.getText();
		System.out.println(alertname1);
		alert.dismiss();
		
		WebElement promtalert = driver.findElement(By.id("prompt"));
		promtalert.click();
		String alertname2 = alert.getText();
		System.out.println(alertname2);
		alert.sendKeys("");
		alert.accept();
		
		
		driver.quit();
		
		
		
		

	}

}
