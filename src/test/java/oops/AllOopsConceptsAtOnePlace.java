package oops;


class AllOopsConceptsAtOnePlace {

    public static void main(String[] args) {

        // Encapsulation
        Person person = new Person("John", 25);
        System.out.println(person.getName() + " is " + person.getAge() + " years old.");

        // Inheritance
        Student student = new Student("Alice", 20, "12345");
        System.out.println(student.getName() + " is a student with ID " + student.getStudentId());

        // Polymorphism
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Square area: " + square.calculateArea());

        // Abstraction
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}

// Encapsulation
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Inheritance
class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }
}

// Polymorphism
abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Abstraction
abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
