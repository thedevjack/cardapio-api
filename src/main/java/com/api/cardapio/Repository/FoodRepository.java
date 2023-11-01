package com.api.cardapio.Repository;

import com.api.cardapio.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
