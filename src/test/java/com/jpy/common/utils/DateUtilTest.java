package com.jpy.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testRandomDate() {
		//创建开始时间
		Calendar c = Calendar.getInstance();
		c.set(2010,0,1);
		Date date = DateUtil.randomDate(c.getTime(), new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(date));
	}

	@Test
	public void testInitMonth() {
		Date date = DateUtil.getInitMonth(new Date());
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(fmt.format(date));
	}
	
	@Test
	public void testEndMonth() {
		Date date = DateUtil.getEndMonth(new Date());
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(fmt.format(date));
	}
	
	@Test
	public void testAgeByBirthday() {
		Calendar c = Calendar.getInstance();
		c.set(2010,10,20);
		int age = DateUtil.getAgeByBirthday(c.getTime());
		System.out.println(age);
	}
}
