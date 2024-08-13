package Framework;

import org.testng.annotations.Test;

public class TestNGEx {

	@Test
	public void createContact()
	{
		System.out.println("Contact is created");
	}
	
	@Test(invocationCount = 2)
	public void modifyContact()
	{
		System.out.println("Contact is modified");
	}
	
	@Test(dependsOnMethods = "createContact")
	public void deleteContact()
	{
		System.out.println("Contact is deleted");
	}
}
