package helloWorldPackage;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class HelloWorld_Test {
	
	@Test
	public void testOne()
	{
		String className = this.getClass().getName();
		System.out.println("Classname is: " +className);
		Assert.assertEquals("helloWorldPackage.HelloWorld_Test", this.getClass().getName());
	}

}
