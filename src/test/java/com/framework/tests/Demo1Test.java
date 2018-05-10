package com.framework.tests;

import org.testng.annotations.Test;

public class Demo1Test 
{
	
@Test
public void create()
{
	
	System.out.println("user created");
	String browser=System.getProperty("browser");
	String url=System.getProperty("url");
	System.out.println("browser...."+browser);
	System.out.println("url ...."+url);
}
}
