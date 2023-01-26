package com.example.auto.Models;

import jakarta.persistence.*;

@Entity(name = "cars")
@Table(name = "cars")
public class CarModel {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public CarModel() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    @Column(name = "Car_name")
    private String name;
    private String type;
    private String Color;
    private String Model;

    public CarModel(String name, String type, String color, String model) {
        this.name = name;
        this.type = type;
        Color = color;
        Model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", Color='" + Color + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}
