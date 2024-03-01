package com.api.cardapio.model;


import com.api.cardapio.model.dto.FoodRequestDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.Length;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_cardapio", schema = "cardapio" )
public class Food {

    @Id
    @Column(columnDefinition = "bigserial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Length(max = 30, message = "Máximo 30 caracteres")
    @NotNull(message = "Campo titulo não pode ser nulo")
    private String titulo;

    @Length(max = 30, message = "Máximo 30 caracteres")
    @NotBlank(message = "Campo descricao não pode ser nulo")
    private String descricao;

    private String imagem;

    public Food(FoodRequestDTO data){
        this.titulo = data.titulo();
        this.descricao = data.descricao();
        this.imagem = data.imagem();
    }

    public Food(String titulo, String descricao, String imagem) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.imagem = imagem;
    }
}

