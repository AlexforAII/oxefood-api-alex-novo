package br.com.ifpe.oxefood.api.entregador;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.entregador.Entregador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EntregadorRequest {

  private String nome;

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate dataNascimento;

  private String cpf;

  private int RG;

  private String foneCelular;

  private String foneFixo;

  private int QTDEntregasRealizadas;

  private boolean valorPorFrete;

  private String rua;

  private int numero;

  private String bairro;

  private String cidade;
  private int CEP;
  private String UF;
  private String complemento;

  public Entregador build() {

    return Entregador.builder()
        .nome(nome)
        .dataNascimento(dataNascimento)
        .cpf(cpf)
        .RG(RG)
        .foneCelular(foneCelular)
        .foneFixo(foneFixo)
        .QTDEntregasRealizadas(QTDEntregasRealizadas)
        .valorPorFrete(valorPorFrete)
        .rua(rua)
        .numero(numero)
        .bairro(bairro)
        .cidade(cidade)
        .CEP(CEP)
        .UF(UF)
        .complemento(complemento)
        .build();
  }

}
