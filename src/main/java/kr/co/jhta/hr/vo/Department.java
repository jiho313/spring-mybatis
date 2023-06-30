package kr.co.jhta.hr.vo;

import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("Dept")
public class Department {

	private int id;
	private String name;
	private Employee manager;
	private int locId;
	private List<Employee> employees;
	
	public Department() {}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public int getLocId() {
		return locId;
	}

	public void setLocId(int locId) {
		this.locId = locId;
	}
	
}
