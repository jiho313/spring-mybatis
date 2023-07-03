package kr.co.jhta.hr.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jhta.hr.mapper.DepartmentMapper;
import kr.co.jhta.hr.mapper.EmployeeMapper;
import kr.co.jhta.hr.vo.Department;
import kr.co.jhta.hr.vo.Employee;

@Service
public class HrService {
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	// 전체 직원정보 조회 서비스
	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeMapper.getAllEmployees();
		return employees;
	}
	
	// 지정된 직원아이디로 직원상세정보 조회 서비스
	public Employee getEmployeeDetail(int empId) {
		//Employee employee = employeeMapper.getEmployeeDetail(empId);
		return employeeMapper.getEmployeeDetailById(empId);
	}
	
	// 지정된 부서아이디로 부서정보와 소속된 직원목록 조회하기
	public Department getDepartmentWithEmployees(int deptId) {
		return departmentMapper.getDepartmentByIdWithEmployees(deptId);
	}
	
	// 직원정보 검색 서비스
	public List<Employee> searchEmployees(Map<String, Object> param) {
		return employeeMapper.searchEmployees(param);
	}
	
	// 신규 직원정보 등록 서비스
	
	// 직원 급여정보 변경 서비스
	
	// 신규 부서정보 등록 서비스
	
	// 전제 부서정보 조회 서비스
	
}
