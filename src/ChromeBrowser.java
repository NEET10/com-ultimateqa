import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //Setup Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open URL
        driver.get(baseUrl);
        //Print the title page
        System.out.println(driver.getTitle());
        //Print the current URL
        System.out.println("Current URL; " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source: " + driver.getPageSource());
        //Enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("Ultimate@gmail.com");
        //Enter the password to password field
        driver.findElement(By.id("user[password]")).sendKeys("Ultimate123");
        //Close the Browser
        //driver.close();

    }
}
