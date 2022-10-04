package com.example.demoFeignAirline.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demoFeignAirline.client.ApiClient;


@RestController
@RequestMapping(value = "/airlines")
public class AirlineController {
    private final ApiClient apiClient;
    
    public AirlineController (ApiClient apiClient) {
    	this.apiClient = apiClient;
    }
    @GetMapping("/{airlineId}")
    public ResponseEntity readAirlineData (@RequestParam("airlineId") String airlineId) {
        if (airlineId == null) {
            return ResponseEntity.ok(apiClient.readAirLines());
        }
        return ResponseEntity.ok(apiClient.readAirLineById(airlineId));
    }
  
}