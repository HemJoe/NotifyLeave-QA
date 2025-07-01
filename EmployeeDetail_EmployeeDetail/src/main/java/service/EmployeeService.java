package service;

import org.springframework.stereotype.Service;
import java.util.List;
import model.Employee;
import repository.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;

	public List<Employee> getAllEmployee() {
		
		return employeeRepo.findAll();
	}
//	public Employee getEmployeeByName(String name) {
//        // Searching by first name (if you want to search by both first and last name, modify this)
//        return employeeRepo.findByName(name).orElse(null);
//    }
}
