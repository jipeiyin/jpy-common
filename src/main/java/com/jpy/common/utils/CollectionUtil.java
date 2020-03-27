package com.jpy.common.utils;

import java.util.Collection;

/**
 * 
 * @ClassName: CollectionUtil 
 * @Description: 集合
 * @author: 冀培银
 * @date: 2020年3月26日 上午10:46:25
 */
public class CollectionUtil {
	/**
	 * 
	 * @Title: hasValue 
	 * @Description: 判断集合是否有值
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmpty(Collection<?> collection) {
		return collection == null || collection.isEmpty();
	}
}
