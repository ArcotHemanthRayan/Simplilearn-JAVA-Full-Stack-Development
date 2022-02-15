package com.Authentication;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthenticationRepository extends CrudRepository<User, Integer> 
{

	public Optional<User> findUserByName(String name);
}
