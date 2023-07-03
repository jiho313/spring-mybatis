package kr.co.jhta.hr.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.hr.service.HrService;
import kr.co.jhta.hr.vo.Employee;

public class App3 {
	public static void main(String[] args) {
		// 스프링 환경설정파일
		ApplicationContext context = new ClassPathXmlApplicationContext("mybatis-context.xml");
		
		HrService hrService = context.getBean(HrService.class);
		
		// 검색 조건이 많으면 Map을 쓰자 검색 전용의 클래스를 만드는 방법도 있다.
		Map<String, Object> param = new HashMap<String, Object>();
		//param.put("job", "IT_PROG");
		//param.put("min", 1000);
		//param.put("max", 5000);
		param.put("depts", List.of(10, 20, 30)); // 이렇게 만든 List객체는 값을 추가하거나 변경할 수 없다.
		
		List<Employee> employees = hrService.searchEmployees(param);
		System.out.println("조회 건수 : " + employees.size());
		
		
		
	}
}
