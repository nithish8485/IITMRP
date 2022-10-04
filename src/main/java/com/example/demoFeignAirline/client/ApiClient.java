package com.example.demoFeignAirline.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demoFeignAirline.model.Airline;

import java.util.List;
@FeignClient(value = "instantwebtools-api", url = "https://api.instantwebtools.net/v1/")
public interface ApiClient {
    @RequestMapping(method = RequestMethod.GET, value = "/airlines")
    List<Airline> readAirLines();
    @RequestMapping(method = RequestMethod.GET, value = "/airlines/{airlineId}")
    Airline readAirLineById(@PathVariable("airlineId") String airlineId);
    @RequestMapping(method = RequestMethod.GET, value = "/airlines/{airlinename}")
    Airline readAirLineByname(@PathVariable("airlinename") String airlinename);
}