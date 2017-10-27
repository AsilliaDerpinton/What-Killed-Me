package com.company.Controllers;

import com.company.model.Greeting;
import com.company.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PotatoController {

    @Autowired
    GreetingRepository repo;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/potato")
    public Greeting potato(@RequestParam(value="Patat", defaultValue="Derpington") String name) {

        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}