package com.example.Ammu.binding;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Person {
	@NotNull
	@Min(18)
	private Integer age;
	@NotNull
	@Size(min=3 ,max=18)
	private String name;
	public Integer getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
