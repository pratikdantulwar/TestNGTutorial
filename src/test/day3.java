package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {
	
	@Test(dataProvider="getData")
	public void WebLoginCarloan(String username, String pwd)
	{
		System.out.println("weblogincar");
		System.out.println(username);
		System.out.println(pwd);
	}
	
	@Test(groups={"SMOKE"})
	public void MobileLoginCarloan()
	{
		System.out.println("mobilelogincar");		
	}
	
	@Test(dependsOnMethods={"MobileLoginCarloan"})
	public void APILoginCarloan()
	{
		System.out.println("apilogincar");		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//three data set of user id an pwd
		Object [][] data = new Object[3][2];
		
		//1st set
		data[0][0] = "firstUser";
		data[0][1] = "firstPwd";
		
		//2nd set
		data[1][0] = "SecondUser";
		data[1][1] = "SecondPwd";
		
		//3rd set
		data[2][0] = "ThirdUser";
		data[2][1] = "ThirdPwd";
		
		return data;
	}

}
