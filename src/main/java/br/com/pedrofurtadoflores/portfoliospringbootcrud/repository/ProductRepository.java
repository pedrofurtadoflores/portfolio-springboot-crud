package br.com.pedrofurtadoflores.portfoliospringbootcrud.repository;

import br.com.pedrofurtadoflores.portfoliospringbootcrud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
