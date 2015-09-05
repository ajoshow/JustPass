package com.ajoshow.justpass.pass;

import org.springframework.data.repository.CrudRepository;

import com.ajoshow.justpass.pass.domain.Pass;

public interface PassDao extends CrudRepository<Pass, Long>{
	 
}