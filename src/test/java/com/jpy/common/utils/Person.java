package com.jpy.common.utils;

import java.util.Date;

public class Person {
	private String name;
	private Integer age;
	private String about;
	private String created;//get,set,无参,toString
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "姓名:" + name + ", 年龄:" + age + ", 介绍:" + about + ", 注册日期:" + created + "]";
	}
	
}
