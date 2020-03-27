package com.jpy.common.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class PersonTest {
	public static void main(String[] args) {
		int i = 1;
		while(i<=10) {
			Person person = new Person();		
			person.setName(StringUtil.generateChineseName());
			person.setAge(RandomUtil.random(1, 120));
			person.setAbout(StringUtil.randomChineseString(30));
			//获取日历类
			Calendar c = Calendar.getInstance();
			c.set(2010, 0, 1);
			Date date = DateUtil.randomDate(c.getTime(), new Date());
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			person.setCreated(fmt.format(date));
			System.out.println(person);
			i++;
		}
		
	}
}
