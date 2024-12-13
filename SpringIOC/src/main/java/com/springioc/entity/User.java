package com.springioc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
@Scope(value = "prototype")
public class User {
    private String name;
    private Integer age;

    public User() {
        System.out.println("UserInit");
    }
}
