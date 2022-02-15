package com.SportyShoes.Db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SportyShoes.Entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {}
