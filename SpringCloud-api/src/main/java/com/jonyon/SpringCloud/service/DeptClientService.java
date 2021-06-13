package com.jonyon.SpringCloud.service;

import com.jonyon.SpringCloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {

    @GetMapping("/dept/find/{id}")
    Dept findById(@PathVariable("id") Long id);

    @GetMapping("/dept/find")
    List<Dept> findAll();

    @PostMapping("/dept/add")
    Boolean addDept(Dept dept);
}
