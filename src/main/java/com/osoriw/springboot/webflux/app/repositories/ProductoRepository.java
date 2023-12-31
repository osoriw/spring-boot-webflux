package com.osoriw.springboot.webflux.app.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.osoriw.springboot.webflux.app.models.documents.Producto;

public interface ProductoRepository extends ReactiveMongoRepository<Producto, String> {

}
