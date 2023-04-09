package MainPackage.SeleniumChromeDriver.locators.basiclocatortype;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorID {
    public static WebDriver wd;
    public static WebElement we;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        wd = new ChromeDriver();  //UPCASTING
        wd.get("https://in.search.yahoo.com/?fr2=inr");
        we = wd.findElement(By.id("yschsp"));//LOCATOR ID
        we.sendKeys("men's clothing");
          wd.close();

    }}
