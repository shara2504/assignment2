/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.zerorisk.controller;

import com.assignment.zerorisk.model.Order;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Nfizah
 */
@Controller
public class OrderController {
    
    
@GetMapping("/orders")
@ResponseBody
public List<Order> getOrders () {

    List<Order> emp = getDummyOrder ();

    return emp;
}

@GetMapping("/viewOrders")
public String viewOrders () {
    return "orders-listing";
}
    
    
    public List<Order> getDummyOrder () {

    Order order1 = new Order(1,"Nasi Lemak","Delivered", "RM5.00", 2, "RM10.00", "8 Jun 2021", "Athirah");
    Order order2 = new Order(2,"Nasi Lemak", "Processing", "RM5.00", 1, "RM5.00", "8 Jun 2021", "Aida");
    Order order3 = new Order(3,"Kentang", "Cooking", "RM3.00", 2, "RM3.00", "8 Jun 2021", "Aliah");
    Order order4 = new Order(4,"Kentang", "Cooking", "RM3.00", 3, "RM6.00", "8 Jun 2021", "Hani");
    Order order5 = new Order(5,"Karipap", "Processing", "RM1.00", 2, "RM2.00", "8 Jun 2021", "Sab");

    List<Order> order = new ArrayList<>();
    order.add(order1);
    order.add(order2);
    order.add(order3);
    order.add(order4);
    order.add(order5);

    return order;
}
    
}
