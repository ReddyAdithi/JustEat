package JustEatProject.JustEat.bin.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JustEatHomePage {
	
	WebDriver driver;
	public JustEatHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="postcode")
	  WebElement postCode;
	  
	@FindBy(id="find-restaurants-button")
	  WebElement search;
	  
	    
	public WebElement postCode(){
	    	return postCode;
    }
	   
	public WebElement search(){
	    	return search;
	}

}