package baiscs;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppiumTest {

	@Test
	public void mobilebrowserchrome()
	{
		System.out.println("mobilebrowserchrome");
	}
	@Test
	public void mobilebrowserfirefox()
	{
		System.out.println("mobilebrowserfirefox");
	}
	@Test
    public void mobilebrowserinternetexplorer()
    {
		System.out.println("mobilebrowserinternetexplorer");
		System.out.println("mobile1browserinternetexplorer");
		System.out.println("mobile2browserinternetexplorer");
		System.out.println("mobile3browserinternetexplorer");
		System.out.println("mobile4browserinternetexplorer");
		System.out.println("mobile5browserinternetexplorer");
		System.out.println("mobile6browserinternetexplorer");
		System.out.println("mobile7browserinternetexplorer");
		System.out.println("mobile8browserinternetexplorer");
		System.out.println("mobile9browserinternetexplorer");
		System.out.println("mobile20browserinternetexplorer");
		System.out.println("mobile12browserinternetexplorer");
    }
	@Test
	public void web() 
	{
		System.out.println("web");
	}
	@Test
	public void web1()
	{
		System.out.println("hello github");
	}
	@AfterTest
	public void aftets() 
	{
		System.out.println("aftretest");
	}
	@BeforeTest
	public void bftest()
	{
		System.out.println("beforetest");
	}
}

