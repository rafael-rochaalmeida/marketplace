package br.com.marketplace.repository;

import br.com.marketplace.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositry extends JpaRepository<Produto, Integer> {
}
