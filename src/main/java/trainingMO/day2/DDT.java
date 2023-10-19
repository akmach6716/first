package trainingMO.day2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DDT {
	WebDriver driver;
	@Test(dataProvider = "dpe1")
	public void test1(String username,String password)
	{	driver.findElement(By.name("email1")).sendKeys(username);
	driver.findElement(By.name("password1")).sendKeys(password);
	driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
	}
	@BeforeMethod
	public void setup()
	{	driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://freelance-learn-automation.vercel.app/login");	
	}	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	@DataProvider(name="dp1")
	public Object[][] getData()
	{
		Object [][] data=new Object[3][2];
		data[0][0]="row1col1";
		data[0][1]="row1col2";
		
		data[1][0]="row2col1";
		data[1][1]="row2col2";
		
		data[2][0]="row3col1";
		data[2][1]="row3col2";
		
		return data;
	}
	@DataProvider(name="dpe1")
	public Object[][] getDatafromExcel() throws IOException
	{ 	File src= new File("C:\\Users\\akmac\\git\\first\\first\\testData\\datademo.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet  sh1=wb.getSheet("Invalid Creds");
		int row=sh1.getPhysicalNumberOfRows();
		int col=sh1.getRow(0).getPhysicalNumberOfCells();		
		Object [][] arr=new Object[row][col];
		for(int i=0;i<row;i++)
		{ for (int j=0;j<col;j++)
			{//arr[i][j]=sh1.getRow(i).getCell(j).getStringCellValue();
			arr[i][j]=getanytypedata(wb, "Invalid Creds", i, j);
			}}return arr;
	}
	public String getanytypedata(XSSFWorkbook  book1,String sheetName, int row, int col )
	{
		XSSFCell  cell=book1.getSheet(sheetName).getRow(row).getCell(col);
		String data="";
		if (cell.getCellType()==CellType.STRING)
		{
			data=cell.getStringCellValue();
		}else if (cell.getCellType()==CellType.NUMERIC)
		{
			data=String.valueOf(cell.getNumericCellValue());
		}else if(cell.getCellType()==CellType.BOOLEAN)
		{
			data=String.valueOf(cell.getBooleanCellValue());
		}else if(cell.getCellType()==CellType.BLANK)
		{
			data="";
		}
		return data;
	}

}
