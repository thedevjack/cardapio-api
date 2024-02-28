package com.api.cardapio.controller;


import com.api.cardapio.model.Food;
import com.api.cardapio.model.dto.FoodRequestDTO;
import com.api.cardapio.model.dto.FoodResponseDTO;
import com.api.cardapio.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cardapio")
public class FoodController {

    private final FoodRepository repository;

    @PostMapping("/create")
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }

    @GetMapping
    public List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}