package com.greatwolf.exampractice.service;


import com.greatwolf.exampractice.model.AliasDto;
import com.greatwolf.exampractice.model.URLalias;
import com.greatwolf.exampractice.repository.URLaliasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.greatwolf.exampractice.service.RNG.randomFourDigitLong;

@Service
public class UrlAliasServiceImpl implements URLaliasService {


  @Autowired
  URLaliasRepository urlAliasRepository;


  @Override
  public void addAlias(URLalias alias) {

  }

  @Override
  public void deleteById(Long id) {

  }

  public boolean existsAliasByAliasName(String aliasName) {
    return urlAliasRepository.existsURLaliasByAliasName(aliasName);
  }

  public URLalias findAliasByName(String aliasName) {
    return urlAliasRepository.findAliasByAliasName(aliasName);
  }

  public URLalias findById(Long id){
    return urlAliasRepository.findById(id).orElse(null);
  }

  public void incHitCount(String aliasName){
    urlAliasRepository.incHitCount(urlAliasRepository.findAliasByAliasName(aliasName).getId());
  }
  public AliasDto transformAlias(URLalias urLalias){
    return new AliasDto(urLalias.getId(), urLalias.getUrl(), urLalias.getAliasName(), urLalias.getHitCount());
  }
}
