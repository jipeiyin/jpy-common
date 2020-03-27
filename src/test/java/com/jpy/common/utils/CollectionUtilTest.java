package com.jpy.common.utils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void testIsEmpty() {
		/**
		 * 判断list集合是否为空
		 */
		//List<Integer> list = Arrays.asList(1,2,3);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		boolean hasValue = CollectionUtil.isEmpty(list2);
		if(hasValue==false) {
			System.out.println("list集合不是空的");
		}else {
			System.out.println("list集合是空的");
		}
		
		
		/**
		 * 判断set集合是否为空
		 */
		Set<Integer> set = new HashSet<Integer>();
        set.add(100);
        boolean hasValue2 = CollectionUtil.isEmpty(set);
        if(hasValue2==false) {
			System.out.println("set集合不是空的");
		}else {
			System.out.println("set集合是空的");
		}
	}

}
