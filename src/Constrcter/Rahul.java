package Constrcter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Rahul {
	@BeforeClass()
	public void m1() {
		System.out.println("hi...");
	}
	@BeforeMethod()
	public void m2() {
		System.out.println("hi1....");
	}

}
