package br.com.ifpe.oxefood.api.produto;

import br.com.ifpe.oxefood.modelo.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequest {
  private Long idCategoria;

  private String titulo;

  private String codigoProduto;

  private String descricao;

  private double valorUnitario;

  private double TempoEntregaMinimaEmMinutos;

  private double TempoEntregaMaximaEmMinutos;

  public Produto build() {

    return Produto.builder()
        .titulo(titulo)
        .codigoProduto(codigoProduto)
        .descricao(descricao)
        .valorUnitario(valorUnitario)
        .TempoEntregaMinimaEmMinutos(TempoEntregaMinimaEmMinutos)
        .TempoEntregaMaximaEmMinutos(TempoEntregaMaximaEmMinutos)
        .build();
  }

}
