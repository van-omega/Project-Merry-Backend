package com.omega.springboot.merry.constants;

public enum SexCategoryEnum {
    MALE ("Male"),
    FEMALE ("Female");

    private String description;

    SexCategoryEnum(String description) {
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
