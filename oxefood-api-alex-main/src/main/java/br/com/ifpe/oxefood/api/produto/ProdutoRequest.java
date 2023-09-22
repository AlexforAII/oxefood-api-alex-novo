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

  private String titulo;

  private String codProduto;

  private String descricao;

  private double valorUnitario;

  private double TempoEntregaMinimaEmMinutos;

  private double TempoEntregaMaximaEmMinutos;

  public Produto build() {

    return Produto.builder()
        .titulo(titulo)
        .codProduto(codProduto)
        .descricao(descricao)
        .valorUnitario(valorUnitario)
        .TempoEntregaMinimaEmMinutos(TempoEntregaMinimaEmMinutos)
        .TempoEntregaMaximaEmMinutos(TempoEntregaMaximaEmMinutos)
        .build();
  }

}
