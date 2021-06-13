package com.jonyon.SpringCloud.controller;

import com.jonyon.SpringCloud.pojo.Dept;
import com.jonyon.SpringCloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



/**
 * @author 吴政杰
 */
@RestController
public class DeptController {
    @Autowired
    DeptService deptService;


    @HystrixCommand(fallbackMethod = "hystrixGet")
    @RequestMapping("/dept/find/{id}")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.findById(id);
        if (dept==null){
            throw new RuntimeException("此id=>"+id+",不存在");
        }
        return dept;
    }

    /**
     * 根据id查询备选方案(熔断)
     */
    public Dept hystrixGet(@PathVariable("id") Long id){
        return new Dept(id,"没有该姓名","没有该数据库");
    }
}
