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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Book {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting11/Desktop/WebProject-main/WebProject-main/project/booking.html");
		Select se =new Select(driver.findElement(By.name("gender")));
		se.selectByIndex(2);
		WebElement checkboxSelect=driver.findElement(By.name("option2"));
		Boolean isSelect=checkboxSelect.isSelected();
		if(isSelect==false)
		{
			checkboxSelect.click();
		}
	}
	@Test(dataProvider="getData1")
	public void test(String fname, String lname, String address, String mail, String ph, String dob, String min, String max) {
		driver.findElement(By.id("Fname")).sendKeys(fname);
		driver.findElement(By.id("Lname")).sendKeys(lname);
		driver.findElement(By.id("Address")).sendKeys(address);
		driver.findElement(By.id("mail")).sendKeys(mail);
		driver.findElement(By.id("Phno")).sendKeys(ph);
		WebElement DOB=driver.findElement(By.id("DOB"));
		DOB.sendKeys(dob);
		driver.findElement(By.id("min")).sendKeys(min);
		driver.findElement(By.id("max")).sendKeys(max);
		driver.findElement(By.id("submit")).click();
		
	}
	
	@DataProvider
	public String[][] getData1() throws Exception {
		File src=new File("D:\\bookingpage.xlsx");
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
	public void booking() throws InterruptedException {
		Thread.sleep(2000);
	driver.quit();
	}
}
