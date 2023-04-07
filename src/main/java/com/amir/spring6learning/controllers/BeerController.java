package com.amir.spring6learning.controllers;

import com.amir.spring6learning.domain.Beer;
import com.amir.spring6learning.services.BeerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/Beer")
public class BeerController {
    private final BeerService beerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Beer> listBeers() {
        return beerService.listBeer();
    }

    @RequestMapping(value = "{beerId}", method = RequestMethod.GET)
    public Beer getBeerById(@PathVariable("beerId") UUID beerId) {
        return beerService.getBeerById(beerId);
    }

    @PostMapping
    public ResponseEntity createNewBeer(@RequestBody Beer beer){
        beerService.createNewBeer(beer);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location","/api/v1/beer/" + beer.getId().toString());
        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }
}
