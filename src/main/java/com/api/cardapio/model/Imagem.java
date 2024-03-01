package com.api.cardapio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_banco_imagem", schema = "cardapio")
public class Imagem {

    private Long id;

    private String imagem;

}
