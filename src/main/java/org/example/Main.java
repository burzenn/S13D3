package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Person person1 = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());

        Person person2 = new Person("Jane", "Doe", 25, false, "XX Street ", 533333333);
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Teen: " + person2.isTeen());
        System.out.println("Address: " + person2.getAddress());
        System.out.println("Phone: " + person2.getPhone());

        Person person3 = new Person("Jack", "Doe", 17, true, "YY Street", 536666666);
        System.out.println("Firstname: " + person3.getFirstName());
        System.out.println("LastName: " + person3.getLastName());
        System.out.println("Age: " + person3.getAge());
        System.out.println("Teen: " + person3.isTeen());
        System.out.println("Address: " + person3.getAddress());
        System.out.println("Phone: " + person3.getPhone());


        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());




    }


}
