//package com.system.design.bean;
//
//import com.mongodb.client.MongoClient;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.mongo.MongoProperties;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
//
//@Configuration
//public class MongoConfiguration extends AbstractMongoClientConfiguration {
//
//    private final MongoProperties mongoProperties;
//
//    @Autowired
//    public MongoConfiguration(MongoProperties mongoProperties) {
//        this.mongoProperties = mongoProperties;
//    }
//
//    @Override
//    protected String getDatabaseName() {
//        return mongoProperties.getDatabase();
//    }
//
//    @Override
//    public MongoClient mongoClient() {
//        return super.mongoClient();
//    }
//}
