package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eTitle;

public class Staff_Test {

	static ArrayList<Staff> staff = new ArrayList<Staff>();

	public static Date setDate(int month, int day, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day);
		return cal.getTime();
	}
 
	@BeforeClass
	public static void setup() throws PersonException {
		
		staff.add(new Staff("Youssef", "Hany", "Aly", setDate(3, 14, 1998), "Marldale Drive", "(302)-563-0455","youssefaly14@gmail.com", " 7:00-9:00am", 1, 155000, setDate(04, 7, 2012), eTitle.MR));
		staff.add(new Staff("Lionel", "Andres", "Messi", setDate(6, 24, 1987), "Argentina Drive", "(55)-254-0211","thegoat@gmail.com", " 10:00-11:00am", 1, 175000, setDate(10, 15, 2006), eTitle.MR));
		staff.add(new Staff("Daryl", "Datboi", "Dixon", setDate(3, 17, 1982), "Dead Drive", "(104)-186-9288","dixhead@gmail.com", " 10:00-12:00am", 1, 80000, setDate(5, 23, 2011), eTitle.MR));
		staff.add(new Staff("Tina", "Elizabeth", "Fey", setDate(5, 18, 1970), "30 Drive", "(320)-232-7486","feythere@gmail.com", " 1:00-5:00pm", 1, 66000, setDate(2, 18, 2014), eTitle.MS));
		staff.add(new Staff("Maury", "Savage", "Povich", setDate(3, 12, 1955), "Homie Drive", "(420)-069-7899","youarenotfather@gmail.com", " 2:00-6:00pm", 1, 120000, setDate(9, 8, 1997), eTitle.MR));
	}
	@Test
	public void testStaffSalary() throws PersonException {
		double sum = 0;
		for (Staff avg : staff) {
			sum += avg.getSalary();
		}
		double average = sum / staff.size();
		assertEquals(average, 119200, .01);
	}

	@Test(expected = PersonException.class)
	public void testPhoneNumberException() throws PersonException {
		new Staff("Gordon", "Spicy", "Ramsey", setDate(5, 13,1962), "Kitchen Drive", "3040868725","gordyrawww@gmail.com", " 10:00-11:00am", 2, 75000, setDate(1992, 4, 10), eTitle.MR);
	}
	
	@Test(expected = PersonException.class)
	public void testDOBException() throws PersonException {

		new Staff("Josephine", "Gary", "Dirt", setDate(7, 13, 1966), "Lost Drive", "(520)-128-2864","joedirt@gmail.com", " 8:00-9:00am", 1, 75000, setDate(1999, 7, 12), eTitle.MRS);
	}
}
