package com.microservice.orderservice.controller;

import com.microservice.orderservice.dto.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @PostMapping
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        return "Order placed successfully!";
    }
}