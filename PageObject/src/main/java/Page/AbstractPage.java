package Page;

import java.io.File;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



import Tool.WaitTool;

public class AbstractPage {
	public static final int DefaultWaitElementTime4Page = 60;
	

	/**
	 * Construct a Component Page Object until the page loaded.
	 * 
	 * @param <T>
	 * 
	 * @param driver
	 *            the Selenium 2 WebDriver used by this class to manipulate the
	 *            application
	 * 
	 * @throws TimeoutException
	 *             if the timeout expires
	 * 
	 */
	protected <PageObjectStyle extends AbstractPage> AbstractPage(WebDriver driver,
			Class<PageObjectStyle> pageObject) {
		PageFactory.initElements(driver, pageObject);
		WaitTool.waitFor(driver, WaitTool.pageLoadDone());

	}

	protected <PageObjectStyle extends AbstractPage> AbstractPage(WebDriver driver,
			Class<PageObjectStyle> pageObject, WebElement webElement, int waitTime) {
		PageFactory.initElements(driver, pageObject);
		WaitTool.waitFor(driver, waitTime, webElement);

	}

	/**
	 * Is this element currently displayed or not? This method avoids the
	 * problem of having to parse an element's "style" attribute.
	 * 
	 * @param driver
	 *            the instance of WebDriver manipulated
	 * @return Whether or not the element is displayed
	 */
	
	
	
	
	
	
	
	
	
	public static boolean isDisplayed(final WebDriver driver, final WebElement element) {
		try {
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
		

	
	
	
	  public static void initAllPages(WebDriver driver)
	  {
	       File rootFile = new File( AbstractPage.class.getResource(".").getFile());
	       //init all children class element
	       setSonList(rootFile, rootFile.getAbsolutePath() + "\\", AbstractPage.class, rootFile.getAbsolutePath().replace("target/classes/", "") + "\\" ,driver);
	  }

	public static <T> void setSonList(File rootFile, String parentDirectory, Class<T> parentClass, String mainPath ,WebDriver driver) {
	         if (rootFile.isDirectory()) {
	             File[] files = rootFile.listFiles();
	             for (File file : files) {
	                 setSonList(file, parentDirectory, parentClass,mainPath, driver);
	             }
	         }
	         else {
	             String className = null;
	             try {
	                 if (rootFile.getPath().indexOf(".class") != -1 ) {
	                  
	                     className = rootFile.getPath().replace(mainPath, "").replace(".class", "").replace("\\", ".");
	                     System.err.println("Init page:"+parentClass.getPackage().getName()+"."+className);
	                     Class<?> classObject = Class.forName(parentClass.getPackage().getName()+"."+className);
	                     classObject.asSubclass(parentClass);
	                     PageFactory.initElements(driver, (Class<?>) classObject);
	                    
	                 }
	             } catch (ClassNotFoundException e) {
	                 System.err.println("Can't find " + className);
	             } catch (ClassCastException e) {
	                 System.err.println(className + " doesn't " + parentClass + " child");
	             }
	         }
	     } 
	
	public static void main(String[] args) {
		AbstractPage.initAllPages(new FirefoxDriver());
	}
	

}
