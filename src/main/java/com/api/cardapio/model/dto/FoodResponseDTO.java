package com.api.cardapio.model.dto;

import com.api.cardapio.model.Food;

public record FoodResponseDTO(Long id, String titulo, String descricao, String imagem) {

    public FoodResponseDTO(Food food) {
        this(
                food.getId(),
                food.getTitulo(),
                food.getDescricao(),
                food.getImagem());
    }
}
