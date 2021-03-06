package qspActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.get("https://www.craftsvilla.com/");
	    WebElement saree = driver.findElement(By.linkText("SAREES"));
	    Actions act=new Actions(driver);
	    WebDriverWait wait=new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOf(saree));
	    act.moveToElement(saree).perform();
	    
	    
	    
	}

}
