package com.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	// Select * from employee where erole=?
	public List<Employee> findByErole(String role);
	
	//select * from employee where erole=? and ename=?
	public List<Employee> findByEroleAndEname(String role, String name);
	
	@Query(value = "from Employee where esalary=:salary")
	public List<Employee> getEmployeeBasedOnSalary(double salary);
}
