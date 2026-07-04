package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
@Repository
public interface StockRepository extends JpaRepository<Stock,Integer> {
    public List<Stock> findByCodeAndDateBetween(String code, LocalDate start,LocalDate end);
    public  List<Stock> findByCodeAndCloseGreaterThan(String code, BigDecimal close);
    public List<Stock> findTop3ByOrderByVolumeDesc();
}
