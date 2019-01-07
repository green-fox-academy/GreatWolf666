package com.greenfoxacademy.week10.Service;

import com.greenfoxacademy.week10.Model.Doubling;
import com.greenfoxacademy.week10.Model.ErrorMessage;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;
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
}
