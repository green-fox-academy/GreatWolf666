package com.greenfoxacademy.programmerfoxclubproject.controller;

import com.greenfoxacademy.programmerfoxclubproject.service.Fox;
import com.greenfoxacademy.programmerfoxclubproject.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
public class NutritionController {
  private List<String> foods = Arrays.asList("lasagna", "cheeseburger", "donuts", "chocolate cake", "goulash", "pizza", "Tide pods");
  private List<String> drinks = Arrays.asList("beer", "wine", "WD-40", "coffee", "Monster", "coke", "soy milk");

  private FoxService foxService;

  @Autowired
  public NutritionController(FoxService foxService){
    this.foxService = foxService;

  }
  @GetMapping("/nutritionStore")
  public String showNutritionStore(@RequestParam("name") String petName, Model model){
    Fox fox = foxService.getFoxByName(petName);
    model.addAttribute("fox", fox);
    model.addAttribute("foods", foods);
    model.addAttribute("drinks", drinks);

    return "nutrition-store";

  }
  @PostMapping("/nutritionStore")
  public String setFoxNewFoodandDrink(@RequestParam("name") String petName,
                                      @RequestParam("food") String food,
                                      @RequestParam("drink") String drink,
                                      RedirectAttributes redirectAttributes){
    Fox fox = foxService.getFoxByName(petName);
    fox.setFood(food);
    fox.setDrink(drink);
    redirectAttributes.addAttribute("name", petName);
    return "redirect:/";
  }
}
