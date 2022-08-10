package com.selenium.practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ButtonsTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a")).click();
		
		WebElement Gotohome = driver.findElement(By.id("home"));
		Gotohome.click();
		File homescrsht = driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(homescrsht, new File ("./images/gotohome.png"));
		driver.navigate().back();
		
		WebElement Position = driver.findElement(By.id("position"));
		Point xy = Position.getLocation();
		int Xvalue = xy.getX();
		int Yvalue = xy.getY();
		System.out.println("X Value is =>" + Xvalue + "Y Value is =>" + Yvalue);
		
		
		WebElement color = driver.findElement(By.id("color"));
		String clr = color.getCssValue("background-color");
		System.out.println("Find the color of the button" + "=>" + clr);
		
		WebElement property = driver.findElement(By.id("property"));
		Dimension HW = property.getSize();
		int Height = HW.getHeight();
		int Width = HW.getWidth();
		System.out.println("Height is =>" + Height +"Width is =>"+Width);
		
		WebElement Disable = driver.findElement(By.id("isDisabled"));
		boolean Find = Disable.isEnabled();
		System.out.println("button is disabled=>" + Find);
		
		File Buttons = driver.getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(Buttons, new File ("./images/Buttonsscreenshot.png"));
		
		
		driver.close();
		
	}

}
