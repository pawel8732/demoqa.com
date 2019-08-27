// Paweł Kalisz tests

package pl.test.demoqa.demoqa;

import org.junit.*;
import org.openqa.selenium.WebDriver;


public class DemoQATest {
	
	WebDriver driver;
	
	@Before
	public void open() {
		driver = DemoQA.getDriver();
	}
	
	@Test
	public void demoTest() {
		DemoInteractions di = new DemoInteractions(driver);
		di.interactionsSection();		
		DemoWidgets2 dw2 = new DemoWidgets2(driver);
		dw2.widgets2Section();
		DemoWidgets dw = new DemoWidgets(driver);
		dw.widgetsSection();
		DemoWidgets3 dw3 = new DemoWidgets3(driver);
		dw3.widgets3Section();
		
	}
	
	@After
	public void close() {
		DemoQA.sleep(5);
		driver.close();
	}

}
