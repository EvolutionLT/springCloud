package com.lt.sericefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric  implements  SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name+"system error feign";
    }
}
