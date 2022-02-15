package com.SportyShoes.Db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SportyShoes.Entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>
{

}
