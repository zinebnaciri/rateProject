package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Appareil {

    private Long id;
    private String name;
    private String description;
    private boolean state;
    private Category category;

}
