// Paweł Kalisz tests

package pl.test.demoqa.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;

public class DemoWidgets {
	
	WebDriver driver;
	
	@FindBy(linkText="Tooltip")
	WebElement tooltipBtn;
	
	@FindBy(xpath="//*[@id=\"age\"]")
	WebElement hoverTooltip;
	
	@FindBy(linkText="Tabs")
	WebElement tabsBtn;
	
	@FindBy(linkText="Nunc tincidunt")
	WebElement nuncBtn;
	
	@FindBy(linkText="Proin dolor")
	WebElement proinBtn;
	
	@FindBy(linkText="Aenean lacinia")
	WebElement aeneanBtn;
	
	@FindBy(linkText="Spinner")
	WebElement spinnerBtn;
	
	@FindBy(id="disable")
	WebElement disableBtn;
	
	@FindBy(id="destroy")
	WebElement destroyBtn;
	
	@FindBy(id="getvalue")
	WebElement getBtn;
	
	@FindBy(id="setvalue")
	WebElement setBtn;
	
	@FindBy(linkText="Slider")
	WebElement sliderBtn;
	
	@FindBy(id="slider")
	WebElement slider;
	
	@FindBy(linkText="Selectmenu")
	WebElement menuBtn;
	
	@FindBy(id="speed-button")
	WebElement speedSlc;
	
	@FindBy(id="files")
	WebElement filesSlc;
	
	public DemoWidgets (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 public void widgetsSection () {
		 tooltipBtn.click();
		 Actions action = new Actions(driver);
		 action.moveToElement(hoverTooltip).build().perform();
		 tabsBtn.click();
		 aeneanBtn.click();
		 proinBtn.click();
		 nuncBtn.click();
		 spinnerBtn.click();
		 disableBtn.click();
		 disableBtn.click();
		 destroyBtn.click();
		 destroyBtn.click();
		 setBtn.click();
		 getBtn.click();
		 driver.switchTo().alert().accept();
		 sliderBtn.click();
		 action.moveToElement(slider).click().dragAndDropBy(slider, 50, 50).build().perform();
		 menuBtn.click();
		 speedSlc.click();
		 speedSlc.sendKeys(Keys.DOWN, Keys.RETURN);

		 
		
		 
	 }

}
