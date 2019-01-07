package com.greenfoxacademy.week10.Service;

import com.greenfoxacademy.week10.Model.*;
import org.springframework.stereotype.Service;

@Service
public class MethodService {

  public Object getDouble(Integer input) {
    if (input == null) {
      return new ErrorMessage("provide input");
    } else {
      return new Doubling(input);
    }
  }

  public Object getGreeter(String name, String title){
    if (name.isEmpty() && title.isEmpty()){
      return new ErrorMessage("Please state name and title!");
    } else if (name.isEmpty()){
      return new ErrorMessage("State your name!");
    } else if (title.isEmpty()){
      return new ErrorMessage("State your title!");
    } else {
      return new Greeter(name, title);
    }
  }

  public AppendA addA(String inputString){
    return new AppendA(inputString);
  }

  public DoUntilNumber doUntil(String action, int until){
    if (action.equals("sum")){
      return sumUntil(until);
    }else{
      return factUntil(until);
    }

  }

  public DoUntilNumber sumUntil(int input){
    int myNumber = 0;
    for (int i = 0; i <= input; i++) {
      myNumber = myNumber + i;
    }
    return new DoUntilNumber(myNumber);
  }

  public DoUntilNumber factUntil(Integer input){
    int fact = 1;
    for (int i = 0; i <= input; i++) {
     fact = fact * i;
    }
    return new DoUntilNumber(fact);
  }
}
