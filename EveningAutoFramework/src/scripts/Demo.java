package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void createUser() {
		Assert.assertTrue(false, "Intentionally failed this createuser method.");
	}
	@Test(dependsOnMethods="createUser")
	public void deleteUser() {
		//System.out.println("delete user method is skipeed..");
	}

}
