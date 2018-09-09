package com.atguigu.git;

public class Apple {

	private String name;
	private Integer age;

	private Double weight;

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

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Apple(String name, Integer age, Double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

}
