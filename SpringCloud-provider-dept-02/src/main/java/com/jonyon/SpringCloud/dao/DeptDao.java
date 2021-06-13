package com.jonyon.SpringCloud.dao;

import com.jonyon.SpringCloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 吴政杰
 */
@Mapper
@Repository
public interface DeptDao {
    boolean addDept(Dept dept);
    Dept findById(Long id);
    List<Dept> findAll();
}
