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
	}
	
	@After
	public void close() {
		DemoQA.sleep(5);
		driver.close();
	}

}
