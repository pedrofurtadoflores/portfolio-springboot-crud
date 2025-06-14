package br.com.pedrofurtadoflores.portfoliospringbootcrud.service;

import br.com.pedrofurtadoflores.portfoliospringbootcrud.dto.request.ProductRequestDTO;
import br.com.pedrofurtadoflores.portfoliospringbootcrud.dto.response.ProductResponseDTO;

import java.util.List;

public interface ProductService {

    List<ProductResponseDTO> getAll();

    ProductResponseDTO getById(Long id);

    ProductResponseDTO create(ProductRequestDTO dto);

    ProductResponseDTO update(Long id, ProductRequestDTO dto);

    void delete(Long id);
}
