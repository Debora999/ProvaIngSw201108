package it.unical.ingsw2020;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import org.joda.time.DateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	public static MyListUtil mylist;
	
	@BeforeClass
	public static void prepare() {
		mylist = new MyListUtil();
		DateTime juDate = new DateTime();
	}
	
	@AfterClass
	public static void end() {
		DateTime d = new DateTime();
	}
	
	@Test
	public void ordinaCrescenteWorks() {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
    	a.add(14);
    	a.add(6);
    	a.add(13);
    	ArrayList<Integer> a1 = new ArrayList<Integer>();
    	a1.add(6);
    	a1.add(13);
    	a1.add(14);
    	assertEquals(a1, mylist.ordinaCrescente(a));
	}

	@Test
	public void ordinaDecrescenteWorks() {
		ArrayList<Integer> a = new ArrayList<Integer>();
    	a.add(13);
    	a.add(6);
    	a.add(14);
    	ArrayList<Integer> a1 = new ArrayList<Integer>();
    	a1.add(14);
    	a1.add(13);
    	a1.add(6);
    	assertEquals(a1, mylist.ordinaDecrescente(a));
	}

}
