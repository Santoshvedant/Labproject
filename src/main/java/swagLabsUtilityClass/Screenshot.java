package swagLabsUtilityClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	
	public static void getScreenshot(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;		
		File  sourceFile = ts.getScreenshotAs(OutputType.FILE);  
		File desti=new File("\\C:\\Screenshot\\"+name+".jpg");
		FileHandler.copy(sourceFile, desti);
}
}