// Paweł Kalisz tests

package pl.test.demoqa.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoInteractions {
	
	WebDriver driver;
	
	@FindBy(linkText = "Sortable")
	WebElement sortableBtn;
	
	@FindBy(css = "#sortable > li:nth-child(2)")
	WebElement item2Sort;
	
	@FindBy(css = "#sortable > li:nth-child(6)")
	WebElement item6Sort;
	
	@FindBy(css = "#sortable > li:nth-child(1)")
	WebElement item1Sort;
	
	@FindBy(linkText = "Selectable")
	WebElement selectableBtn;
	
	@FindBy(css = "#selectable > li:nth-child(1)")
	WebElement item1Select;
	
	@FindBy(linkText = "Resizable")
	WebElement resizableBtn;
	
	@FindBy(css = "#resizable > div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se")
	WebElement sizeBtn;
	
	@FindBy(linkText = "Droppable")
	WebElement droppableBtn;
	
	@FindBy(id = "draggable")
	WebElement dragItm;
	
	@FindBy(id = "droppable")
	WebElement dropItm;
	
	@FindBy(linkText = "Draggable")
	WebElement draggableBtn;
	
	@FindBy(id = "draggable")
	WebElement drag2Itm;
	
	public DemoInteractions (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void interactionsSection() {
		sortableBtn.click();
		Actions move = new Actions(driver);
		move.dragAndDropBy(item2Sort, 0, 50).build().perform();
		move.dragAndDrop(item6Sort, item1Sort).build().perform();
		selectableBtn.click();
		item1Select.click();
		resizableBtn.click();
		move.dragAndDropBy(sizeBtn, 500, 200).build().perform();
		droppableBtn.click();
		move.dragAndDrop(dragItm, dropItm).build().perform();
		draggableBtn.click();
		move.dragAndDropBy(drag2Itm, 500, 250).build().perform();
	}

}
