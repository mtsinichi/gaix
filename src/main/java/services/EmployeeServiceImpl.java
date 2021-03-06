package services;

import java.util.List;

import models.Employee;
import daos.EmployeeDAO;
import daos.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;

	public EmployeeServiceImpl() {
		employeeDAO = new EmployeeDAOImpl();
	}

	@Override
	public Employee insertEmployee(Employee employee) {
		return employeeDAO.insertEmployee(employee);
	}

	@Override
	public Employee findEmployee(int id) {
		return employeeDAO.findEmployee(id);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeDAO.findAllEmployees();

	}

	@Override
	public void removeEmployee(int id) {
		employeeDAO.removeEmployee(id);
	}
}
