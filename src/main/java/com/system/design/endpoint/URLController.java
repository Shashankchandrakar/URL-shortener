package com.system.design.endpoint;

import com.system.design.service.URLService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class URLController {

    private final URLService urlService;

    @GetMapping("/{url}")
    public String getEntityByHash(@PathVariable String url) {
        return urlService.getHashForURL(url);
    }

    @GetMapping("/urlFromHash/{hash}")
    public String getURLFromHash(@PathVariable String hash){
        return urlService.getURLFromHash(hash);
    }
}
