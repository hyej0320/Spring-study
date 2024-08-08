package com.ezen.springmvc.dto;

public class Student {
	private String stu_name;
	private Integer kor;
	private Integer math;
	private Integer eng;

	public Student() {}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public Integer getKor() {
		return kor;
	}

	public void setKor(Integer kor) {
		this.kor = kor;
	}

	public Integer getMath() {
		return math;
	}

	public void setMath(Integer math) {
		this.math = math;
	}

	public Integer getEng() {
		return eng;
	}

	public void setEng(Integer eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Student [stu_name=" + stu_name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}

	
}
