package com.api.cardapio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;




@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_prato_principal", schema = "cardapio")
public class PratoPrincipal {

    @Id
    @Column(columnDefinition = "bigserial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private String imagem;

    private LocalDate data;


}
