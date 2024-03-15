package com.hieub.shopweb.service.impl;

import com.hieub.shopweb.model.Category;
import com.hieub.shopweb.repository.CategoryRepository;
import com.hieub.shopweb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    public CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(int id) {
        try{
            return categoryRepository.findById(id).get();
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public boolean checkExisted(int id) {
        return categoryRepository.existsById(id);
    }

    @Override
    public boolean add(Category category) {
        try{
            categoryRepository.save(category);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean update(int id, Category category) {
        try{
            if (this.checkExisted(id)){
                categoryRepository.save(category);
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
                categoryRepository.deleteById(id);
            }
            return true;
        }catch (Exception e){
            e.getMessage();
        }
        return false;
    }
}
