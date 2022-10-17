import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class AppiumDeneme8 extends TestBaseAndroid{

    @Test
    public void test01() throws MalformedURLException {


        AndroidDriver driver = androidDriver("C:\\Users\\ahka1\\IdeaProjects\\Appium\\apiDemos.apk");

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
