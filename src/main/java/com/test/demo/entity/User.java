package com.test.demo.entity;

public class User {

	private Integer id;
	private String name;
	private String password;
	private String email;
	private String phone;
	private String neckname;
	private String addr;

	public User(Integer id, String name, String password, String email, String phone, String neckname, String addr) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.neckname = neckname;
		this.addr = addr;
	}

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNeckname() {
		return neckname;
	}

	public void setNeckname(String neckname) {
		this.neckname = neckname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
