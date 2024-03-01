package com.api.cardapio.services;

import com.api.cardapio.model.Food;
import com.api.cardapio.model.dto.FoodResponseDTO;
import com.api.cardapio.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class FoodService {

    private final FoodRepository foodRepository;


    public List<Food> findAll() {
        return foodRepository.findAll();
    }


    public FoodResponseDTO registerFood(Food food) {

        Food saveFood = foodRepository.save(food);

        FoodResponseDTO foodResponseDTO = new FoodResponseDTO(
                saveFood.getId(),
                saveFood.getTitulo(),
                saveFood.getDescricao(),
                saveFood.getImagem()
        );

        return foodResponseDTO;
    }

}
