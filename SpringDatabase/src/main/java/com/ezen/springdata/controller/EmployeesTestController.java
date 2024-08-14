package com.ezen.springdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.springdata.mapper.EmployeesMapper;

import lombok.RequiredArgsConstructor;


@RequestMapping("/emp")
@RequiredArgsConstructor
@Controller
public class EmployeesTestController {

	private final EmployeesMapper employeesMapper;
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("empList", employeesMapper.getAll());
		
		return "emp/list";
	}
	
	@GetMapping("/detail")
	public String detail(Integer employee_id, Model model) {
		model.addAttribute("emp", employeesMapper.get(employee_id));
		return "emp/detail";
	}
	
	@GetMapping("/dept/{dept_id}/")
	public String deptList(@PathVariable Integer dept_id, Model model) {
		model.addAttribute("emp", employeesMapper.getAllByDeptId(dept_id));
		
		return "emp/list";
	}

	@GetMapping("/dept/{dept_id}/{emp_id}")
	public String empDeptDetail(Model model, @PathVariable Integer emp_id, @PathVariable Integer dept_id) {
		model.addAttribute("emp_dept", employeesMapper.getEmpDept(emp_id));
		return "emp/emp_dept_detail";
	}
	
	@GetMapping("/salary/under/{salary}")
	public String underSalary(Model model, @PathVariable Double salary) {
		model.addAttribute("empList", employeesMapper.getAllUnderSalary(salary));
		return "emp/list";
	}
}
