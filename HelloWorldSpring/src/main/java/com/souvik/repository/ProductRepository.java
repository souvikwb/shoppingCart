package com.souvik.repository;

import java.util.List;

import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.souvik.model.Product;

@Repository
public interface ProductRepository extends CouchbaseRepository<Product, String>{
	@Query("#{#n1ql.selectEntity} WHERE #{#n1ql.filter}")
	List<Product> findAllProduct();
}
