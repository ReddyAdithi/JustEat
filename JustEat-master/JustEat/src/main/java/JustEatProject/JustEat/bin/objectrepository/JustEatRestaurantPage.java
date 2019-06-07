package JustEatProject.JustEat.bin.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JustEatRestaurantPage {
	
	WebDriver driver;
	public JustEatRestaurantPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="//span[@class='c-contentHeader-subTitle']")
	  WebElement heading;
	 
	    
	public WebElement heading(){
	    	return heading;
    }

}
