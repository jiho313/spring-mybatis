package kr.co.jhta.hr.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.jhta.hr.vo.Employee;

@Mapper
public interface EmployeeMapper {

	List<Employee> getAllEmployees();
	Employee getEmployeeDetail(int empId);
	
	
	Employee getEmployeeDetailById(int empId);
	Employee getEmployeeById(int managerId);
	
	List<Employee> searchEmployees(Map<String, Object> param);
}
