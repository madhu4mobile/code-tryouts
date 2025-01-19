package Udemy.CodingExcercises.section7;

/*
Static Variables aren't very often but can sometimes be very useful.

They can be used for :
    Storing counters.
    Generating unique IDs.
    Storing a constant value that does not change, like PI for example.
    Creating and controlling access to a shared resource, like logfile, a database or input/output stream.,

*/

    class Dog{
        private static String name;

        public Dog(String name){
            Dog.name = name;
        }
        public void printName() {
            System.out.println("Dog.name = " + name); // using class name here will make less confusing.
        }
    }

    class Main {
        public static void main(String[] args){
            Dog rex = new Dog("rex");                   // creates instance (rex)
            Dog fluffy = new Dog("fluffy");             // creates instance (fluffy)
            rex.printName();                                   // prints fluffy --> this is because static variables share the instance
                                                        // so this will share the latest instance fluffy by static.
            fluffy.printName();                                // prints fluffy

        }

}


