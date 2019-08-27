// Paweł Kalisz tests

package pl.test.demoqa.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWidgets2 {
	
	WebDriver driver;
	
	@FindBy(linkText="HTML contact form")
	WebElement htmlBtn;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/form/input[1]")
	WebElement firstName;
	
	@FindBy(id="lname")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/form/input[3]")
	WebElement countryLab;
	
	@FindBy(linkText="Google Link")
	WebElement linkBtn;
	
	@FindBy(linkText="Google Link is here")
	WebElement linkBtn2;
	
	@FindBy(id="subject")
	WebElement subjectLab;
	
	@FindBy(linkText="Keyboard Events")
	WebElement keyboardBtn;
	
	@FindBy(id="browseFile")
	WebElement browseFile;
	
	@FindBy(id="uploadButton")
	WebElement uploadBtn;
	
	@FindBy(linkText="Tooltip and Double click")
	WebElement tadcBtn;
	
	@FindBy(id="doubleClickBtn")
	WebElement doubleClickBtn;
	
	@FindBy(id="rightClickBtn")
	WebElement rightClickBtn;
	
	@FindBy(xpath="//*[@id=\"rightclickItem\"]/div[1]")
	WebElement editSlt;
	
	@FindBy(id="tooltipDemo")
	WebElement tooltipDemo;
	
	public DemoWidgets2 (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void widgets2Section() {
		
		htmlBtn.click();
		firstName.click();
		firstName.sendKeys("Pawel");
		lastName.click();
		lastName.sendKeys("Pawel");
		countryLab.click();
		countryLab.sendKeys("Poland");
		Actions action = new Actions(driver);
		action.moveToElement(linkBtn).build().perform();
		action.moveToElement(linkBtn2).build().perform();
		subjectLab.click();
		subjectLab.sendKeys("Hello!");
		keyboardBtn.click();
		browseFile.sendKeys("D:\\test.txt");		
		uploadBtn.click();
		driver.switchTo().alert().accept();
		tadcBtn.click();
		action.doubleClick(doubleClickBtn).perform();
		driver.switchTo().alert().accept();
		action.contextClick(rightClickBtn).perform();
		editSlt.click();
		driver.switchTo().alert().accept();
		action.moveToElement(tooltipDemo).perform();
				
	}

}
