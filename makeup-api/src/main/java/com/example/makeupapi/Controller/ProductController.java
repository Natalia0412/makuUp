package com.example.makeupapi.Controller;

import com.example.makeupapi.Model.Product;
import com.example.makeupapi.Service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api-make-up/product")
public class ProductController {
    @Autowired
    private ProductServices productService;
    @RequestMapping("/{id}")
    public Product getById(@PathVariable("id") Integer id){
        return  productService.getById(id);
    }
    @GetMapping
    public List<Product> getAllProducts(){
        return productService. getAllProducts();
    }
    @PutMapping("/{id}")
    public  Product updateProduct(@RequestBody Product request, @PathVariable ("id") Integer id){
        return  productService.updateProduct(request,id);
    }
    @PostMapping
    public  Product inserirProduct(@RequestBody Product insertProduct){
        return  productService.inserirProduct(insertProduct);
    }
    @DeleteMapping("/{id}")
    public void deletarProduct(@PathVariable("id") Integer id){
        productService.deletarProduct(id);
    }

    @PostMapping("/seed")
    public void seed(){
        productService.seed();
    }
}
