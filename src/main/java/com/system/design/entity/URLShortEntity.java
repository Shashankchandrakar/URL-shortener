package com.system.design.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.PreUpdate;
import java.util.Date;

@Document(collection = "url_short")
@Data
public class URLShortEntity {

    @Id
    private String id;

    private String url;

    @Indexed(name = "hash_index")
    private String hash;

    private Date created = new Date();

    @LastModifiedDate
    private Date updated = new Date();

    private Boolean deleted = false;

    @PreUpdate
    public void onUpdate(){
        this.updated = new Date();
    }
}
