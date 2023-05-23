package com.apdr.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.Importuserspage;
import com.apdr.pageobjects.Notifyimporteduserpage;
import com.apdr.setup.TestBase;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class Notifyusers extends TestBase {
		
		public Notifyusers(){
	        super();
	    }

	    HomePage homeObj;
	    Notifyimporteduserpage Notifyobj;
	    
	    @BeforeTest
        public void addContentInitialization(){

            homeObj= new HomePage();
            Notifyobj = new Notifyimporteduserpage();
            
        }

    	 @Test(priority = 1)
         @Description("Admin will click on the Import user tab ")
         @Feature("Import User")
         @Story("As a Admin I need to click the Import user tab")
         public void hover_Over_Import_Link() throws InterruptedException {

    		 Notifyobj.Click_Importusertab();
         }	


    	 @Test(priority = 2)
         @Description("Admin will click on the Notify imported user link ")
         @Feature("Notify User")
         @Story("As a Admin I need to click the Notify imported user link")
         public void hover_Over_Notify_Link() throws InterruptedException {

    		 Notifyobj.Click_Notify_user();
         }	

    	 
    	 
}
