package com.pageobjectmanager.com.Cucumber_Adactin_POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Scrollable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	public static void inputValue(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}

	public static void isDisplay(WebElement element) {
		boolean result = element.isDisplayed();
		System.out.println(result);

	}

	public static void isSelected(WebElement element) {
		boolean result1 = element.isSelected();
		System.out.println(result1);
	}

	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

	public static void submit(WebElement element) {
		element.submit();

	}

	public static void Location(WebElement element) {
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		System.out.println(x);
		System.out.println(y);

	}

	public static void clear(WebElement element) {
		element.clear();

	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	public static void getTagName(WebElement element) {
		String tagName = element.getTagName();
		System.out.println(tagName);

	}

	public static void cssValue(WebElement element, String str) {
		String cssValue = element.getCssValue(str);
		System.out.println(cssValue);

	}

	public static void getAttribute(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		System.out.println(attribute);

	}

	public static void click(WebElement element) {
		element.click();

	}

	public static void Size(WebElement element) {
		Dimension size = element.getSize();
		System.out.println(size);
	}


	public static WebDriver browseLaunch(String browser) {

		if (browser.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\richa\\eclipse-workspace\\Cucumber_Adactin_POM\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("success");

		}

		else if (browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\richa\\eclipse-workspace\\Selenium\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("Invalid browser name");
		}
		 return driver;

	}

	public static void launchURL(String url) {
		// WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("success");
	}

	public static void currentUrl() {
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
	}

	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void pageSource() {
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

	public static void navi_To(String url) {
		driver.navigate().to(url);
	}

	public static void navi_F() {
		driver.navigate().forward();
		
	}

	public static void navi_Back() {
		driver.navigate().back();
	}

	public static void i_Wait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public static void e_Wait(int time,By element) {
		WebDriverWait waits = new WebDriverWait(driver, time);
		waits.until(ExpectedConditions.presenceOfElementLocated(element));
//		waits.until(ExpectedConditions.condition)
	}

	public static void max() {
		driver.manage().window().maximize();
	}

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}

	public static void toSelectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void toSelectByVisibleText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void toSelectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void robo(int keys, int times) throws AWTException {
		// keys = KeyEvent.VK_UP;
		int i = 0;
		Robot r = new Robot();
		do {
			r.keyPress(keys);
			r.keyRelease(keys);
			i--;
		} while (i > times);

	}

	static Actions act;

	public static void clickHold(WebElement target) {
		act.clickAndHold(target).build().perform();

	}

	public static void release(WebElement target) {
		act.release(target).build().perform();
	}

	public static void moveElement(WebElement target) {
		act.moveToElement(target).build().perform();
	}

	public static void dragDrop(WebElement source, WebElement target) {
		act.dragAndDrop(source, target).build().perform();
	}

	public static void rightClick(WebElement target) {
		act.contextClick(target).build().perform();
	}

	public static void dClick(WebElement target) {
		Actions act = new Actions(driver);
		
		act.doubleClick(target).build().perform();
	}

	public static void handleWindow() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	public static void handleWindows() {
		Set<String> windowHandles = driver.getWindowHandles();

		for (String wH : windowHandles) {
			System.out.println(wH);

		}

	}

	public static void alerts(String accept, String dismiss) {
		Alert alert = driver.switchTo().alert();

		if (accept.equalsIgnoreCase("accept")) {
			alert.accept();
		} else if (dismiss.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		}

	}

	public static void promptAlerts(String keys, String accept, String dismiss) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(keys);
		if (accept.equalsIgnoreCase("accept")) {
			alert.accept();
		} else if (dismiss.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		}

	}

	public static void screenshot(String pic) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\richa\\eclipse-workspace\\Selenium\\Screenshots"+ pic +".png");
		FileUtils.copyFile(source,target);
		
	}
	
	public static void locatingElementById(String str) {
		By usingId = By.id(str);
		WebElement element = driver.findElement(usingId);
		String value = String.valueOf(element);
		System.out.println(value);
	}
	
	public static void locatingElementByname(String str) {
		By usingname = By.name(str);
		WebElement element = driver.findElement(usingname);
		String value = String.valueOf(element);
		System.out.println(value);
	}
	
	public static void locatingElementByxpath(String str) {
		By usingxpath = By.xpath(str);
		WebElement element = driver.findElement(usingxpath);
		String value = String.valueOf(element);
		System.out.println(value);
	}
	
	public static void locatingElementsByxpath(String str) {
		By usingxpath = By.id(str);
		List<WebElement> element = driver.findElements(usingxpath);
		
		for (WebElement allElements : element) {
			
			System.out.println(allElements);
			
		}
	}
	
	public static void scrollToElement(WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}
	
	
	
	


}
