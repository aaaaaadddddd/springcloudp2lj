package com.ecology.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-04-30 22:57:37
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain=true)
public class User implements Serializable {
    private static final long serialVersionUID = -87397102314854998L;
    
    private Integer id;
    
    private String name;
    
    private Integer age;
    
    private String classes;
    
    private String groupss;
    
    private Integer gender;

}