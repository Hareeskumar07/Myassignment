package week2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println("Title of the page:"+title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL of the Page:"+currentUrl);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		WebElement Leads = driver.findElement(By.linkText("Leads"));
		Leads.click();
		WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("Lumel Technologies");
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Harees");
		WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("kumar");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		source.sendKeys("Cold Call");
		WebElement campagain=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select camp=new Select(campagain);
		camp.selectByVisibleText("Car and Driver");
		WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select indus=new Select(industry);
		indus.selectByValue("IND_DISTRIBUTION");
		WebElement currency=driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select amount=new Select(currency);
		amount.selectByIndex(4);
		//WebElement createlead1 = driver.findElement(By.className("smallSubmit"));
		//createlead1.click();
		
		
				//driver.close();

	}

}
