package Learning;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybidApp {
	@Test
	public void gmail() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		d.setCapability(MobileCapabilityType.DEVICE_NAME,"SR");
		d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.gm.ConversationListActivityGmail");
		d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.gm");
		//d.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		d.setCapability("uiautomator2ServerLaunchTimeout",40000);
		d.setCapability(MobileCapabilityType.NO_RESET, true);

		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),d);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@text='GOT IT']")).click();
	driver.findElement(By.xpath("//*[@text='TAKE ME TO GMAIL']")).click();
	driver.findElementByXPath("(//android.view.View[@content-desc=\"Select this conversation\"])[2]").click();
//	driver.findElement(By.xpath("//*[@text='Google']")).click();
//	Thread.sleep(99000);
	System.out.println(driver.getContext());

	
	
		
	}

}
