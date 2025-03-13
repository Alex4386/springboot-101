package com.guc.hw;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class School {
    private String name;
    private SchoolType type;

    public School(String name, SchoolType type) {
        this.name = name;
        this.type = type;
    }
}
