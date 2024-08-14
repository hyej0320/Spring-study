package com.ezen.springdata.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class FruitDTO {
	private Integer fid;
	private String fname;
	private Integer price;
	private Integer qty;
	/*
		HTML로부터 날짜 타입을 받아 바인딩 할 때
		input tag가 type="date"일 때, @DateTimeFormat(pattern = "yyyy-MM-dd")
		input tag가 type="datetime-local"일 때, @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") 
	*/
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private Date exp_date;
	private Integer location_id;
}
