import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class changeSomeThingsTest extends AbstractTest{

	@Before
	public void setup() {
		selectBrowser(browser);
//		getBrowserFromProperty();
	}

	@Test
	public void test() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://192.168.1.1:8083/HotelWebapp/");
		driver.manage().window().maximize();
		
		WebElement citySelect = driver.findElement(By.name("ville"));
		Select select = new Select(citySelect);
		select.selectByValue("Paris");
		
		WebElement searchButton = driver.findElement(By.xpath("//*[@type='submit']"));
		searchButton.click();
	}
}
