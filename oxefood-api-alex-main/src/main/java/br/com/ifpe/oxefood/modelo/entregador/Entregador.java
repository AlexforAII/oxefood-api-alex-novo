package br.com.ifpe.oxefood.modelo.entregador;

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
@Table(name = "Entregador")
@Where(clause = "habilitado = true")
public class Entregador extends EntidadeAuditavel {

  @Column
  private String nome;

  @Column
  private LocalDate dataNascimento;

  @Column
  private int RG;

  @Column
  private String cpf;

  @Column
  private String foneCelular;

  @Column
  private String foneFixo;

  @Column
  private int QTDEntregasRealizadas;

  @Column
  private boolean ValorPorFrete;

  @Column
  private String Rua;

  @Column
  private int Numero;

  @Column
  private String Bairro;

  @Column
  private String Cidade;

  @Column
  private int CEP;

  @Column
  private String UF;

  @Column
  private String complemento;

}
