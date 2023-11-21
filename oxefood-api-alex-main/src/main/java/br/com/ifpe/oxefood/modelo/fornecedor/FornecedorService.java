package br.com.ifpe.oxefood.modelo.fornecedor;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class FornecedorService {
  @Autowired
  private FornecedorRepository repository;
// metudo cadastrar fornecedor
  @Transactional
  public Fornecedor save(Fornecedor fornecedor) {

    fornecedor.setHabilitado(Boolean.TRUE);
    fornecedor.setVersao(1L);
    fornecedor.setDataCriacao(LocalDate.now());
    return repository.save(fornecedor);
  }
//listar fornecedores
  public List<Fornecedor> findAll() {

    return repository.findAll();
  }

  public Fornecedor findById(Long id) {

    return repository.findById(id).get();
  }

}
