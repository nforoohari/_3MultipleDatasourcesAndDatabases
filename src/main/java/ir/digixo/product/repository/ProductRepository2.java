package ir.digixo.product.repository;

import ir.digixo.product.entity.Product;
import ir.digixo.product.entity.Product2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository2 extends JpaRepository<Product2,Long> {
}
