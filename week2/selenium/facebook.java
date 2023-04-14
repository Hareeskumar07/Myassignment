package week2.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement createaccount = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
	createaccount.click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harees");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("894013983");
	driver.findElement(By.id("password_step_input")).sendKeys("Teamilk");
	WebElement day = driver.findElement(By.id("day"));
	Select fbday=new Select(day);
	fbday.selectByVisibleText("13");
	WebElement month = driver.findElement(By.id("month"));
	Select fbmonth=new Select(month);
	fbmonth.selectByValue("8");
	WebElement year = driver.findElement(By.id("year"));
	Select fbyear=new Select(year);
	fbyear.selectByIndex(3);
	driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	
	
	
	
	
}
}
