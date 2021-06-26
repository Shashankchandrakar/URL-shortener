package com.system.design.service;

public interface URLService {

    String getHashForURL(String url);

    String getURLFromHash(String hash);
}
