package com.icss.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Animals {
    private Integer id;
    private String name;
    private Integer age;
    private String type;
}
