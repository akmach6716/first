package Frameworkstart.first;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.TestComponents.BaseTest;
public class ErrorValidations extends BaseTest {
	@Test(dataProvider = "getDatafromjson")
public void loginwithInvalid( HashMap<String, String>    input)
{	lp.loginApplication(input.get("email"), input.get("pass"));
	String actualerrormessage= lp.getErrormsg(); 	String expectedErrormessage="Incorrect email or password.";
	AssertJUnit.assertEquals(actualerrormessage, expectedErrormessage);
}
@DataProvider
public Object[][] getData()
{
	return new Object[][] {{"aditya.kumar@gmail.com123", "Password@1235"} ,{"aditya.kumar@gmail.com129", "Password@1239"}};
}
@DataProvider
public Object[][] getDatafromHashMap()
{
	HashMap<String, String> map1= new HashMap<String, String>();
	map1.put("email", "aditya.kumar@gmail.commap1");
	map1.put("pass", "Password@123map1");
	HashMap<String, String> map2= new HashMap<String, String>();
	map2.put("email", "aditya.kumar@gmail.commap2");
	map2.put("pass", "Password@123map2");

	return new Object[][] {{map1},{map2}};
}


@DataProvider
public Object[][] getDatafromjson() throws IOException
{

	List<HashMap<String, String>> data=getJsonData();
	return new Object[][] {{data.get(0)},{data.get(1)}};
}


}
