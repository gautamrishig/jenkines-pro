package com.javatechie.os;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.os.entity.Order;
import com.javatechie.os.repository.OrderRepository;

@RestController
@RequestMapping("/orders")
public class OrderControler {
	
    @Autowired
    private OrderRepository orderRepository;
	
	@GetMapping
	public List<Order> getOrders(){
		return orderRepository.findAll();
	}
	@GetMapping("/{category}")
	public List<Order> getOrdersByCategory(@PathVariable String category){
		System.out.println("sssssssssss");
		return orderRepository.findByCategory(category);
	}


}
