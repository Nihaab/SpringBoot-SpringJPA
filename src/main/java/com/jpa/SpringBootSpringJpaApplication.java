package com.jpa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.jpa.entity.Employee;
import com.jpa.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootSpringJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(SpringBootSpringJpaApplication.class, args);
		
		
		EmployeeRepository empRepo = context.getBean(EmployeeRepository.class);
		
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setEname("Nihar");
		e1.setEaddress("Pune");
		e1.setErole("HR");
		e1.setEsalary(10000);
		
		Employee e2 = new Employee();
		e2.setId(102);
		e2.setEname("Akshay");
		e2.setEaddress("Mumbai");
		e2.setErole("Software Engineer");
		e2.setEsalary(80000);
		
		Employee e3 = new Employee();
		e3.setId(103);
		e3.setEname("Agastya");
		e3.setEaddress("Bangalore");
		e3.setErole("Civil Engineer");
		e3.setEsalary(90000);
		
		//to insert employee details into db
		//empRepo.saveAll(Arrays.asList(e1,e2,e3));
		
		//empRepo.save(e2);
		
		//to find single employee
		/*
		 * Optional<Employee> emp = empRepo.findById(3); 
		 * if(emp.isPresent()) 
		 * {
		 * 		System.out.println(emp); 
		 * } 
		 * else 
		 * {
		 * 		System.out.println("Employee is not present......"); 
		 * }
		 */
		
		//to find all data
		
		/*
		 * Iterable<Employee> allEmp = empRepo.findAll(); for (Employee employee :
		 * allEmp) { System.out.println(employee); }
		 */
		
		
		//to find list of employee
		/*
		 * Iterable<Employee> findAllById = empRepo.findAllById(Arrays.asList(1,3)); for
		 * (Employee employee : findAllById) { System.out.println(findAllById); }
		 */
		
		//System.out.println(empRepo.count());
		
		
		//empRepo.deleteById(2);
		
		
		//Pagination
		/*
		 * List<Employee> only2EmpPerPage = empRepo.findAll(PageRequest.of(1,
		 * 3)).getContent(); for (Employee employee : only2EmpPerPage) {
		 * System.out.println(employee); }
		 */
		
		
		/*
		 * //Sorting List<Employee> findAll =
		 * empRepo.findAll(Sort.by("esalary").descending().by("eaddress")); for
		 * (Employee employee : findAll) { System.out.println(employee); }
		 */
				
		List<Employee> findByErole = empRepo.findByErole("HR");
		System.out.println(findByErole);
		
		List<Employee> findByEroleAndEname = empRepo.findByEroleAndEname("Software Engineer","Akshay");
		System.out.println(findByEroleAndEname);
		
		List<Employee> employeeBasedOnSalary = empRepo.getEmployeeBasedOnSalary(80000);
		System.out.println(employeeBasedOnSalary);
	}

}
