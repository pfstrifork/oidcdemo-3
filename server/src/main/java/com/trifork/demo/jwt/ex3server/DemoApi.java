package com.trifork.demo.jwt.ex3server;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApi {
    @RequestMapping(value = "/add/{x}/{y}", method = RequestMethod.GET)
    public ResponseEntity<String> add(@PathVariable("x") int x, @PathVariable("y") int y) {
        int sum = x + y;
        return new ResponseEntity<String>("" + sum, HttpStatus.OK);
    }
}
