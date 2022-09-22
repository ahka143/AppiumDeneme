import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class AppiumDeneme8 {

    @Test
    public void test01() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Note8");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\ahka1\\IdeaProjects\\Appium\\apiDemos.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

        driver.findElement(By.xpath("//android.widget.TextView[@text='API Demos']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
        WebElement wifiCheckBox = driver.findElement(By.xpath("//android.widget.CheckBox"));

        List<WebElement> wifiButtonsList = driver.findElements(By.className("android.widget.RelativeLayout"));

        if (!wifiButtonsList.get(1).isEnabled()){
            wifiButtonsList.get(0).click();
            wifiButtonsList.get(1).click();
        }else{
            wifiButtonsList.get(1).click();
        }

        driver.findElement(By.id("android:id/edit")).sendKeys("Test");
        driver.findElement(By.id("android:id/button1")).click();

driver.quit();

    }
}
