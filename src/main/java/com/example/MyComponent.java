package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyComponent {

    @Autowired
    public MyComponent(ApplicationArguments args) {
        boolean enable = args.containsOption("enable");
        if (enable) {
            System.out.println("----- you are enable");
        }
        List<String> _args = args.getNonOptionArgs();
        _args.forEach(option -> System.out.println("testtt"));
    }
}