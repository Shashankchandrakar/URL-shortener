package com.system.design.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "url_short")
@Data
public class URLShort {

    @Id
    private String id;

    private String url;

    private String hash;

    @CreatedDate
    private Date created;

    @LastModifiedDate
    private Date updated;

    private Boolean deleted = false;

}
