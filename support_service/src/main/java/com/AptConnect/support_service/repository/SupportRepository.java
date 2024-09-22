package com.AptConnect.support_service.repository;

import com.AptConnect.support_service.model.Support;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportRepository extends MongoRepository<Support,Long> {
}
