package com.example.shop_online.repository;

import com.example.shop_online.entity.Promotion;
import com.example.shop_online.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Integer>{
}
