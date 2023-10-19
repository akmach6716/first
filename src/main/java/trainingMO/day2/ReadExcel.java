package trainingMO.day2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class ReadExcel {
    @Test
	public void readDatafromExcel() throws IOException
	{		File src =new File("C:\\Users\\akmac\\git\\first\\first\\testData\\datademo.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheet("Invalid Creds");
System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());

	}
	
}
