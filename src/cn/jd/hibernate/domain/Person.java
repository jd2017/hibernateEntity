package cn.jd.hibernate.domain;

import java.io.Serializable;
import java.util.Date;
/*
 * use test;
  create table PERSON(
  	ID int primary key auto_increment,
  	NAME varchar(255),
  	BIRTHDAY date
  );
 */
public class Person implements Serializable {
	private Integer id;
	private String name;
	private Date birthday;
	
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
