package com.calljef.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.calljef.myfirstproject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
