package com.example.springwebflux.model.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Accessors(chain = true)
@Table("employee")
public class Employee {
    @Id
    @Column("id")
    private Long id;
    @Column("name")
    private String name;
    @Column("address")
    private String address;
    @Column("organization_id")
    private Integer organizationId;
}
