import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Blume {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver_win32 (12)\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://test-apps.blumesolutions.com/blume-home/");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//input[@id='username']")).click();
        Actions act=new Actions(driver);
        act.sendKeys("nishtha.singh@blumeglobal.com").build().perform();

        driver.findElement(By.xpath("//input[@name='password']")).click();
        act.sendKeys("Nopass@123").build().perform();

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        act.moveToElement(driver.findElement(By.xpath("//i[text()='map']"))).build().perform();
        driver.findElement(By.xpath("//div[text()='Locations']//parent::a")).click();

        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
       //WebDriverWait wait=new WebDriverWait(driver, 30);

        driver.findElement(By.xpath("//div[text()='Locations']//parent::a")).click();

        WebDriverWait wait=new WebDriverWait(driver, 30);
        driver.findElement(By.xpath("//div[text()='Add Location']")).click();

        driver.findElement(By.xpath("//input[@id='locationName']")).click();
        act.sendKeys("Mandya678").build().perform();

        driver.findElement(By.xpath("//input[@id='address1']")).click();
        act.sendKeys("Mandala Village").build().perform();


       // driver.close();



    }
}
