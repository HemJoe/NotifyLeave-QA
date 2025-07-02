package org.accensportz;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class VBFextend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports valid = new ExtentReports();
		ExtentSparkReporter solid = new ExtentSparkReporter("santhos.html");
		valid.attachReporter(solid);
		
		valid.createTest("Test Registration","Player reegistration tested")
             .log(Status.FAIL, "Registration is not working properly")
             .assignCategory("smoke");
		
		valid.createTest("Test Create Team","Create Team tested")
        	 .log(Status.PASS, "Creation is working properly")
        	 .assignCategory("smoke");
		
		valid.createTest("Test Book tickets","Book tickets tested")
			 .log(Status.SKIP, "Booking tickets is working properly")
			 .assignCategory("sanity");
			
		valid.createTest("Test player selection","Player selection tested")
			 .log(Status.INFO, "selection functionality is working properly")
			 .assignCategory("sanity");
		
		valid.createTest("test result", "jfladlfsdflasldflaslf")
		     .log(Status.PASS, "dkjflaldjflkd")
		     .assignCategory("functional testing");
		
		valid.createTest("null", "null")
		     .log(Status.FAIL, "null")
		     .assignCategory("sanity");
		
		      
		
		    
		valid.flush();
	}

}
