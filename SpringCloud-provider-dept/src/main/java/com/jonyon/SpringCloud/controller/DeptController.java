package com.jonyon.SpringCloud.controller;

import com.jonyon.SpringCloud.pojo.Dept;
import com.jonyon.SpringCloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 吴政杰
 */
@RestController
public class DeptController {
    @Autowired
    DeptService deptService;

    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/find/{id}")
    public Dept findById(@PathVariable("id") Long id){
        return deptService.findById(id);
    }

    @GetMapping("/dept/find")
    public List<Dept> findAll(){
        return deptService.findAll();
    }
}
