package com.osoriw.springboot.webflux.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osoriw.springboot.webflux.app.models.documents.Producto;
import com.osoriw.springboot.webflux.app.repositories.ProductoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

	@Autowired
	ProductoRepository dao;

	@GetMapping
	public Flux<Producto> productos() {
		Flux<Producto> productosFlux = dao.findAll();
		return productosFlux;
	}

	@GetMapping("/{id}")
	public Mono<Producto> producto(@PathVariable String id) {
		Mono<Producto> producto = dao.findById(id);
		return producto;
	}

}
