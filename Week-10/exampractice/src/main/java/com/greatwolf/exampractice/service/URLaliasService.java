package com.greatwolf.exampractice.service;

import com.greatwolf.exampractice.model.URLalias;
import org.springframework.stereotype.Service;

@Service
public interface URLaliasService {
  void addAlias(URLalias alias);
  void deleteById (Long id);

}
