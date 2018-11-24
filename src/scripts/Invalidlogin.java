package scripts;

import org.testng.annotations.Test;

import POM.Loginpage;
import POM.Signuppage;
import generic.Base_test;

public class Invalidlogin extends Base_test {
	@Test
	public void invalid()
	{
		Signuppage s=new Signuppage(driver);
		s.signupbtn();
		
		Loginpage l=new Loginpage(driver);
		l.manubutton();
		l.loginbtn();
	}

}
