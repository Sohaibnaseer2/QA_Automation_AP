package com.apdr.testcases;

import com.apdr.utalities.DataUtils;
import org.testng.annotations.Test;

public class JsonTest {

	@Test(priority = 1, dataProviderClass = DataUtils.class, dataProvider = "videoDataProvider")
	public void checkJsonTestDataforvideo(String data) {
		String[] formInfo = data.split(",");
		System.out.println("Slug is : " + formInfo[0]);
		System.out.println("headline is : " + formInfo[1]);
		System.out.println("source is : " + formInfo[2]);
		System.out.println("Body is : " + formInfo[3]);

	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "audioDataProvider")
	public void checkJsonTestDataForAudio(String data) {
		String[] formInfo = data.split(",");
		System.out.println("Slug is : " + formInfo[0]);
		System.out.println("headline is : " + formInfo[1]);
		System.out.println("source is : " + formInfo[2]);
		System.out.println("Body is : " + formInfo[3]);

	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "adminCredentials")
	public void checkJsonTestDataForAdmin(String data) {
		String[] formInfo = data.split(",");
		System.out.println("Admin email is : " + formInfo[0]);
		System.out.println("Admin password is : " + formInfo[1]);
		System.out.println("Role is : " + formInfo[2]);
		System.out.println("Machine readable Name is : " + formInfo[3]);

	}
}
