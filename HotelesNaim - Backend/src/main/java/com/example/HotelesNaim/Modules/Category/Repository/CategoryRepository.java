package com.example.HotelesNaim.Modules.Category.Repository;

import java.util.Optional;

import com.example.HotelesNaim.Modules.Category.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository

public interface CategoryRepository extends JpaRepository<Category, UUID> {
    Optional<Category> findByName(String name);
}
