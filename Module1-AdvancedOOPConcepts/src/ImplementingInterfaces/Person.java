package ImplementingInterfaces;

abstract class Person {
    //declare Person attributes name and age here
    String name;
    int age;
    void getDetails() {
        //print name and age
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
}