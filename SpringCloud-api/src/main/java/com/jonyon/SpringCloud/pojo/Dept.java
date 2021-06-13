package com.jonyon.SpringCloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 实体类
 * @author 吴政杰
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable {
    private Long deptno;
    private String deptname;
    private String db_source;


}
