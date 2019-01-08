package com.greenfoxacademy.day2;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.greenfoxacademy.day2.Controller.GuardianController;
import com.greenfoxacademy.day2.Service.GrootService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import static org.hamcrest.Matchers.is;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  @Autowired
  MockMvc mockMvc;

  @MockBean
  GrootService grootService;

  @Test
  public void statusInvalid() throws Exception{
    mockMvc.perform(get("/groot?message="))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void statusIsOk() throws Exception{
    mockMvc.perform(get("/groot?message=traitor"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is("traitor")));
  }
}
