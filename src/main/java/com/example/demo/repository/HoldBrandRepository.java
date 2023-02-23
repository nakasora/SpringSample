package com.example.demo.repository;

import com.example.demo.entity.HoldBrand;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 保有銘柄Repository
 */
public interface HoldBrandRepository extends JpaRepository<HoldBrand, String> {
}
