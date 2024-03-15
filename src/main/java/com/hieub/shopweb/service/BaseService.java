package com.hieub.shopweb.service;

import java.util.List;

public interface BaseService<E> {
    public List<E> getAll();
    public E getById(int id);
    public boolean checkExisted(int id);
    public boolean add(E e);
    public boolean update(int id, E e);
    public  boolean remove(int id);
}

