/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.zerorisk.model;

/**
 *
 * @author Nfizah
 */
public class Order {
    private int id;
    private String orderStatus;
    private String name;
//    private String username;
    private String price;
    private int quantity;
    private String tprice;
    private String date;
    private String cust;
    
    public Order(int id, String name,  String orderStatus, String price, int quantity, String tprice, String date, String cust) {
        this.id = id;
        this.name = name;
//        this.username = username;
        this.orderStatus = orderStatus;
        this.price = price;
        this.quantity = quantity;
        this.tprice = tprice;
        this.date = date;
        this.cust = cust;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTprice() {
        return tprice;
    }

    public void setTprice(String tprice) {
        this.tprice = tprice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getCust() {
        return cust;
    }

    public void setCust(String cust) {
        this.cust = cust;
    }
}
