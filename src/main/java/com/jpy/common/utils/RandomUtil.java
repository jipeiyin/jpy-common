package com.jpy.common.utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: 随机数
 * @author: 冀培银
 * @date: 2020年3月26日 上午8:54:52
 */
public class RandomUtil {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		Random r = new Random();
		int i = r.nextInt(max - min +1)+min;
		return i;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
		//判断最大值与最小值之间是否有subs个数据
		if(subs>(max-min+1)) {
			throw new RuntimeException("数据范围有误");
		}
		//目标数组
		int[] x = new int[subs];
		//用来存放中间数据,主要是防止数据重复
		HashSet<Integer> set = new HashSet<Integer>();
		//个数不一样,继续循环
		while(set.size()!=subs) {
			set.add(random(min, max));
		}
		int i = 0;
		for (Integer integer : set) {
			x[i] = integer;
			i++;
		}
		return x;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		char s = str.charAt(random(0, str.length()-1));
		return s;
	}
	//返回0-9
	public static String randonNumber(int length) {
		String str = "1234567890";
		String result="";
		for (int i = 0; i < length; i++) {
			result+=str.charAt(random(0, str.length()-1));
		}
		return result;
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append(randomCharacter());
		}
		return sb.toString();
	}

}
