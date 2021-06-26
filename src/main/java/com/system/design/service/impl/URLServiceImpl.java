package com.system.design.service.impl;

import com.system.design.service.URLService;

public class URLServiceImpl implements URLService {

    private static final String BASE_62 = "012345689abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    public String intToBase62(Integer integer) {
        String hash = "";

        while (integer > 0) {
            hash = hash.concat(String.valueOf(BASE_62.charAt(integer % 62)));
            integer = integer / 62;
        }

        return hash;
    }
}