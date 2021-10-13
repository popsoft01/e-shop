package com.example.shop.data.web.Controller;

import com.example.shop.data.model.Product;
import com.example.shop.data.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productServiceimpl;

    @GetMapping("/")
    public List<Product> getAll(){
        return productServiceimpl.findAll();
    }

    @PostMapping("/")
    public  Product save(@RequestBody Product product){
        log.info("Product request -> {}", product);
        return  productServiceimpl.save(product);
    }

}
