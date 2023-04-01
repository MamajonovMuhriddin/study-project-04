package main.java;

import java.util.Objects;

public class Person {
    private String name;
    private Integer age;
    private String secondName;

    public Person(String name, Integer age, String secondName) {
        this.name = name;
        this.age = age;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;

        if (!Objects.equals(name, person.name)) return false;
        if (!Objects.equals(age, person.age)) return false;
        return Objects.equals(secondName, person.secondName);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
