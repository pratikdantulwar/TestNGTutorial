package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

	@AfterTest
	public void AfterExecution()
	{
		System.out.println("Will execute at last");
	}
	
	@Test(groups={"SMOKE"})
	public void Demo()
	{
		System.out.println("hello");
	}
	
	@Parameters({"URL"})
	@Test(groups={"SMOKE"})
	public void SecondDemo(String baseURL)
	{
		System.out.println("bye");
		System.out.println(baseURL);
			
	}
	
	@Test
	public void Login() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\pratikd\\eclipse-workspace\\TestNGTutorial\\src\\test\\dataDrive.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		
	}
	
}
