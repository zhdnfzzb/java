package com.offcn.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person implements Serializable {
     private Integer id;
     private String  name;
     private List<Dog> dog;
	 private Map<String,Dog> map;
	 private Set<Dog> setDog;
	 private Date day;
	 
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public Person() {
		setDog=new HashSet<Dog>();
		setDog.add(new Dog());
		setDog.add(new Dog());
	}
	public Set<Dog> getSetDog() {
		return setDog;
	}
	public void setSetDog(Set<Dog> setDog) {
		this.setDog = setDog;
	}
	public Map<String, Dog> getMap() {
		return map;
	}
	public void setMap(Map<String, Dog> map) {
		this.map = map;
	}
	public List<Dog> getDog() {
		return dog;
	}
	public void setDog(List<Dog> dog) {
		this.dog = dog;
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
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]"+dog+"\t"+map+"\t"+setDog+"\t"+day;
	} 
     
}
