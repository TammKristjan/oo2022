package ee.kristjan.webshop.repository;

import ee.kristjan.webshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    //Product getProductBy;
}
