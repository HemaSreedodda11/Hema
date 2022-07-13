package Framework;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class contactpage {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting11/Desktop/WebProject-main/WebProject-main/project/contact.html");
	}
	@Test(dataProvider="getData1")
	public void test(String fname, String lname, String mail, String mob, String msg) {
		driver.findElement(By.id( "fname")).sendKeys(fname);
		driver.findElement(By.id( "lname")).sendKeys(lname);
		
		driver.findElement(By.id( "mail")).sendKeys(mail);
		driver.findElement(By.id( "mobile")).sendKeys(mob);
		
		driver.findElement(By.id( "meg")).sendKeys(msg);
		
	driver.findElement(By.id( "send")).click();
		
	}
	
	@DataProvider
	public String[][] getData1() throws Exception {
		File src=new File("D:\\XL\\Contact.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int Rows=sheet.getPhysicalNumberOfRows();
		int cols=sheet.getRow(0).getLastCellNum();

		String[][] data=new String[Rows-1][cols];
		for(int i=0;i<Rows-1;i++)
		{
			for(int j=0;j<cols;j++)
			{
				DataFormatter df=new DataFormatter();
				data[i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j));

			}
			System.out.println();
		}
		wb.close();
		fis.close();
		return data;

	}


	@AfterMethod
	public void contact() throws InterruptedException {
		Thread.sleep(2000);
	driver.quit();
	}
}
