/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.zerorisk.controller;

import com.assignment.zerorisk.model.Feedbacks;
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
public class FeedbackController {
    
@GetMapping("/feedbacks")
@ResponseBody
public List<Feedbacks> getFeedbacks () {

    List<Feedbacks> f = getDummyFeedbacks ();

    return f;
}

@GetMapping("/viewFeedbacks")
public String viewFeedbacks () {
    return "feedbacks-listing";
}
    
    
    public List<Feedbacks> getDummyFeedbacks () {

    Feedbacks f1 = new Feedbacks(1,"Nasi Lemak", "Very Delicious");
    Feedbacks f2 = new Feedbacks(2,"Karipap", "Hot serve will be better");
    Feedbacks f3 = new Feedbacks(1,"Karipap", "Add more inti");
    
    List<Feedbacks> feedback = new ArrayList<>();
    feedback.add(f1);
    feedback.add(f2);
    feedback.add(f3);
    
    return feedback;
}
}
