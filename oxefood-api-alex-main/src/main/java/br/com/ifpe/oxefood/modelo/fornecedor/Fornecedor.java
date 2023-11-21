package br.com.ifpe.oxefood.modelo.fornecedor;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Fornecedor")
@Where(clause = "habilitado = true")
public class Fornecedor extends EntidadeAuditavel {

//criar coluna na tebela
  @Column
  private String nome;

  @Column
  private String endereco;

  @Column
  private LocalDate dataFundacao;

  @Column
  private Double valorMercado;

  @Column
  private String paginaWeb;

  @Column
  private String contatoVendedor;

}
