package com.ezen.springdata.fruit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ezen.springdata.fruit.service.FruitOrderService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Controller
public class FruitOrderController {

	private final FruitOrderService fruitOrderService;
	
	@GetMapping("/fruitOrder/list")
	public String list(Model model) {
		model.addAttribute("fruitOrders", fruitOrderService.list());
		return "fruitOrder/list";
	}

	 // 이름(매개변수)를 다르게 하려면 @requestparam()으로 수정해주도록 한다
	   @PostMapping("/fruitOrder/sale")
	   public String sale(Integer fid, Integer qty) {
		   fruitOrderService.saleFruit(fid, qty);
	      
	      return "redirect:/fruitOrder/list";
	   }

}
