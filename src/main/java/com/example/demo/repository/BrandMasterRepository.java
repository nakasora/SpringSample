package com.example.demo.repository;

import com.example.demo.entity.BrandMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 銘柄マスタRepository
 */
@Repository
public interface BrandMasterRepository extends JpaRepository<BrandMaster, String> {
}
