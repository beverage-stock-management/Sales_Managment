package com.beverageStock.sales;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReturnRepository extends MongoRepository<Return,Integer> {
    Return findReturnByReturnId(int returnId);
}

