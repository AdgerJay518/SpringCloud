package com.jonyon.SpringCloud.Controller;

import com.jonyon.SpringCloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    //private static final String REST_URL_PRE="http://localhost:8081";

    private static final String REST_URL_PRE="http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PRE+"/dept/find/"+id,Dept.class);
    }

    @RequestMapping("/consumer/dept/get")
    public List<Dept> getAll(){
        return restTemplate.getForObject(REST_URL_PRE+"/dept/find/",List.class);
    }

    @RequestMapping("/consumer/dept/add")
    public Boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PRE+"/dept/add/",dept,Boolean.class);
    }
}
