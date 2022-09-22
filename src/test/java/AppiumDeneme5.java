import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class AppiumDeneme5 {

    @Test
    public void test01() throws Exception{
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulator");
        capabilities.setCapability(MobileCapabilityType.NO_RESET,true);
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\ahka1\\IdeaProjects\\Appium\\Calculator.apk");
        AndroidDriver driver =new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);

        driver.findElement(By.id("btnC")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn5")).click();
        driver.findElement(By.id("btnMul")).click();
        driver.findElement(By.id("btn3")).click();
        driver.findElement(By.id("btnEqual")).click();
       String actualResult=driver.findElement(By.xpath("(//android.widget.TextView)[5]")).getText();
       String expectedresult="45";
        Assert.assertEquals(actualResult,expectedresult);



        driver.quit();

    }
}
