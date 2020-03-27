package com.jpy.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int i = RandomUtil.random(1, 3);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] x = RandomUtil.subRandom(1, 10, 3);
		for (int i : x) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testRandomString() {
		//类似于验证码问题
		String randomString = RandomUtil.randomString(4);
		System.out.println(randomString);
	}

}
