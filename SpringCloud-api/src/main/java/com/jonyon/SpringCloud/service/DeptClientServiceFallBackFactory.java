package com.jonyon.SpringCloud.service;

import com.jonyon.SpringCloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept findById(Long id) {
                return new Dept(id,"客户端提供了服务降级，这个服务已被关闭","服务已被关闭");
            }

            @Override
            public List<Dept> findAll() {
                return null;
            }

            @Override
            public Boolean addDept(Dept dept) {
                return null;
            }
        };
    }
}
