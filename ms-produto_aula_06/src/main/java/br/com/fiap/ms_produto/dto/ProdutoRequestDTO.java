package br.com.fiap.ms_produto.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record ProdutoRequestDTO(
        @NotBlank(message = "Campo requerido!")
        @Size(min=3, max = 100, message = "O nome deve ter entre 3 e 100 caracters")
        String nome,

        @NotBlank(message = "Campo requerido!")
        @Size(min=10, max = 100, message = "A descricação deve ter entre 10 e 100 caracters")
        String descricao,

        @NotNull(message = "Campo requerido!")
        @Positive(message = "O preço deve ser um valor positivo maior que zero")
        Double valor) {
}
