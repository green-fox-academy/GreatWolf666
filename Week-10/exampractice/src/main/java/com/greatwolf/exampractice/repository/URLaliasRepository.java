package com.greatwolf.exampractice.repository;

import com.greatwolf.exampractice.model.URLalias;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface URLaliasRepository extends CrudRepository<URLalias, Long> {

    boolean existsURLaliasByAliasName(String aliasName);
    URLalias findAliasByAliasName(String aliasName);
    void deleteByID (long id);


    @Modifying
    @Transactional
    @Query(value = "update alias a SET a.hit_count = a.hit_count + 1 WHERE a.id = :id", nativeQuery = true)
  void incHitCount(@Param("id") Long id);
}
