package com.vasconcelos.wellington.salesconsult.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasconcelos.wellington.salesconsult.entities.Sale;
import com.vasconcelos.wellington.salesconsult.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public List<Sale> findSale() {
		return service.findSales();
	}
	
}
