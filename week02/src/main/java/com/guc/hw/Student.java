package com.guc.hw;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {
    private String id;
    private String name;
    private School school;
    private Department department;
}
