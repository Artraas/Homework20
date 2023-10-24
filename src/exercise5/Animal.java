package exercise5;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private Boolean isTale;

    public Animal(String name, int age, Boolean isTale) {
        this.name = name;
        this.age = age;
        this.isTale = isTale;
    }

    @Override
    public String toString() {
        String value = "Ім'я: " + name +
                ", вік: " + age +
                ", хвіст: ";
        if (isTale){
            value += "так";
        } else {
            value += "ні";
        }
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(isTale, animal.isTale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isTale);
    }
}
