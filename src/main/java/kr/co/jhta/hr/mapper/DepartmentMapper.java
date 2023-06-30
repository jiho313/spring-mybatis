package kr.co.jhta.hr.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.co.jhta.hr.vo.Department;

@Mapper
public interface DepartmentMapper {
	
	Department getDepartmentById(int deptId);
	Department getDepartmentByIdWithEmployees(int deptId);
}
