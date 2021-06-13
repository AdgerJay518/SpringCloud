package com.jonyon.SpringCloud.Controller;

import com.jonyon.SpringCloud.pojo.Dept;
import com.jonyon.SpringCloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService service;

    @RequestMapping("/feign/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @RequestMapping("/feign/dept/get")
    public List<Dept> getAll(){

        return service.findAll();
    }

    @RequestMapping("/feign/dept/add")
    public Boolean add(Dept dept){

        return service.addDept(dept);
    }
}
