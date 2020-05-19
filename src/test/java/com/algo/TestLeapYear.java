package com.algo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestLeapYear {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		Check_Leap_Year ch = new Check_Leap_Year();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void testLeapYearDivisibleBy4000ForPostiveValue() {
		try {
			Check_Leap_Year ch = new Check_Leap_Year();
			boolean flag =ch.checkLeapYear(20000);
			assertTrue(flag,"Leap Year");
				
		} catch (Exception e) {
			fail("Not a leap year");
		}
		
	}
	@Test
	void testLeapYearDivisibleBy4000ForNegativeValue() {
		try {
			Check_Leap_Year ch = new Check_Leap_Year();
			boolean flag =ch.checkLeapYear(20005);
			assertFalse(flag,"Leap Year");
				
		} catch (Exception e) {
			fail("Not a leap year");
		}
		
	}

	@Test
	void testLeapYearDivisibleBy400ForPostiveValue() {
		try {
			Check_Leap_Year ch = new Check_Leap_Year();
			boolean flag =ch.checkLeapYear(2000);
			assertTrue(flag,"Leap Year");
				
		} catch (Exception e) {
			fail("Not a leap year");
		}
		
	}
	@Test
	void testLeapYearDivisibleBy400ForNegativeIveValue() {
		try {
			Check_Leap_Year ch = new Check_Leap_Year();
			boolean flag =ch.checkLeapYear(2005);
			assertFalse(flag,"Not a Leap Year");
				
		} catch (Exception e) {
			fail("Not a leap year");
		}
		
	}
	@Test
	void testLeapYearIFNotDivisibleBy400ThenWhetherDivsibleBy100() {
		try {
			Check_Leap_Year ch = new Check_Leap_Year();
			
			boolean flag =ch.checkLeapYear(2100);
			assertTrue(flag,"Not a Leap Year");
			}
				
		 catch (Exception e) {
			fail("Not a leap year");
		}
		
	}
	@Test
	void testLeapYearIFNotDivisibleBy400NotDivsibleBy100whetherDivisibleBy4() {
		try {
			Check_Leap_Year ch = new Check_Leap_Year();
			
			boolean flag =ch.checkLeapYear(20);
			assertTrue(flag,"A Leap Year");
			}
				
		 catch (Exception e) {
			fail("Not a leap year");
		}
		
	}
	


}