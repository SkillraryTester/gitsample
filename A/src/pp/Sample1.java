package pp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Sample1 {
	@Parameters({"port", "device", "sp"})
	@Test
	public void demo(String port, String device,String sp) throws MalformedURLException
	{
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		d.setCapability(MobileCapabilityType.DEVICE_NAME,device);
		d.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		d.setCapability("uiautomator2ServerLaunchTimeout",40000);
		d.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT,sp);
		
		String url1= "http://127.0.0.1:";
		String url2= "/wd/hub";
		String url= url1+port+url2;
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL(url),d);
		driver.get("https://www.myntra.com/");
		
	}
		

}
