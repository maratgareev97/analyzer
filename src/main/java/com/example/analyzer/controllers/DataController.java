package com.example.analyzer.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/data")
public class DataController {

    private final List<String> dataList = new ArrayList<>();

    @GetMapping
    public List<String> getData() {
        return dataList;
    }

    @PostMapping
    public ResponseEntity<String> addData(@RequestBody String data) {
        dataList.add(data);
        return ResponseEntity.ok("Data added successfully");
    }
}