package br.com.alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Marca(@JsonAlias("codigo") String codigo,
                    @JsonAlias("nome") String nome) {

}
