package com.portfolio.back.repository;


import com.portfolio.back.model.TipoEducacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEducacionRepository extends JpaRepository <TipoEducacion, Long>{
    
}
