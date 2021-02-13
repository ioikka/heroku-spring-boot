package io.ikka.demo.herokuspringboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/time")
public class TimeController {

    @GetMapping
    public ResponseEntity<String> time() {
        return ResponseEntity.ok(LocalDateTime.now().toString());
    }
}
