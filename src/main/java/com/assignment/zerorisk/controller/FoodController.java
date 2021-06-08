/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.zerorisk.controller;
import com.assignment.zerorisk.model.foodModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nfizah
 */
@Controller
public class FoodController {
    
@GetMapping("/foods")
@ResponseBody
public List<foodModel> getFoods () {

    List<foodModel> foods = getDummyFoods ();

    return foods;
}

@GetMapping("/view")
public String viewFoods () {
    return "food-listing";
}

@GetMapping("/addFood")
  public String greetingForm(Model model) {
    model.addAttribute("addFood", new foodModel());
    return "addFood";
  }

 @PostMapping("/addFood")
  public String greetingSubmit(@ModelAttribute foodModel foods, Model model) {
    System.out.println(foods.getName());
    
    foodModel foodla = new foodModel("1",foods.getName(),foods.getDesc(),foods.getPrice(),foods.getStock());
    List<foodModel> food = new ArrayList<>();
    food.add(foodla);
//    food.add(foods.getName(),foods.getPrice(),foods.getStock(),foods.getDesc());
    model.addAttribute("addFood", foods);
    return "result";
  }
//  @PostMapping("/addFood")
//  public String greetingSubmit(@ModelAttribute foodModel foods) {
//    foods.add()
//    return "result";
//  }
//  @PostMapping("/addFood")
//  public ResponseEntity<List<foodModel>> update(@RequestBody List<foodModel> foods) {
//
//    foods.stream().forEach(c -> c.setName(c.getName()));
//
//    // TODO: call persistence layer to update
//    return new ResponseEntity<List<foodModel>>(foods, HttpStatus.OK);
//}

public List<foodModel> getDummyFoods () {

    foodModel food1 = new foodModel("1","Nasi Lemak", "Coconut Rice", "RM5.00", "5");
    foodModel food2 = new foodModel("2", "Karipap", "Pastry", "Rm1.00", "10");
    foodModel food3 = new foodModel("3", "Kentang", "Fries", "RM3.00", "5");

    List<foodModel> foods = new ArrayList<>();
    foods.add(food1);
    foods.add(food2);
    foods.add(food3);

    return foods;
}
}
