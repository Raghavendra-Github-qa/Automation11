package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import generic.BaseTest;
	
	public class TestDemo extends BaseTest{
		
		@Test
		public void testA() {
			Reporter.log("TestA...",true);
		}
		
		@Test
		public void testB() {
			Reporter.log("TestB...",true);
			Assert.fail();
		}
		
		@Test
		public void testC() {
			Reporter.log("TestC...",true);
		}

	}