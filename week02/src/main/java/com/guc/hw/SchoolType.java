package com.guc.hw;

public enum SchoolType {
    KINDERGARTEN(true),
    ELEMENTARY(true),
    MIDDLE(true),
    HIGH(true),
    UNIVERSITY(false);

    boolean isK12 = false;

    SchoolType(boolean isK12) {
        this.isK12 = isK12;
    }
}
