package com.system.design.service.impl;

import com.system.design.entity.URLShortEntity;
import com.system.design.repository.UrlShortRepository;
import com.system.design.service.IDGenerationService;
import com.system.design.service.URLHashService;
import com.system.design.service.URLService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class URLServiceImpl implements URLService {

    private final URLHashService urlHashService;
    private final IDGenerationService idGenerationService;
    private final UrlShortRepository urlShortRepository;

    @Override
    public String getHashForURL(String url) {
        long id = idGenerationService.getIdForURL();
        String hash = urlHashService.longToBase62Hash(id);
        return saveURLShortEntity(hash,url).getHash();
    }

    @Override
    public String getURLFromHash(String hash) {
        return urlShortRepository.findByHash(hash).getUrl();
    }

    private URLShortEntity saveURLShortEntity(String hash, String url) {
        URLShortEntity urlShortEntity = getURLShortEntity(hash,url);
        return urlShortRepository.save(urlShortEntity);
    }

    private URLShortEntity getURLShortEntity(String hash, String url){
        URLShortEntity urlShortEntity = new URLShortEntity();
        urlShortEntity.setUrl(url);
        urlShortEntity.setHash(hash);
        return urlShortEntity;
    }
}
