package org.base;
    import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.HashMap;
	import java.util.Hashtable;
	import java.util.List;
	import java.util.Map;
	import java.util.Set;

	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
	import org.value.LoginData;
import org.value.QaValue;
import org.value.ValueNaukri;
	import org.value.Valuehotel;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Utility {
		public static WebDriver driver;
		public static Actions action;
		public static Robot robot;
		public static Alert alert;
		public static Select select;
		public static JavascriptExecutor js;
		public static WebElement element;
		public static String parentID;
		public static Sheet sheet;
		public static Workbook book;

		public static void lanchChrome() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		public static void maximize() {
			driver.manage().window().maximize();

		}

		public static void manimize() {

			driver.manage().window().minimize();

		}

		public static void implicity() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		public static void url(String url) {

			driver.get(url);

		}

		public static void title(WebDriver driver) {
			driver.getTitle();
		}

		public static void currentUrl(WebDriver driver) {
			driver.getCurrentUrl();
		}

		public static void close(WebDriver driver) {
			driver.close();
		}

		public static void quit(WebDriver driver) {
			driver.quit();
		}

		public static void navigate(WebDriver driver, String url) {
			driver.navigate().to(url);
		}

		public static void refresh(WebDriver driver) {
			driver.navigate().refresh();
		}

		public static void back(WebDriver driver) {
			driver.navigate().back();
		}

		public static void sendkeys(WebElement element, String name) {
			element.sendKeys(name);
		}

		public static void sendkeysEnter(WebElement element) {
			element.sendKeys(Keys.ENTER);
		}

		public static void clikButton(WebElement element) {
			element.click();
		}

		public static void getText(WebElement element) {
			element.getText();
			
		}

		public static void getAttributes(WebElement element, String value) {
			element.getAttribute(value);
		}

		public static void getsize(WebElement element) {
			element.getSize();
		}

		public static void parentWindow() {
			parentID = driver.getWindowHandle();
		}

		public static void childwindows() {
			String parentID = driver.getWindowHandle();
			Set<String> allID = driver.getWindowHandles();
			for (String childID : allID) {
				if (!parentID.equals(allID)) {
					driver.switchTo().window(childID);
				}
			}
		}

		public static void backToWindow() {
			driver.switchTo().window(parentID);
		}

		public static void screenShot(String name) throws IOException {
			TakesScreenshot t = (TakesScreenshot) driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\viji testing\\java\\java dev\\Demo\\screenshot" + name + ".png");
			FileUtils.copyFile(src, des);
		}

		public static void rightclick(WebElement element, Actions action) {
			action = new Actions(driver);
			action.contextClick().perform();
		}

		public static void doubleclick(WebElement element, Actions action) {
			action = new Actions(driver);
			action.doubleClick(element).perform();
		}

		public static void moveTo(WebElement element, Actions action) {
			action = new Actions(driver);
			action.moveToElement(element).perform();
		}

		public static void DragAndDrop(WebElement source, WebElement destination, Actions action) {
			action = new Actions(driver);
			action.dragAndDrop(source, destination).perform();
		}

		public static void actionSendKeys(String name, Actions action) {
			action = new Actions(driver);
			action.sendKeys(name).perform();
		}

		public static void actionClick(Actions action) {
			action = new Actions(driver);
			action.click().perform();
		}

		public static void keyDown(WebElement element) throws AWTException {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}

		public static void keyUp(Robot robot) throws AWTException {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_UP);
			robot.keyRelease(KeyEvent.VK_UP);
		}

		public static void keyEnter(WebElement element) throws AWTException {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}

		public static void keytab(Robot robot) throws AWTException {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		}

		public static void selectAll(Robot robot) throws AWTException {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}

		public static void copy(Robot robot) throws AWTException {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}

		public static void paste(Robot robot) throws AWTException {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}

		public static void cut(Robot robot) throws AWTException {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_X);
			robot.keyRelease(KeyEvent.VK_X);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}

		public static void alertAccept(Alert alert) {
			alert = driver.switchTo().alert();
			alert.accept();
		}

		public static void alertDismiss(Alert alert) {
			alert = driver.switchTo().alert();
			alert.dismiss();
		}

		public static void alertSendkeys(Alert alert, String name) {
			alert = driver.switchTo().alert();
			alert.sendKeys(name);
		}

		public static void alerttext(Alert alert) {
			alert = driver.switchTo().alert();
			System.out.println(alert.getText());
		}

		public static void getOption(WebElement element) {
			select = new Select(element);
			select.getOptions();
		}

		public static void getAllSelect(WebElement element) {
			select = new Select(element);
			select.getAllSelectedOptions();
		}

		public static void deSelectAll(WebElement element) {
			select = new Select(element);
			select.deselectAll();
		}

		public static void selectByvalue(WebElement element, String value) {
			select = new Select(element);
			select.selectByValue(value);
		}

		public static void selectByIndex(WebElement element, Integer num) {
			select = new Select(element);
			select.selectByIndex(num);
		}

		public static void selectByVisibletext(WebElement element, String text) {
			select = new Select(element);
			select.selectByVisibleText(text);
			;
		}

		public static void jsclick(JavascriptExecutor js, WebElement element) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", element);
		}

		public static void jsSendkeys(JavascriptExecutor js, WebElement element, String name) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','name')", element);
		}

		public static void jsgetAttribute(JavascriptExecutor js, WebElement element) {
			js = (JavascriptExecutor) driver;
			js.executeScript("return arguments[0].getAttribute('value')", element);
		}

		public static void jsScrollDown(JavascriptExecutor js, WebElement element) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);
		}

		public static void jsScrollUp(JavascriptExecutor js, WebElement element) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false)", element);
		}

		public static void frameWebElement(WebDriver driver, WebElement element) {

			driver.switchTo().frame(element);
		}
		

		public static String readExcel(String name2, int rowNo, int cellNo) throws IOException {
			File f = new File("C:\\viji testing\\java\\java dev\\DemD2Ma\\xlsheet\\DataDriven.xlsx");
			FileInputStream fi = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(fi);
			Sheet sheet = book.getSheet(name2);

			Row allrow = sheet.getRow(rowNo);

			Cell data = allrow.getCell(cellNo);
			int type = data.getCellType();
			String value = "";
			if (type == 1) {
				value = data.getStringCellValue();

			} else if (DateUtil.isCellDateFormatted(data)) {
				Date date = data.getDateCellValue();
				SimpleDateFormat s = new SimpleDateFormat("dd,MM,yyyy");
				value = s.format(date);

			} else {
				double d = data.getNumericCellValue();
				long l = (long) d;
				value = String.valueOf(l);

			}
			return value;
		}

		public static void createRow(String name, int rowNo, int cellNo, String name1, String name2) throws IOException {
			File f = new File("C:\\viji testing\\java\\java dev\\DemD2Ma\\xlsheet\\DataDriven.xlsx");
			FileInputStream fi = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(fi);
			Sheet sheet = book.getSheet(name);
			Row newRow = sheet.createRow(rowNo);
			Cell cell1 = newRow.createCell(cellNo);
			cell1.setCellValue(name1);
			Cell cell2 = newRow.createCell(cellNo);
			cell2.setCellValue(name2);
			FileOutputStream fo = new FileOutputStream(f);
			book.write(fo);

		}
	//file new
		private static File fileObject;

		public static void filePath(String fname, String name) throws IOException {
			fileObject = new File("C:\\viji testing\\java\\java dev\\DemD2Ma\\xlsheet\\" + fname + ".xlsx");

			book = new XSSFWorkbook();
			sheet = book.createSheet(name);

		}

		private static List<String> col = new ArrayList<String>();

		public static void writeRow(int rowNum, List<String> col) throws IOException {
			Row row = sheet.createRow(rowNum);
			writeCell(row, col);
		}

		public static void writeFile() throws IOException {
			FileOutputStream fo = new FileOutputStream(fileObject);
			book.write(fo);
			fo.close();

		}

		public static void writeCell(Row r, List<String> col) throws IOException {
			int i = 0;
			for (String v : col) {
				r.createCell(i).setCellValue(v);
				i++;
			}
		}
	//file new hash
		private static Hashtable<String, String> ht = new Hashtable<String, String>();

		public static void writeObject(String key, String value) {
			// Map<Integer,List<String>> m = new HashMap <Integer,List<String>> ();
			ht.put(key, value);
		}

		public static void writeData() throws IOException {
			int i = 1;
			Row row = sheet.createRow(0);
			row.createCell(0).setCellValue("Key");
			row.createCell(1).setCellValue("Value");

			for (Map.Entry<String, String> e : ht.entrySet()) {
				row = sheet.createRow(i);
				row.createCell(0).setCellValue(e.getKey());
				row.createCell(1).setCellValue(e.getValue());
				i++;
			}

		}

		public static Hashtable readHashSheet(String fname, String name) throws IOException {
			Hashtable<String, String> ht = new Hashtable<String, String>();
			File f = new File("C:\\viji testing\\java\\java dev\\DemD2Ma\\xlsheet\\" + fname + ".xlsx");
			FileInputStream fi = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(fi);
			Sheet sheet = book.getSheet(name);
			for (Row row : sheet) {
				if (!ht.containsKey(row.getCell(0))) {
					Cell data = row.getCell(1);
					int type = data.getCellType();
					String value = "";
					if (type == 1) {

						ht.put(row.getCell(0).toString(), data.getStringCellValue());
					} else if (DateUtil.isCellDateFormatted(data)) {
						Date date = data.getDateCellValue();
						SimpleDateFormat s = new SimpleDateFormat("dd,MM,yyyy");
						ht.put(row.getCell(0).toString(),s.format(date));
					} else {
						double d = data.getNumericCellValue();
						long l = (long) d;

						ht.put(row.getCell(0).toString(), String.valueOf(l));
					}

				}
			}
			fi.close();
			return ht;
		}
		
		// Read excel file Data for facebook
		public static List<LoginData> ReadFile(String fileName,String sheetName) throws IOException {
			List<LoginData> loginDataList = new ArrayList<LoginData>();		
			
			File file = new File("C:\\viji testing\\java\\java dev\\DemD2Ma\\xlsheet\\" + fileName + ".xlsx");

			FileInputStream fi = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(fi);
			Sheet sheet = book.getSheet(sheetName);
			
			for (Row row : sheet) {	
				
					LoginData loginData= new LoginData();
					
					Cell data0 = row.getCell(0);				
					loginData.setLoginName(getCellData(data0));
					
					Cell data1 = row.getCell(1);
					loginData.setPassword(getCellData(data1));
					
					loginDataList.add(loginData);			
			}
			
			fi.close();
			
			return loginDataList;
			
		}
		
		
		private static String getCellData(Cell data) {
			
			int type = data.getCellType();
			String value = "";
			if (type == 1) {
				value = data.getStringCellValue();			
			} else if (DateUtil.isCellDateFormatted(data)) {
				Date date = data.getDateCellValue();
				SimpleDateFormat s = new SimpleDateFormat("dd,MM,yyyy");
				 value = s.format(date);
			} else {
				double d = data.getNumericCellValue();
				long l = (long) d;
				value = String.valueOf(l);
			}
			return value;
		}
	//login for read hotel
		
			public static List<Valuehotel> readHotel(String fileName,String sheetName) throws IOException {
				List<Valuehotel> loginDataList = new ArrayList<Valuehotel>();		
				
				File file = new File("C:\\viji testing\\java\\java dev\\DemD2Ma\\xlsheet\\" + fileName + ".xlsx");

				FileInputStream fi = new FileInputStream(file);
				Workbook book = new XSSFWorkbook(fi);
				Sheet sheet = book.getSheet(sheetName);
				boolean isFirstRow=false;
				for (Row row : sheet) {		
					if(isFirstRow) {
					Valuehotel login= new Valuehotel();
						
						Cell data0 = row.getCell(0);				
						login.setUsername(getCellData(data0));
						
						Cell data1 = row.getCell(1);
						login.setPassword(getCellData(data1));
						
						Cell data2=row.getCell(2);
						login.setLocation(getCellData(data2));
						
						Cell data3=row.getCell(3);
						login.setHotel(getCellData(data3));
					
						Cell data4=row.getCell(4);
						login.setRoomType(getCellData(data4));
						
						Cell data5=row.getCell(5);
						login.setNumOfRoom(getCellData(data5));
						
						Cell data6=row.getCell(6);
						login.setCheckindate(getCellData(data6));
						
						Cell data7=row.getCell(7);
						login.setOutdate(getCellData(data7));
						
						Cell data8=row.getCell(8);
						login.setAdultperRoom(getCellData(data8));
						
						Cell data9=row.getCell(9);
						login.setChildPerRoom(getCellData(data9));
						
						Cell data10=row.getCell(10);
						login.setFirstname(getCellData(data10));
						
						Cell data11=row.getCell(11);
						login.setLastname(getCellData(data11));
						
						Cell data12=row.getCell(12);
						login.setBillingAddress(getCellData(data12));
						
						Cell data13=row.getCell(13);
						login.setCreditcardnumber(getCellData(data13));
						
						Cell data14=row.getCell(14);
						login.setCreditcardType(getCellData(data14));
						
						Cell data15=row.getCell(15);
						login.setExpMonth(getCellData(data15));
						
						Cell data16=row.getCell(16);
						login.setExpYear(getCellData(data16));
						
						Cell data17=row.getCell(17);
						login.setCvv(getCellData(data17));
						
						loginDataList.add(login);
						
					}
					else {
						isFirstRow=true;
					}
				}
				
				fi.close();
				
				return loginDataList;
				
		}
	//value for naukri
			public static List<ValueNaukri> readNaukri(String fileName,String sheetName) throws IOException {
				List<ValueNaukri> loginList = new ArrayList<ValueNaukri>();		
				
				File file = new File("C:\\viji testing\\java\\java dev\\DemD2Ma\\xlsheet\\" + fileName + ".xlsx");

				FileInputStream fi = new FileInputStream(file);
				Workbook book = new XSSFWorkbook(fi);
				Sheet sheet = book.getSheet(sheetName);
				boolean isFirstRow=false;
				for (Row row : sheet) {	
					if(isFirstRow) {
					ValueNaukri login= new ValueNaukri();
						
						Cell data0 = row.getCell(0);				
						login.setFullName(getCellData(data0));
						
						Cell data1 = row.getCell(1);
						login.setEmail(getCellData(data1));
						
						Cell data2=row.getCell(2);
						login.setPassWord(getCellData(data2));
						
						Cell data3=row.getCell(3);
						login.setMobile(getCellData(data3));
						
						loginList.add(login);	
					}else {
						isFirstRow=true;
					}
				}
				
				fi.close();
				
				return loginList;
				
			}
			
			//Qa form read
			public static  List<QaValue> readQa(String fileName,String sheetName) throws IOException {
				List<QaValue> loginDataList = new ArrayList<QaValue>();		
				
				File file = new File("C:\\viji testing\\java\\java dev\\DemD2Ma\\xlsheet\\" + fileName + ".xlsx");

				FileInputStream fi = new FileInputStream(file);
				Workbook book = new XSSFWorkbook(fi);
				Sheet sheet = book.getSheet(sheetName);
				boolean isFirstRow=false;
				for (Row row : sheet) {		
					if(isFirstRow) {
					QaValue login= new QaValue();
						
						Cell data0 = row.getCell(0);				
						login.setFirstName(getCellData(data0));
						
						Cell data1 = row.getCell(1);
						login.setLastname(getCellData(data1));
						
						Cell data2=row.getCell(2);
						login.setAddress(getCellData(data2));
						
						Cell data3=row.getCell(3);
						login.setEmail(getCellData(data3));
					
						
						
						Cell data4=row.getCell(4);
						login.setPhone(getCellData(data4));
						
						Cell data5=row.getCell(5);
						login.setGender(getCellData(data5));
						
						Cell data6=row.getCell(6);
						login.setHobbies(getCellData(data6));
						
						Cell data7=row.getCell(7);
						login.setLang(getCellData(data7));
						
						Cell data8=row.getCell(8);
						login.setSkill(getCellData(data8));
						
						Cell data9=row.getCell(9);
						login.setCountry(getCellData(data9));
						
						Cell data10=row.getCell(10);
						login.setYear(getCellData(data10));
						
						Cell data11=row.getCell(11);
						login.setMonth(getCellData(data11));
						
						Cell data12=row.getCell(12);
						login.setDate(getCellData(data12));
						
						Cell data13=row.getCell(13);
						login.setPassword(getCellData(data13));
						Cell data14=row.getCell(14);
						login.setCpassword(getCellData(data14));
						
						loginDataList.add(login);
					}
					else {
						isFirstRow=true;
					}
				}
				
				fi.close();
				
				return loginDataList;
				
		}
	}


