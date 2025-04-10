package com.example.cms.api.repository;

import com.example.cms.api.model.CustomerCare;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerCareRepository extends MongoRepository<CustomerCare, String> {
}
