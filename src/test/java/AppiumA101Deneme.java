import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.context.SupportsChromeOptionsOption;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class AppiumA101Deneme {

    @Test
    public void test01() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");

        capabilities.setCapability("chromedriverExecutable", "C:\\Users\\ahka1\\IdeaProjects\\Appium\\driver\\chromedriver.exe");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.get("https://www.a101.com.tr");
        driver.context("NATIVE_APP");
        Thread.sleep(3);
        driver.findElement(By.id("com.android.chrome:id/negative_button")).click();
       driver.context("CHROMIUM");
        driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();
        driver.findElement(By.xpath("//a[@class='menu-toggle js-navigation-toggle visible-xs']")).click();
        driver.findElement(By.partialLinkText("GİYİM & AKSESUAR")).click();
        Thread.sleep(2);




    }
}
