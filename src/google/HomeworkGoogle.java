package google;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeworkGoogle {
    WebDriver driver;


    @Before

    public void setUp() {
        String baseUrl = "https://www.google.com";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test

    public void verifyUserShouldNavigateToComputerPageSuccessfully() {

        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Computers")).click();

    }

    @Test
    public void verifyUserShouldNavigateToElectronicsPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Electronics")).click();

    }

    @Test

    public void verifyUserShouldNavigateToApparelPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Apparel")).click();

    }

    @Test
    public void verifyUserShouldNavigateToDigitaldownloadsPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Digital downloads")).click();

    }

    @Test
    public void verifyUserShouldNavigateToBooksPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Books")).click();

    }

    @Test
    public void verifyUserShouldNavigateToJewelryPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Jewelry")).click();
    }

    @Test
    public void verifyUserShouldNavigateToGiftCardsPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Gift Cards")).click();

    }

    @After
    public void tearDown() {

        driver.quit();

    }

}
