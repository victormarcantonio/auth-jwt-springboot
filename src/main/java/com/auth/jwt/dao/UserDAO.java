package com.auth.jwt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.auth.jwt.model.DAOUser;

@Repository
public interface UserDAO extends CrudRepository <DAOUser, Integer> {

	DAOUser findByUsername(String username);
}
