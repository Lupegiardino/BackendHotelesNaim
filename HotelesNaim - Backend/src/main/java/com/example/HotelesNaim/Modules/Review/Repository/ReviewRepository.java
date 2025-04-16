package com.example.HotelesNaim.Modules.Review.Repository;
import com.example.HotelesNaim.Modules.Review.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;
import java.util.UUID;
public interface ReviewRepository extends JpaRepository<Review, UUID>{
    Set<Review> findByStayId(UUID stayId);

    Page<Review> findByStayId(UUID stayId, Pageable pageable);
}
