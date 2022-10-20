package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SquareController {
    private static final String template = "Number: %s";
    private static AtomicLong counter = new AtomicLong();

    @GetMapping("/square")
    public Square square(@RequestParam(value = "number", defaultValue = "2") long number){
        return new Square(counter.incrementAndGet(), number);
    }
}
