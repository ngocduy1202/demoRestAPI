package com.example.udacity.demo.demoRestAPI.service;

import com.example.udacity.demo.demoRestAPI.model.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
