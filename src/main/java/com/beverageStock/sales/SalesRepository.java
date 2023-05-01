package com.beverageStock.sales;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalesRepository extends MongoRepository<Sales,Integer> {

     Sales findSalesBySalesId(int salesId);
}
