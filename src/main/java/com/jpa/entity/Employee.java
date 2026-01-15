package com.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//
@Entity
@Table(name = "emp")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String ename;
	
	private String eaddress;
	
	private String erole;
	
	private double esalary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String ename, String eaddress, String erole, double esalary) {
		super();
		this.id = id;
		this.ename = ename;
		this.eaddress = eaddress;
		this.erole = erole;
		this.esalary = esalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public String getErole() {
		return erole;
	}

	public void setErole(String erole) {
		this.erole = erole;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", eaddress=" + eaddress + ", erole=" + erole + ", esalary="
				+ esalary + "]";
	}
	
}
