package com.saraya.employerManagementpaginationwebApp.dto;

import com.saraya.employerManagementpaginationwebApp.entity.Employer;

public class EmployerDTO {
	private Long phoneNumber;
	private String name;
	private Integer age;
	private Character gender;
	private String address;
	private int salary;
	private Integer planId;
	
	public EmployerDTO(Long phoneNumber, String name, Integer age, Character gender, String address, int salary,
			Integer planId) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.salary = salary;
		this.planId = planId;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

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

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	@Override
	public String toString() {
		return "EmployerDTO [phoneNumber=" + phoneNumber + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + ", salary=" + salary + ", planId=" + planId + "]";
	}
	
	public static Employer prepareEmployerEntity(EmployerDTO employerDTO) {
		Employer employerEntity = new Employer();
		employerEntity.setPhoneNumber(employerDTO.getPhoneNumber());
		employerEntity.setName(employerDTO.getName());
		employerEntity.setGender(employerDTO.getGender());
		employerEntity.setAge(employerDTO.getAge());
		employerEntity.setAddress(employerDTO.getAddress());
		employerEntity.setSalary(employerDTO.getSalary());
		employerEntity.setPlanId(employerDTO.getPlanId());
		return employerEntity;
	}
	

}
