package com.ezen.springrest.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/entity")
@RestController
public class ResponseEntityTestController {

	// 응답하는 ResponseEntity의 제네릭은 응답 내용(body)에 들어가는 데이터의 타입을 의미한다
	@GetMapping("/test1")
	public ResponseEntity<String> test1(){
		// 원하는 응답 인스턴스 생성하기 (스태틱 메서드를 활용)
		// 응답은 메서드 체이닝 방식을 통해 생성한다
		return ResponseEntity
				.status(200)
				.contentType(MediaType.TEXT_HTML)
				.body("<html><head><title>수제 응답 생성하기</title></head>"
						+ "<h1>내가 만든 HTML 응답</h1><body></body></html>");
			
	}
}
