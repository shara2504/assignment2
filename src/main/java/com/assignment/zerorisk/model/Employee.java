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
public class Employee {
    private int id;
    private String name;
    private String gender;
    private String ic;
    private String nationality;
    private String address;
    private String hp;
    private String position;
    
      public Employee () {}
    public Employee(int id, String name, String gender, String ic, String nationality, String address, String hp, String position) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.ic = ic;
        this.nationality = nationality;
        this.address = address;
        this.hp = hp;
        this.position = position;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
 
}
