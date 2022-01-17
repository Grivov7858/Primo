package com.qtech.primo.repository;

import com.qtech.primo.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Override
    <S extends Product> S saveAndFlush(S entity);
}
