package com.system.design.endpoint;

import com.system.design.entity.URLShortEntity;
import com.system.design.repository.UrlShortRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
public class URLController {

    private final UrlShortRepository urlShortRepository;

    @GetMapping("/")
    public URLShortEntity getClassName(){
        URLShortEntity urlShortEntity =new URLShortEntity();
        urlShortEntity.setUrl("https://www.example.com");
        urlShortEntity.setHash(UUID.randomUUID().toString());
        return urlShortRepository.save(urlShortEntity);
    }

    @GetMapping("/{hash}")
    public URLShortEntity getEntityByHash(@PathVariable String hash){
        return urlShortRepository.findByHash(hash);
    }
}
