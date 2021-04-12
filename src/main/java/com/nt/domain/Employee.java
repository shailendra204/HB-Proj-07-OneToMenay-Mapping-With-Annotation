package com.nt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "inn_Employee_tab2")
public class Employee extends Person {
	@Column(length = 20)
	private Integer deptNo;
	@Column(length = 20)
	private Double salary;
	@Column(length = 20)
	private String disignation;

}
