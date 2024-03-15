package com.hieub.shopweb.service.impl;

import com.hieub.shopweb.model.Product;
import com.hieub.shopweb.repository.ProductRepository;
import com.hieub.shopweb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    public ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(int id) {
        try{
            return productRepository.findById(id).get();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean checkExisted(int id) {
        return productRepository.existsById(id);
    }

    @Override
    public boolean add(Product product) {
        try{
            productRepository.save(product);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean update(int id, Product product) {
        try{
            if (this.checkExisted(id)){
                productRepository.save(product);
            }
            return true;
        }catch (Exception e){
            e.getMessage();
        }
        return false;
    }

    @Override
    public boolean remove(int id) {
        try{
            if (this.checkExisted(id)){
                productRepository.deleteById(id);
            }
            return true;
        }catch (Exception e){
            e.getMessage();
        }
        return false;
    }
}
