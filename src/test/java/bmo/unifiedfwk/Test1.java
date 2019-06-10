package bmo.unifiedfwk;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
		
	Tes tst;	
	@BeforeMethod(alwaysRun = true)
	@Parameters({ "param" })
	public void tester(String aName) {
		 tst = new Tes();
		tst.setVariable1(aName);
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void tester2() {
		
		System.out.println("@AfterMethod::" +tst.getVariable1());
	}
	
	
	@Test
	public void login() {
		new AppTest().testingyesting();
	}

}
