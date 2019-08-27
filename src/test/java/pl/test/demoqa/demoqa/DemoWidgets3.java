// Paweł Kalisz tests

package pl.test.demoqa.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DemoWidgets3 {
	
	WebDriver driver;
	
	@FindBy(linkText="Menu")
	WebElement menuBtn;
	
	@FindBy(id="ui-id-9")
	WebElement uiid9Btn;
	
	@FindBy(id="ui-id-13")
	WebElement uiid13Btn;
	
	@FindBy(id="ui-id-16")
	WebElement uiid16Btn;
	
	@FindBy(linkText="Dialog")
	WebElement dialogBtn;
	
	@FindBy(xpath="/html/body/div[6]/div[1]")
	WebElement dragDialog;
	
	@FindBy(xpath="/html/body/div[6]/div[7]")
	WebElement resizeDialog;
	
	@FindBy(linkText="Datepicker")
	WebElement dateBtn;
	
	@FindBy(id="datepicker")
	WebElement datepickerSlc;
	
	@FindBy(linkText="14")
	WebElement dataBtn;
	
	@FindBy(linkText="Controlgroup")
	WebElement controlBtn;
	
	@FindBy(id="car-type-button")
	WebElement carType;
	
	@FindBy(id="ui-id-5")
	WebElement luxurySlc;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/fieldset[1]/div/label[2]")
	WebElement automatBtn;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/fieldset[1]/div/label[3]")
	WebElement insuranceBtn;
	
	@FindBy(xpath="//*[@id=\"horizontal-spinner\"]")
	WebElement numberBtn;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/fieldset[1]/div/button")
	WebElement bookBtn;
	
	@FindBy(linkText="Checkboxradio")
	WebElement checkboxradioBtn;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/fieldset[1]/label[1]")
	WebElement radio1;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/fieldset[1]/label[2]")
	WebElement radio2;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/fieldset[1]/label[3]")
	WebElement radio3;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/fieldset[2]/label[1]")
	WebElement box1;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/fieldset[2]/label[2]")
	WebElement box2;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/fieldset[2]/label[3]")
	WebElement box3;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/fieldset[2]/label[4]")
	WebElement box4;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/fieldset[3]/label[4]")
	WebElement box5;

	public DemoWidgets3 (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void widgets3Section() {
		
		menuBtn.click();
		uiid9Btn.click();
		uiid13Btn.click();
		uiid16Btn.click();
		dialogBtn.click();
		Actions action = new Actions(driver);
		action.moveToElement(dragDialog).dragAndDropBy(dragDialog, 100, 100).build().perform();
		action.moveToElement(resizeDialog).dragAndDropBy(resizeDialog, 100, 100).build().perform();
		dateBtn.click();
		datepickerSlc.click();
		dataBtn.click();
		controlBtn.click();
		carType.click();
		luxurySlc.click();
		automatBtn.click();
		insuranceBtn.click();
		numberBtn.click();
		numberBtn.sendKeys("5");
		bookBtn.click();
		checkboxradioBtn.click();
		radio1.click();
		radio2.click();
		radio3.click();
		box1.click();
		box2.click();
		box3.click();
		box4.click();
		box5.click();
		
	}
}
