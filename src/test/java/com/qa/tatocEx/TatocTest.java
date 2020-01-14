package com.qa.tatocEx;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TatocTest {
	TatocImplement t = new TatocImplement();

	@BeforeClass
	public void testlaunchBrowser() {
		t.launchBrowser();
	}

	@Test
	public void testBasicCourse() throws InterruptedException {

		String u = t.basicCourse();
		Assert.assertEquals(u, "http://10.0.1.86/tatoc/basic/grid/gate");
	}

	@Test
	public void testClickOnGreenBox() {
		String s = t.ClickOnGreenBox();
		Assert.assertEquals(s, "http://10.0.1.86/tatoc/basic/frame/dungeon");
	}

}
