package com.vasconcelos.wellington.salesconsult.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasconcelos.wellington.salesconsult.entities.Sale;
import com.vasconcelos.wellington.salesconsult.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales() {
		return repository.findAll();
	}
}
