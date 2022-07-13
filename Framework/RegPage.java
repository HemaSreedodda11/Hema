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

public class RegPage {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting11/Desktop/WebProject-main/WebProject-main/project/register.html");
		WebElement radioboxSelect=driver.findElement(By.id("girl"));
		Boolean isSelect=radioboxSelect.isSelected();
		if(isSelect==false)
		{
		radioboxSelect.click();
		}
	}
	@Test(dataProvider="getData1")
	public void test(String name, String uname, String mail, String ph, String pass, String compass) {
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("mail")).sendKeys(mail);
		driver.findElement(By.id("phone")).sendKeys(ph);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("compass")).sendKeys(compass);
		driver.findElement(By.id("register")).click();
		
	}
	
	@DataProvider
	public String[][] getData1() throws Exception {
		File src=new File("D:\\XL\\register.xlsx");
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
	public void Register() throws InterruptedException {
		Thread.sleep(2000);
	driver.quit();
	}
}
