package com.jpy.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String str = null;//没值
		String str2 = "";//没值
		String str3 = " ";//加空格有值
		boolean b = StringUtil.hasLength(str3);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String str = null;//没值
		String str2 = "";//没值
		String str3 = " ";//没值
		String str4 = "abc";
		boolean b = StringUtil.hasText(str4);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String str = StringUtil.randomChineseString(1);
		System.out.println(str);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}
	
	@Test
	public void testIsEmail() {
		boolean email = StringUtil.isEmail("3201426044@qq.com");
		System.out.println(email);
	}
	
	@Test
	public void testIsPhone() {
		boolean phone = StringUtil.isPhone("17634963409");
		System.out.println(phone);
	}
	
	@Test
	public void testIsNumber() {
		boolean number = StringUtil.isNumber("0.28");
		System.out.println(number);
	}
}
