package pp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;
public class prallel {
	@Parameters({"port", "device"})
@Test
public void demo(String port, String device) throws MalformedURLException
{
	DesiredCapabilities d=new DesiredCapabilities();
	d.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.APPIUM);
	d.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	d.setCapability(MobileCapabilityType.DEVICE_NAME,device);
	d.setCapability("uiautomator2ServerLaunchTimeout",40000);
	d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
	  d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
	  String url1= "http://127.0.0.1:";
		String url2= "/wd/hub";
		String url= url1+port+url2;
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL(url),d);
	//d.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
	//AndroidDriver driver = new AndroidDriver(new URL("https://127.0.0.1:4723/wd/hub"),d);
	WebElement element1 = driver.findElementByXPath("//*[@text='6']");
	  WebElement element2 = driver.findElementByXPath("//*[@text='+']");
	  WebElement element3 = driver.findElementByXPath("//*[@text='3']");
	  WebElement element4 = driver.findElementByXPath("//*[@text='=']");
	  TouchAction ta1 = new TouchAction(driver);
	  TouchAction ta2 = new TouchAction(driver);
	  ta1.tap(ElementOption.element(element1)).perform();
	  ta2.tap(ElementOption.element(element2)).perform();
	  ta2.tap(ElementOption.element(element3)).perform();
	  ta2.tap(ElementOption.element(element4)).perform();  

}
	
}
