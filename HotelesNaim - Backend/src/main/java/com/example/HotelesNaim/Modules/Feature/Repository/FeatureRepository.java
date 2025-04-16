package com.example.HotelesNaim.Modules.Feature.Repository;

import com.example.HotelesNaim.Modules.Feature.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, UUID> {
    Optional<Feature> findByName(String name);}
