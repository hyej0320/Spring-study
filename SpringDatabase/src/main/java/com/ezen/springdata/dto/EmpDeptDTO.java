package com.ezen.springdata.dto;

import lombok.Data;

@Data
public class EmpDeptDTO {
	Integer employee_id;
	String first_name;
	String last_name;
	Integer department_id;
	String department_name;
}
