package com.portfolio.back.repository;

import com.portfolio.back.model.TipoEmpleo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEmpleoRepository extends JpaRepository <TipoEmpleo, Long>{
    
}
