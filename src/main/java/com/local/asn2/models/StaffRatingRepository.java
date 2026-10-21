package com.local.asn2.models;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface StaffRatingRepository extends JpaRepository<StaffRating,Integer> {
    List<StaffRating> findByClarity(int clarity);
}
