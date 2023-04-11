package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Orange_Hrm_Live_ChromeBrowserTest {
    public static void main(String[] args) {

        String baseUrl = " https://opensource-demo.orangehrmlive.com/";

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open the Url in browser
        driver.get(baseUrl);
        //Maximize the browser
        driver.manage().window().maximize();
        //Giving implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of page
        String title = driver.getTitle();
        //Printing statement
        System.out.println("Title");

        //Get the current Url
        System.out.println("Current Url:" + driver.getCurrentUrl());

        //Get page source
        System.out.println("Page Source:" + driver.getPageSource());

        //Find the username field element
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");

        //Find the password field element
        driver.findElement(By.name("password")).sendKeys("admin234");

        //Close the driver
        driver.close();

    }



}
