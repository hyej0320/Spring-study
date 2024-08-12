package com.ezen.springdata.fruit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ezen.springdata.dto.FruitDTO;
import com.ezen.springdata.fruit.repository.FruitOrderRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class FruitOrderService {

	private final FruitOrderRepository fruitOrderRepository;
	
	public List<FruitDTO> list(){
		// DB에서 모든 주문 목록을 꺼내와야 한다
		return fruitOrderRepository.getAll();
	}
}
