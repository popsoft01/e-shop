package com.example.shop.data.repository;

import com.example.shop.data.model.Currency;
import com.example.shop.data.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
@Sql(scripts = {"/db/insert.sql"})
class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepositoryImpl;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void createProductTest(){
        Product product = new Product();
        product.setName("Luxury Sofa");
        product.setPrice(500D);
        product.setCurrency(Currency.NGN);
        product.setDetails("");

        assertThat(product).isNotNull();
        assertThat(product.getId()).isNull();
        log.info("Product before saving -> {}", product);
        productRepositoryImpl.save(product);
        assertThat(product.getId()).isNotNull();
        log.info("huger ->{}",product);
    }

    @Test
    @Transactional
    public void testNew(){
        List<Product> products = productRepositoryImpl.findAll();
        assertThat(products).hasSize(5);
        log.info("Product returned from database -> {}", products);
    }
}