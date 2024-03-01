package com.api.cardapio.controller;

import com.api.cardapio.model.Food;
import com.api.cardapio.model.dto.FoodRequestDTO;
import com.api.cardapio.model.dto.FoodResponseDTO;
import com.api.cardapio.services.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/cardapio")
public class FoodController {

    private final FoodService foodService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(foodService.findAll());
    }

    @PostMapping("/create")
    public ResponseEntity<FoodResponseDTO> registerFood(@RequestBody FoodRequestDTO foodRequestDTO){

        Food food = foodRequestDTO.toModel();
        FoodResponseDTO foodSave = foodService.registerFood(food);

        return ResponseEntity.ok().body(foodSave);

    }


}