package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Chrome";

    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else  {
            System.out.println("Wrong Browser name");

        }
        String baseUrl = " https://opensource-demo.orangehrmlive.com/";

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open the URL in to browser
        driver.get(baseUrl);
        //maximize the window
        driver.manage().window().maximize();
        //We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of page
        String title = driver.getTitle();
        //Printing statement
        System.out.println("Title");

        //Get the current Url
        System.out.println("Current Url:" +driver.getCurrentUrl());

        //Get page source
        System.out.println("Page Source:" +driver.getPageSource());

        //Find the Email field element
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");

        //Find the password field element
      driver.findElement(By.name("password")).sendKeys("admin234");

      driver.close();
    }



}
