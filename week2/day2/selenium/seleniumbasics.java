package week2.day2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumbasics {
 public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println("Title of the page:"+title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL of the Page:"+currentUrl);
		//Relative XPATHS for login page and create Lead page. 
		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		Username.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		login.click();
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		link.click(); 
		//WebElement Leads = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		WebElement Leads = driver.findElement(By.xpath("//a[text()='Leads']"));
		Leads.click();
		WebElement createlead = driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]"));
		createlead.click();
		WebElement companyname = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		companyname.sendKeys("Lumel Technologies");
		WebElement firstname =driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		firstname.sendKeys("Harees");
		WebElement lastname =driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lastname.sendKeys("kumar");
		WebElement createlead1 = driver.findElement(By.xpath("//input[@name='submitButton']"));
		createlead1.click();
		
}
}
