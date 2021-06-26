package com.system.design.service.impl;

import com.system.design.service.URLHashService;
import org.springframework.stereotype.Service;

@Service
public class URLHashServiceImpl implements URLHashService {

    private static final char[] BASE_62 = "012345689abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @Override
    public String longToBase62Hash(long id) {
        StringBuilder hash = new StringBuilder();

        while (id > 0) {
            hash.append(BASE_62[Math.toIntExact(id % 62)]);
            id = id / 62;
        }

        return hash.reverse().toString();
    }
}