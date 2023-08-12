package com.bootcoding.leetcode;

public class Dog {
    String name;
    String breed;
    int age;
    String color;

    // Constructor Declaration of Class
    public Dog(String name, String breed, int age,
               String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }


    public String getName() { return name; }


    public String getBreed() { return breed; }


    public int getAge() { return age; }


    public String getColor() { return color; }

    @Override public String toString()
    {
        return ("Hi my name is " + this.getName()
                + ".\nMy breed,age and color are "
                + this.getBreed() + "," + this.getAge()
                + "," + this.getColor());
    }

    public static void main(String[] args)
    {
        Dog tuffy
                = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}
