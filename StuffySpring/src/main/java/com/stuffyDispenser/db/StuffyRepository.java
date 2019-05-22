package com.stuffyDispenser.db;

import org.springframework.data.repository.CrudRepository;

import com.stuffyDispenser.logic.Stuffy;

public interface StuffyRepository extends CrudRepository<Stuffy, Integer> {

}
