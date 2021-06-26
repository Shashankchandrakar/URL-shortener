package com.system.design.repository;

import com.system.design.entity.URLShortEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlShortRepository extends MongoRepository<URLShortEntity,String> {

    URLShortEntity findByHash(String hash);

}
