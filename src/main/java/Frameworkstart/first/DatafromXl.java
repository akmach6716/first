package Frameworkstart.first;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DatafromXl {
	public static void main(String[] args) throws IOException {	
FileInputStream fis= new FileInputStream(("C:\\Users\\akmac\\eclipse-workspace\\first\\src\\main\\java\\com\\resources\\datademo.xlsx"));
XSSFWorkbook wb= new XSSFWorkbook(fis);
int sheets =wb.getNumberOfSheets();
System.out.println("No of sheets are : "+sheets);
 int rows= wb.getSheetAt(0).getPhysicalNumberOfRows();
 int columns =wb.getSheetAt(0).getRow(0).getPhysicalNumberOfCells(); 
for(int i=0;i<rows;i++)
{
	for(int j=0;j<columns;j++)
	{
}



	}}}


