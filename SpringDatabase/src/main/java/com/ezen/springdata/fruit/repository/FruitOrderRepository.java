package com.ezen.springdata.fruit.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.ezen.springdata.dto.FruitDTO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class FruitOrderRepository {

	private final SqlSessionTemplate sql;
	
	public List<FruitDTO> getAll() {
		return sql.selectList("Fruits.getAll");
	}
}
