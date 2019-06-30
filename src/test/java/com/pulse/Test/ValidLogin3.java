package test.java.com.pulse.Test;
	import static org.testng.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//import com.relevantcodes.extentreports.LogStatus;

import main.java.com.pulse.Page.Author;
import main.java.com.pulse.Page.HomePage;
import main.java.com.pulse.Page.LoginPage;
import generic.BaseTest;
import generic.BasePage;
import generic.Excel;




//@Listeners(generic.RealGuru99TimeReport.class)


	public class ValidLogin3 extends BaseTest{

	public static String appURL = "https://www.facebook.com/";
		
		public static String appURL1 = "https://in.yahoo.com/";
		
		public static String appURL2 = "https://www.sabtv.com/en_in/";	
		
		public static String appURL3 = "https://economictimes.indiatimes.com/";
		
		
	static int teststepcount=000000;
	
	

	
	 static  Excel eLib = new Excel();
	
	public static String url = eLib.getCellValue(path,"PreCon", 1, 0);
	
	  public static String logfiletimestamp;
	    
		  
	public static	ITestResult result = null;

	
	   @Test
	   
	   //(retryAnalyzer=DynamicRetryAnalyzer.class)
	    public void TC5(Method method) throws Exception {
		   
		   
		   
		   
		   childTestnew.get().log(Status.INFO, "Running "+method.getName());
		   
	//	   childTestnew.get().assignCategory("smoke testing ");
		   
		   driver.navigate().to(appURL2);
		   
		   
		   childTestnew.get().log(Status.INFO, "Logged into "+appURL2);
		   
		   Thread.sleep(30000);
		   
		   
	/*        ExtentTestManager.getTest(getClass().getSimpleName()).log(LogStatus.PASS, "Log from threadId: " + Thread.currentThread().getId());
	        ExtentTestManager.getTest(getClass().getSimpleName()).log(LogStatus.INFO, "Log from threadId: " + Thread.currentThread().getId());
	        
       ExtentTestManager.getTest(getClass().getSimpleName()).log(LogStatus.PASS, "username is Typed ");
			
			
	        ExtentTestManager.getTest(getClass().getSimpleName()).log(LogStatus.INFO, "Snapshot below: ");
	        
	        
	        
	        Assert.assertEquals(ExtentTestManager.getTest().getRunStatus(), LogStatus.PASS);
	*/

        driver.quit();
	    }
	
	   

	   @Test
	   
	   //(retryAnalyzer=DynamicRetryAnalyzer.class)
	    public void TC6(Method method) throws Exception {
		   
		   
		   
		   driver.navigate().to(appURL2);
		   childTestnew.get().log(Status.INFO, "Running "+method.getName());
		   

			 
		   String actualTitle = driver.getTitle();
		   String expectedTitle = "SAB TV";
		   assertEquals(actualTitle,expectedTitle);
	//	   childTestnew.get().assignCategory("smoke testing ");
			
		   
		   childTestnew.get().log(Status.INFO, "Verifying Title "+appURL2);
		   
		   
		   
		   
		   
/*	        ExtentTestManager.getTest(getClass().getSimpleName()).log(LogStatus.PASS, "Log from threadId: " + Thread.currentThread().getId());
	        ExtentTestManager.getTest(getClass().getSimpleName()).log(LogStatus.INFO, "Log from threadId: " + Thread.currentThread().getId());
	        
       ExtentTestManager.getTest(getClass().getSimpleName()).log(LogStatus.PASS, "username is Typed ");
			
			
	        ExtentTestManager.getTest(getClass().getSimpleName()).log(LogStatus.INFO, "Snapshot below: ");
	        
	        
	        Assert.assertEquals(ExtentTestManager.getTest().getRunStatus(), LogStatus.PASS);
	*/
	        
        driver.quit();
		   
		   
	    }
	
	
	}
	
	/*
	
	@Test
		public void testValidLogin3() throws Exception
		
		{
		
		
		
		driver.navigate().to(url);

			
			 Randomaplphanumber R=new Randomaplphanumber();
			  
		String r=  R.Random();
			
				String un=Excel.getCellValue(XLPATH,"ValidLogin",3,0);
				String pw=Excel.getCellValue(XLPATH,"ValidLogin",3,1);
				String accnt=Excel.getCellValue(XLPATH,"ValidLogin",3,2);
	
				String cb=Excel.getCellValue(XLPATH,"Author",1,3);
				
				

				

				LoginPage l=new LoginPage(driver);
				

				
				BasePage b=new BasePage(driver);
				

				
				
	//			APP_LOGS.info("type username");
				
				
				//		l.setUserName(un);
						
						
						driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys(un);;
						
		//				extentTest.log(Status.PASS, "username is Typed ");
						
						
		//				extentTest.log(Status.INFO, "Snapshot below: ");
						
				//        r= BaseTest.getScreenshot(driver, method.getName());
							
							
				//			extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(r));
					
						
						
						
						
						
					//	getScreenshot(driver, method.getName());
						

//		        r= BaseTest.getScreenshot(driver, method.getName());

			
	//		APP_LOGS.info("type password");
				 
				 
				l.setPassword(pw);
				
				Thread.sleep(5000);
				
	//			extentTest.log(Status.PASS, "Password is Typed ");
				
				
	//			extentTest.log(Status.INFO, "Snapshot below: ");

//		        r= BaseTest.getScreenshot(driver, method.getName());
					
					

			
	//			APP_LOGS.info("click select");
				
				l.clickLogin();
				
				Thread.sleep(25000);
				
				
			//	extentTest.log(Status.PASS, "Login is clicked");
				
				
	//			extentTest.log(Status.INFO, "Snapshot below: ");
				
				
	

				
				
				l.dropdowntheaccount(accnt);
				Thread.sleep(25000);
	
					

				
				
	
				
		//        r= BaseTest.getScreenshot(driver, method.getName());
					
					
			//		extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(r));
			
				
				
				
				
	//			getScreenshot(driver, method.getName());
				
					
	//		    r= BaseTest.getScreenshot(driver, method.getName());
						

	//			APP_LOGS.info("click select");
				
		
				l.clickselect();
				Thread.sleep(5000);
				
				


			
				HomePage h=new HomePage(driver);
				
			
			
				  driver.close();

					
				   ExtentTestManager.getTest().log(LogStatus.PASS, "Log from threadId: " + Thread.currentThread().getId());
			        ExtentTestManager.getTest().log(LogStatus.INFO, "Log from threadId: " + Thread.currentThread().getId());
			        Assert.assertEquals(ExtentTestManager.getTest().getRunStatus(), LogStatus.PASS);
			

//				APP_LOGS.info("click arrrow down");
				
	//			h.Logout();
				
//			APP_LOGS.info("click logout");
		}

	
	@Test
	public void testValidLogin4() throws Exception
	
	{
		
	
	driver.navigate().to(url);


		
	//	driver.get(url);
		
		 Randomaplphanumber R=new Randomaplphanumber();
		  
	String r=  R.Random();
		
			String un=Excel.getCellValue(XLPATH,"ValidLogin",4,0);
			String pw=Excel.getCellValue(XLPATH,"ValidLogin",4,1);
			String accnt=Excel.getCellValue(XLPATH,"ValidLogin",4,2);

			String cb=Excel.getCellValue(XLPATH,"Author",1,3);
			
			
		
	
//	Logger APP_LOGS = Logger.getLogger(ValidLogin2.class);
			

			LoginPage l=new LoginPage(driver);
			

			
			BasePage b=new BasePage(driver);
			

			
			
//			APP_LOGS.info("type username");
			
			
			//		l.setUserName(un);
					
					
					driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys(un);;
					
	//				extentTest.log(Status.PASS, "username is Typed ");
					
					
		//			extentTest.log(Status.INFO, "Snapshot below: ");
					
		//	        r= BaseTest.getScreenshot(driver, method.getName());
						
						
			//			extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(r));
				
					
					
					
					
					
				//	getScreenshot(driver, method.getName());
					

//	        r= BaseTest.getScreenshot(driver, method.getName());

		
//		APP_LOGS.info("type password");
			 
			 
			l.setPassword(pw);
			
			Thread.sleep(5000);
			
		//	extentTest.log(Status.PASS, "Password is Typed ");
			
			
	//		extentTest.log(Status.INFO, "Snapshot below: ");

//	        r= BaseTest.getScreenshot(driver, method.getName());
				
				

		
//			APP_LOGS.info("click select");
			
			l.clickLogin();
			
			Thread.sleep(25000);
			
			
	//		extentTest.log(Status.PASS, "Login is clicked");
			
			
	//		extentTest.log(Status.INFO, "Snapshot below: ");
			
			

			
//	        r= BaseTest.getScreenshot(driver, method.getName());
				

//			APP_LOGS.info("click dropdown ");
			
			
			
			l.dropdowntheaccount(accnt);
			Thread.sleep(5000);

				
	//		extentTest.log(Status.PASS, "dropdown is clicked");
			
			
	//		extentTest.log(Status.INFO, "Snapshot below: ");
			
			

			
	//        r= BaseTest.getScreenshot(driver, method.getName());
				
				
		//		extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(r));
		
			
			
			
			
			
		//	getScreenshot(driver, method.getName());
			
				
//		    r= BaseTest.getScreenshot(driver, method.getName());
					

//			APP_LOGS.info("click select");
			
	
			l.clickselect();
			Thread.sleep(5000);
			
			
	//		extentTest.log(Status.PASS, "Select is clicked");
			
			
	//		extentTest.log(Status.INFO, "Snapshot below: ");
			
//			r = BaseTest.getScreenshot(driver, method.getName());

		
			HomePage h=new HomePage(driver);
		
			
			//  extent.flush();
			  driver.close();
			   
				
			   ExtentTestManager.getTest().log(LogStatus.PASS, "Log from threadId: " + Thread.currentThread().getId());
		        ExtentTestManager.getTest().log(LogStatus.INFO, "Log from threadId: " + Thread.currentThread().getId());
		        Assert.assertEquals(ExtentTestManager.getTest().getRunStatus(), LogStatus.PASS);
		
  
		
	}
	  
*/









