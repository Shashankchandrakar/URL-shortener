package com.system.design.repository;

import com.system.design.entity.URLShort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlShortRepository extends MongoRepository<URLShort,String> {

}
