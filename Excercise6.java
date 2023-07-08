package javaprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;





public class Excercise6 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions act=new Actions(driver);
        WebElement element= driver.findElement(By.xpath("//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'][1]"));
        act.moveToElement(element).perform();
		WebElement e = driver.findElement(By.xpath("//span[text()='Tops']"));
		act.moveToElement(e).perform();
		WebElement ele = driver.findElement(By.xpath("//a[@id='ui-id-13']"));
		act.moveToElement(ele).click().perform();
		WebElement e1= driver.findElement(By.xpath("//a[contains(text(),'Desiree Fitness Tee')]"));
		act.moveToElement(e1).perform();
		WebElement e2= driver.findElement(By.id("option-label-size-143-item-167"));
		act.moveToElement(e2).click().perform();
		WebElement e3= driver.findElement(By.id("option-label-color-93-item-56"));
		act.moveToElement(e3).click().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		Thread.sleep(10000);
		WebElement e4 = driver.findElement(By.xpath("//a[@class='action showcart']"));
		act.moveToElement(e4).click().perform();
		WebElement e5 = driver.findElement(By.id("top-cart-btn-checkout"));
		act.moveToElement(e5).click().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[1]/fieldset/div/div/input")).sendKeys("piyukath@gmail.com");
		driver.findElement(By.xpath(" //*[@id='shipping-new-address-form']/div[1]/div/input")).sendKeys("Priyanka");
	    driver.findElement(By.xpath("//*[@id='shipping-new-address-form']/div[2]/div/input")).sendKeys("Kathare");
		driver.findElement(By.xpath(" /html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div[1]/div/input")).sendKeys("121 Oak Street");
		driver.findElement(By.xpath("//*[@id='shipping-new-address-form']/div[4]/div/input")).sendKeys("Cincinnati");
		Select select = new Select(driver.findElement(By.xpath("//*[@id='shipping-new-address-form']/div[5]/div/select")));
		select.selectByVisibleText("Ohio");
		driver.findElement(By.xpath("//*[@id='shipping-new-address-form']/div[7]/div/input")).sendKeys("43083");
		Select se = new Select(driver.findElement(By.xpath("//*[@id='shipping-new-address-form']/div[8]/div/select")));
		se.selectByVisibleText("United States");
		driver.findElement(By.xpath("//*[@id='shipping-new-address-form']/div[9]/div/input")).sendKeys("216-34678");
		driver.findElement(By.xpath("//input[@name='ko_unique_1']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Apply Discount Code']")).click();
		driver.findElement(By.xpath("//input[@name='discount_code']")).sendKeys("PAY10");
		driver.findElement(By.xpath("//span[text()='Apply Discount']")).click();
		driver.findElement(By.xpath("//input[@name='discount_code']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@aria-label='store logo']//img")).click();
		Thread.sleep(3000);
		WebElement e6 = driver.findElement(By.xpath("//a[@class='action showcart']"));
		act.moveToElement(e6).click().perform();
		WebElement e7 = driver.findElement(By.xpath("//span[text()='View and Edit Cart']"));
		act.moveToElement(e7).click().perform();
		driver.findElement(By.xpath("//a[@class='action action-delete']")).click();
		driver.findElement(By.xpath("//a[text()='here']")).click();
		Thread.sleep(3000);
		WebElement e8= driver.findElement(By.xpath("//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'][1]"));
        act.moveToElement(e8).perform();
		WebElement e9 = driver.findElement(By.xpath("//span[text()='Tops']"));
		act.moveToElement(e9).click().perform();
		WebElement e10 = driver.findElement(By.xpath("//img[@alt='Antonia Racer Tank']"));
		act.moveToElement(e10).click().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[4]/form/div[1]/div/div/div[1]/div/div[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[4]/form/div[1]/div/div/div[2]/div/div[1]")).click();
	    driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("11000");
	    driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='qty']")).clear();
	    driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("2"); 
	    driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
	    Thread.sleep(5000);
	    WebElement e11 = driver.findElement(By.xpath("//a[@class='action showcart']"));
	    act.moveToElement(e11).click().perform();
	    driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='Place Order']")).click();
	   

	}

}
