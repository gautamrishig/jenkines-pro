package com.javatechie.os;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javatechie.os.entity.Order;
import com.javatechie.os.repository.OrderRepository;

@SpringBootApplication
public class CatalogServiceApplication {

    @Autowired
    private OrderRepository orderRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(CatalogServiceApplication.class, args);
    }

    @PostConstruct
    public void initOrdersTable() {
     
        		
        		List<Order> list = Stream.of(
                        new Order("mobile", "electronics", "white", 20000),
                        new Order("T-Shirt", "clothes", "black", 999),
                        new Order("Jeans", "clothes", "blue", 1999),
                        new Order("Laptop", "electronics", "gray", 50000),
                        new Order("digital watch", "electronics", "black", 2500),
                        new Order("Fan", "electronics", "black", 50000)
                ).
                collect(Collectors.toList());
                orderRepository.saveAll(list);
                System.out.println("jiiiiiiiiiiiii");
                System.out.println("jiiiiiiiiiiiii");
                System.out.println("jiiiiiiiiiiiii");
    }


   

}
