package com.greatwolf.exampractice.controller;


import com.greatwolf.exampractice.model.AliasDto;
import com.greatwolf.exampractice.model.URLalias;
import com.greatwolf.exampractice.service.UrlAliasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JSONController {


  @Autowired
  UrlAliasServiceImpl urlAliasService;

  @GetMapping("/api/links")
  public List<AliasDto> aliasDtoList(){
    return urlAliasService.aliasDtos();
  }

  @DeleteMapping("/api/links/{id}")
  public ResponseEntity<Object> deleteAlias(@RequestBody URLalias urlAlias, @PathVariable long id){
    if (urlAliasService.findById(id).getSecretCode() == urlAlias.getSecretCode()){
      urlAliasService.deleteById(id);
      return new ResponseEntity(HttpStatus.NO_CONTENT);
    }else if (urlAliasService.findById(id).getSecretCode() != urlAlias.getSecretCode()){
      return new ResponseEntity(HttpStatus.FORBIDDEN);
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }
}
