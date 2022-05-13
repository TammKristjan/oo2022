package ee.kristjan.webshop.controller;

import ee.kristjan.webshop.model.Product;
import ee.kristjan.webshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("products") // localhost:8080/products   GET
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping("products/{index}") // localhost:8080/products/1  GET
    public Product getProduct(@PathVariable Long index) {
        return productRepository.findById(index).get();
    }

    @DeleteMapping("products/{index}") // localhost:8080/products/1 DELETE
    public List<Product> deleteProduct(@PathVariable Long index) {
        productRepository.deleteById(index);
        return productRepository.findAll();
    }

    @DeleteMapping("products")  // localhost:8080/products   DELETE
    public String deleteAllProduct() {
        productRepository.deleteAll();
        return "Kõik tooted kustutatud";
    }

    @PostMapping("products") // localhost:8080/products  POST
    public void addProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

    @PutMapping("products/") // localhost:8080/products  PUT
    public void editProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

    @PostMapping("add-all-products") // localhost:8080/products  POST
    public void addAllProducts(@RequestBody List<Product> products) {
        productRepository.saveAll(products);
    }

}
