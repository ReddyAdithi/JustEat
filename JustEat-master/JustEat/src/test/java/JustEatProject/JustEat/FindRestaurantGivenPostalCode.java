package JustEatProject.JustEat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import JustEatProject.JustEat.bin.objectrepository.JustEatHomePage;
import JustEatProject.JustEat.bin.objectrepository.JustEatRestaurantPage;


public class FindRestaurantGivenPostalCode {
	
	String URL="https://www.just-eat.co.uk/";
	String code="AR51 1AA";
	
	@Test
	public void searchRestaurant()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		JustEatHomePage obj=new JustEatHomePage(driver);
		obj.postCode().sendKeys(code);
		obj.postCode().sendKeys(Keys.ENTER);
		
		JustEatRestaurantPage rpObj=new JustEatRestaurantPage(driver);
		String headingText = rpObj.heading().getText();
		if (headingText.contains(code)) {
			System.out.println("There are resturants present for the given postal code!!");
		}
		
		
	}

}
