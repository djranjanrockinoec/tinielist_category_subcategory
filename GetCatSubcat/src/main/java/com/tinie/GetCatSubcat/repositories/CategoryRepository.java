package com.tinie.GetCatSubcat.repositories;

import com.tinie.GetCatSubcat.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> { }
