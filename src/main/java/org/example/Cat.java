package org.example;

import java.util.Objects;

public class Cat {
    /**
    * Кличка
     */
    String name;
    /**
     * Кличка
     */
    String gender;
    /**
     Цвет кота
     */
    String color;
    /**
     Возраст
     */
    int weight;

    public  Cat(){

    }
    public Cat(String name, String gender, String color, int weight){
        this.name = name;
        this.gender = gender;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "Кличка:" + name +
                ", Пол:" + gender +
                ", Цвет:" + color +
                ", Возраст:" + weight + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && Objects.equals(name, cat.name) && Objects.equals(gender, cat.gender) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, color, weight);
    }
}
