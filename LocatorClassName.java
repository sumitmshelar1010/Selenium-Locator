package MainPackage.SeleniumChromeDriver.locators.basiclocatortype;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClassName {
    public static void main(String[] args) {//BY LOCATOR CLASSNAME
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://in.search.yahoo.com/?fr2=inr");
        WebElement we = wd.findElement(By.className("sbq"));
        we.sendKeys("Mens Cloths");
        we.click();

        wd.close();
    }
}
