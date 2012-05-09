package com.xiaonanzhi.backend.domain;

import java.io.Serializable;
/**
 * 
 * @author zhaopoingfei
 *
 * 2012-4-15
 */
public class User implements Serializable {

	private static final long serialVersionUID = -6061716614009204416L;
	
	private long id;
	
	private String name;
	
	private int age;
	
	private String address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
