package com.system.design.endpoint;

import com.system.design.entity.URLShort;
import com.system.design.repository.UrlShortRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class URLController {

    private final UrlShortRepository urlShortRepository;

    @GetMapping("/")
    public URLShort getClassName(){
        URLShort urlShort=new URLShort();
        urlShort.setUrl("https://www.example.com");
        urlShort.setHash("HASH");
        return urlShortRepository.save(urlShort);
    }
}
