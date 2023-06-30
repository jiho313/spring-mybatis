package kr.co.jhta.hr.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.hr.service.HrService;
import kr.co.jhta.hr.vo.Department;
import kr.co.jhta.hr.vo.Employee;

public class App2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("mybatis-context.xml");
		
		HrService hrService = context.getBean(HrService.class);
		
		// 전체 직원정보를 반환하는 서비스 실행하기
//		List<Employee> employees = hrService.getAllEmployees();
//		for (Employee e : employees) {
//			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getJob().getId());
//		}
		
		// 직원 상세정보 조회하기
//		Employee employee = hrService.getEmployeeDetail(150);
//		System.out.println("아이디 : " + employee.getId());
//		System.out.println("이름 : " + employee.getFirstName() + " " + employee.getLastName());
//		System.out.println("이메일 : " + employee.getEmail());
//		System.out.println("전화번호 : " + employee.getPhoneNumber());
//		System.out.println("입사일 : " + employee.getHireDate());
//		System.out.println("직종아이디 : " + employee.getJob().getId());
//		System.out.println("직종제목 : " + employee.getJob().getTitle());
//		System.out.println("직종최소급여: " + employee.getJob().getMinSalary());
//		System.out.println("직종최대급여: " + employee.getJob().getMaxSalary());
//		System.out.println("급여 : " + employee.getSalary());
//		// 커미션도 받지않으면 굳이 출력하지 않기로 함 (null)이 보기 싫음
//		if (employee.getCommissionPct() != null) {
//		System.out.println("커미션 : " + employee.getCommissionPct());
//		}
//		if (employee.getManager() != null) {
//		System.out.println("매니저아이디 : " + employee.getManager().getId());
//		System.out.println("매니저이름 : " + employee.getManager().getFirstName() + " " + employee.getManager().getLastName());
//		}
//		if (employee.getDepartment() != null) {
//		System.out.println("소속부서아이디 : " + employee.getDepartment().getId());
//		System.out.println("소속부서명 : " + employee.getDepartment().getName());
//		}
		
		Department dept = hrService.getDepartmentWithEmployees(80);
		System.out.println("----------------------------------------------");
		System.out.println("부서아이디: " + dept.getId());
		System.out.println("부서이름: " + dept.getName());
		System.out.println("부서관리자: " + dept.getManager().getFirstName());
		List<Employee> employees = dept.getEmployees();
		System.out.println("----------------------------------------------");
		
		System.out.println("### 소속 직원 목록");
		for (Employee e: employees) {
			System.out.println(e.getId() + "\t" + e.getFirstName());
		}
	}

}
