package com.example.demo.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private Long id;
    private String label;
    private String description;
    List<Appareil> appareils;
}
