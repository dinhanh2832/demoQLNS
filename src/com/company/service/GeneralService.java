package com.company.service;

public interface GeneralService<T> {
    void add(T t);
    void print();
    int find( int t);
    void update(int id,T t);
    void delete(int id);
}
