package com.api.cardapio.model.dto;

import com.api.cardapio.model.Food;

public record FoodRequestDTO(
        String titulo,
        String descricao,
        String imagem) {


    public Food toModel(){
        return new Food(titulo, descricao, imagem);
    }

}
