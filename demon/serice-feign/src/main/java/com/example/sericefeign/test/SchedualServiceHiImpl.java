package com.example.sericefeign.test;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiImpl implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
