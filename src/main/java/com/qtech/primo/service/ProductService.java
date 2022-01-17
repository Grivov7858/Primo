package com.qtech.primo.service;

import com.qtech.primo.model.entity.Product;
import com.qtech.primo.model.request.ProductRequest;
import com.qtech.primo.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ProductRepository productRepository;

    public void createNewProduct(final ProductRequest productRequest) {
        Product product = modelMapper.map(productRequest, Product.class);

        productRepository.saveAndFlush(product);
    }
}
