package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups={"SMOKE"})
	public void ThirdDemo()
	{
		System.out.println("good");
	}
	
	@BeforeTest
	public void PreRequisite()
	{
		System.out.println("will execute first");
	}
}
