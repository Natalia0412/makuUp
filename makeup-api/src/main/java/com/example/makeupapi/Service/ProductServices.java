package com.example.makeupapi.Service;

import com.example.makeupapi.Model.Product;
import com.example.makeupapi.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository repository;
    public Product getById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Product> getAllProducts() {
        return  repository.findAll();
    }

    public Product updateProduct(Product request, Integer id) {
        getById(id);
        request.setId(id);
        return  repository.save(request);
    }

    public Product inserirProduct(Product insertProduct) {
        return repository.save(insertProduct);

    }

    public void deletarProduct(Integer id) {
        getById(id);
        repository.deleteById(id);
    }

    public void seed() {
    }
}
