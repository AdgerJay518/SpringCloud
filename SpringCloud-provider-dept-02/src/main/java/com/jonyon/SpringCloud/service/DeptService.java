package com.jonyon.SpringCloud.service;

import com.jonyon.SpringCloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    boolean addDept(Dept dept);
    Dept findById(Long id);
    List<Dept> findAll();
}
