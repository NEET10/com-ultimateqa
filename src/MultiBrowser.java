import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser = "Edge";
    static WebDriver driver;
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        //Open the URL
        driver.get(baseUrl);
        //Print the title of the page
        System.out.println(driver.getTitle());
        //Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source: " + driver.getPageSource());
        //Enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("Ultimate@gmail.com");
        //Enter the password to password field
        driver.findElement(By.id("user[password]")).sendKeys("Ultimate123");
        //Close the Browser
        // driver.close();
    }
}
