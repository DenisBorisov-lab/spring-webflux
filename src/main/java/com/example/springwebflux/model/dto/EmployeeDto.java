package com.example.springwebflux.model.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class EmployeeDto {
    private Long id;
    private String name;
    private String address;
    private Integer organizationId;
}
