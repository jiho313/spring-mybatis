package kr.co.jhta.hr.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.co.jhta.hr.vo.Job;

@Mapper
public interface JobMapper {
	
	Job getJobById(String jobId);
}
