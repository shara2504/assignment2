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
public class foodModel {
   private String id;
   private String name;
   private String desc;
   private String price;
   private String stock;

   public foodModel () {}
    public foodModel(String id, String name, String desc, String price, String stock) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.stock = stock;
    }
   
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
    public String getDesc() {
      return desc;
   }
   public void setDesc(String desc) {
      this.desc = desc;
   }
    public String getPrice() {
      return price;
   }
   public void setPrice(String price) {
      this.price = price;
   }
   public String getStock() {
      return stock;
   }
   public void setStock(String stock) {
      this.stock = stock;
   }

    public void add(String name, String price, String stock, String desc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
