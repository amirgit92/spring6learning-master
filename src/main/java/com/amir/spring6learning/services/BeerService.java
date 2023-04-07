package com.amir.spring6learning.services;

import com.amir.spring6learning.domain.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {
    List<Beer> listBeer();

    Beer getBeerById(UUID id);

    Beer createNewBeer(Beer beer);
}
