package com.api.cardapio.food;


import jakarta.persistence.*;

@Table(name = "tb_cardapio")
@Entity(name= "tb_cardapio")

public class Food {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Integer price;

}
