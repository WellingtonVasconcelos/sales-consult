package com.vasconcelos.wellington.salesconsult.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vasconcelos.wellington.salesconsult.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	
}
