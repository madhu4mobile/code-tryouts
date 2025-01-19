package Udemy.CodingExcercises.section7;

/*
Instance Variables aren't very often but can sometimes be very useful.

They can be used for :
    Storing counters.
    Generating unique IDs.
    Storing a constant value that does not change, like PI for example.
    Creating and controlling access to a shared resource, like logfile, a database or input/output stream.,

*/

class Dog2{
    private final String name2;

    public Dog2(String name2) {
        this.name2 = name2;
    }
    public void printName() {
        System.out.println("Dog2.name2 = " + name2); // using class name Dog2.name2 here will make less confusing.
    }
}

class Main2 {
    public static void main(String[] args){
        Dog2 rex2 = new Dog2("rex2");                   // creates instance (rex)
        Dog2 fluffy2 = new Dog2("fluffy2");             // creates instance (fluffy)
        rex2.printName();                                   // prints rex2 --> this is because this time it is not static but it is instant variable.
        // so this will share the latest instance fluffy by static.
        fluffy2.printName();                                // prints fluffy2

    }

}



