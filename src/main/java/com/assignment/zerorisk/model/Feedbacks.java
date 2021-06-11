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
public class Feedbacks {
    private int id;
    private String name;
    private String feedbacks;
    
    public Feedbacks () {}
    public Feedbacks(int id, String name, String feedbacks) {
        this.id = id;
        this.name = name;
        this.feedbacks = feedbacks;
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

    public String getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(String gender) {
        this.feedbacks = feedbacks;
    }

   
}
