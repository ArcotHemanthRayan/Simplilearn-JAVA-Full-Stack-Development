package com.SportyShoes.Db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SportyShoes.Entity.UserDetails;



@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> 
{

	public List<UserDetails> findByusername(String username);
}
