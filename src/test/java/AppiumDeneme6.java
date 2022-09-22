import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class AppiumDeneme6 {
    @Test
    public void test01() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulator");
        capabilities.setCapability(MobileCapabilityType.NO_RESET,true);
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        capabilities.setCapability("chromedriverExecutable","C:\\Users\\ahka1\\IdeaProjects\\Appium\\driver\\chromedriver.exe");
        AndroidDriver driver =new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);

        driver.get("https://www.amazon.com");
        System.out.println(driver.getContext());
        driver.findElement(By.id("nav-logobar-greeting")).click();
        Set<String> contextsSet=driver.getContextHandles();

        for (String each:contextsSet
             ) {
            System.out.println(each);
        }

        Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());

        System.out.println(driver.getContext());
       // driver.quit();



    }
}
