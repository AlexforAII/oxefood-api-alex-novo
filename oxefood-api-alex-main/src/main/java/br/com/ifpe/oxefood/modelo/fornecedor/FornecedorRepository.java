package br.com.ifpe.oxefood.modelo.fornecedor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
//tipo da chave primaria do fornecedor é long
}
