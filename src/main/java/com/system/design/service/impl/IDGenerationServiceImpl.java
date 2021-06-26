package com.system.design.service.impl;

import com.system.design.service.IDGenerationService;
import org.springframework.stereotype.Service;

@Service
public class IDGenerationServiceImpl implements IDGenerationService {

    //todo replace this with proper system that store the id in zookepper and return it
    private long ID = 12345;

    public synchronized long getIdForURL() {
        return ID++;
    }
}
