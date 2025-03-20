package com.example.demo;
// Person class with an additional address field
public class Person {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}

class Student extends Person {
    private String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId;
    }
}

class PersonFactory {
    public static Person createDefaultPerson() {
        Person person = new Person();
        person.setName("Default Name");
        person.setAge(30);
        person.setAddress("Default Address");
        return person;
    }
}

class Container<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

// public class Main {
//     public static void main(String[] args) {
//         Person person = new Person();
//         person.setName("John");
//         person.setAge(25);
//         person.setAddress("New York");

//         System.out.println(person);

//         Student student = new Student();
//         student.setName("Alice");
//         student.setAge(20);
//         student.setAddress("California");
//         student.setStudentId("S12345");

//         System.out.println(student);

//         Person defaultPerson = PersonFactory.createDefaultPerson();
//         System.out.println(defaultPerson);

//         Container<Person> personContainer = new Container<>();
//         personContainer.setItem(person);
//         System.out.println("Stored Person: " + personContainer.getItem());

//         Container<Student> studentContainer = new Container<>();
//         studentContainer.setItem(student);
//         System.out.println("Stored Student: " + studentContainer.getItem());
//     }
// }
